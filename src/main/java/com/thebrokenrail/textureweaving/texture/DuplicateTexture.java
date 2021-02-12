package com.thebrokenrail.textureweaving.texture;

public class DuplicateTexture extends Texture {
    private final String name;
    private final int width;
    private final int height;

    public DuplicateTexture(String name, String cutName, int expectedWidth, int expectedHeight) {
        super(name, expectedWidth, expectedHeight);
        this.name = cutName;
        width = expectedWidth;
        height = expectedHeight;
    }
    public DuplicateTexture(String name, int expectedWidth, int expectedHeight) {
        this(name, name, expectedWidth, expectedHeight);
    }

    @Override
    protected void build() {
        rect(name, 0, 0, width, height);
    }
}
