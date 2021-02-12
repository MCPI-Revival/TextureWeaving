package com.thebrokenrail.textureweaving.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Util {
    public static void checkSize(BufferedImage image, File file, int[] size) {
        if (size[0] != image.getWidth() || size[1] != image.getHeight()) {
            System.err.println(file + " Has Invalid Dimensions, Expected " + size[0] + 'x' + size[1]);
            System.exit(1);
        }
    }

    public static BufferedImage load(File file) {
        System.out.println("Loading " + file);
        if (!file.exists() || file.isDirectory()) {
            System.err.println(file + " Does Not Exist Or Is A Directory");
            System.exit(1);
        }

        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            System.err.println("Unable To Load " + file + ": " + e);
            System.exit(1);
        }

        return image;
    }

    public static void create(File file) {
        System.out.println("Creating " + file);

        File parent = file.getParentFile();
        if (parent != null && !parent.exists() && !parent.mkdirs()) {
            System.err.println("Unable To Create " + parent);
            System.exit(1);
        }
    }

    public static void write(BufferedImage image, File file) {
        try {
            ImageIO.write(image, "png", file);
        } catch (IOException e) {
            System.err.println("Unable To Write " + file + ": " + e);
            System.exit(1);
        }
    }
}
