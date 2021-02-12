package com.thebrokenrail.textureweaving.texture;

import com.thebrokenrail.textureweaving.util.Util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class Texture {
    protected static class SelectionPart {
        private final int x;
        private final int y;
        private final int width;
        private final int height;

        public SelectionPart(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }
    protected static class Selection {
        private final String name;
        private final int x;
        private final int y;
        private final SelectionPart[] parts;

        public Selection(String name, int x, int y, SelectionPart[] parts) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.parts = parts;
        }

        // size[0] = Width
        // size[1] = Height
        private int[] getSize() {
            int[] size = new int[]{0, 0};
            for (SelectionPart part : parts) {
                size[0] = Math.max(size[0], (part.x + part.width));
                size[1] = Math.max(size[1], (part.y + part.height));
            }
            return size;
        }
    }

    private final int expectedWidth;
    private final int expectedHeight;
    private final String name;
    private final List<Selection> selections = new ArrayList<>();

    public Texture(String name, int expectedWidth, int expectedHeight) {
        this.name = name;
        this.expectedWidth = expectedWidth;
        this.expectedHeight = expectedHeight;
    }

    // size[0] = Width
    // size[1] = Height
    private int[] getSize() {
        int[] size = new int[]{0, 0};
        for (Selection selection : selections) {
            int[] selectionSize = selection.getSize();
            size[0] = Math.max(size[0], (selection.x + selectionSize[0]));
            size[1] = Math.max(size[1], (selection.y + selectionSize[1]));
        }
        return size;
    }

    protected final void add(Selection selection) {
        selections.add(selection);
    }
    protected void rect(String name, int x, int y, int width, int height) {
        SelectionPart part = new SelectionPart(0, 0, width, height);
        Selection selection = new Selection(name, x, y, new SelectionPart[]{part});
        add(selection);
    }

    protected abstract void build();

    // Init Texture
    public void init() {
        build();
        int[] requiredSize = getSize();
        if (requiredSize[0] > expectedWidth && requiredSize[1] > expectedHeight) {
            throw new RuntimeException("Required Size Is Greater Than Expected Size");
        }
    }

    public void cut(File input, File output) {
        input = new File(input, name + ".png");

        BufferedImage inputImage = Util.load(input);

        int[] size = new int[]{expectedWidth, expectedHeight};
        Util.checkSize(inputImage, input, size);

        for (Selection selection : selections) {
            File selectionOutput = new File(output, selection.name + ".png");

            Util.create(selectionOutput);

            size = selection.getSize();
            BufferedImage outputImage = new BufferedImage(size[0], size[1], BufferedImage.TYPE_INT_ARGB);

            for (SelectionPart part : selection.parts) {
                for (int x = 0; x < part.width; x++) {
                    for (int y = 0; y < part.height; y++) {
                        outputImage.setRGB(part.x + x, part.y + y, inputImage.getRGB(selection.x + part.x + x, selection.y + part.y + y));
                    }
                }
            }

            Util.write(outputImage, selectionOutput);
        }
    }

    public void stitch(File input, File output) {
        output = new File(output, name + ".png");

        Util.create(output);

        BufferedImage outputImage = new BufferedImage(expectedWidth, expectedHeight, BufferedImage.TYPE_INT_ARGB);

        for (Selection selection : selections) {
            File selectionInput = new File(input, selection.name + ".png");

            BufferedImage inputImage = Util.load(selectionInput);

            int[] size = selection.getSize();
            Util.checkSize(inputImage, selectionInput, size);

            for (SelectionPart part : selection.parts) {
                for (int x = 0; x < part.width; x++) {
                    for (int y = 0; y < part.height; y++) {
                        outputImage.setRGB(selection.x + part.x + x, selection.y + part.y + y, inputImage.getRGB(part.x + x, part.y + y));
                    }
                }
            }
        }

        Util.write(outputImage, output);
    }
}
