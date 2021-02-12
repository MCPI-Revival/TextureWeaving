package com.thebrokenrail.textureweaving.texture.builtin.atlas;

import com.thebrokenrail.textureweaving.texture.Texture;

public class ArtAtlas extends Texture {
    public ArtAtlas() {
        super("art/kz", 256, 256);
    }

    private void painting(String name, int x, int y, int width, int height) {
        rect("painting/" + name, x * 16, y * 16, width * 16, height * 16);
    }

    @Override
    protected void build() {
        painting("kebab", 0, 0, 1, 1);
        painting("aztec", 1, 0, 1, 1);
        painting("alban", 2, 0, 1, 1);
        painting("aztec2", 3, 0, 1, 1);
        painting("bomb", 4, 0, 1, 1);
        painting("plant", 5, 0, 1, 1);
        painting("wasteland", 6, 0, 1, 1);
        painting("back", 12, 0, 4, 4);
        painting("pool", 0, 2, 2, 1);
        painting("courbet", 2, 2, 2, 1);
        painting("sea", 4, 2, 2, 1);
        painting("sunset", 6, 2, 2, 1);
        painting("creebet", 8, 2, 2, 1);
        painting("wanderer", 0, 4, 1, 2);
        painting("graham", 1, 4, 1, 2);
        painting("skeleton", 12, 4, 4, 3);
        painting("fighters", 0, 6, 4, 2);
        painting("donkey_kong", 12, 6, 4, 3);
        painting("match", 0, 8, 2, 2);
        painting("bust", 2, 8, 2, 2);
        painting("stage", 4, 8, 2, 2);
        painting("void", 6, 8, 2, 2);
        painting("skull_and_roses", 8, 8, 2, 2);
        painting("pointer", 0, 12, 4, 4);
        painting("pigscene", 4, 12, 4, 4);
        painting("burning_skull", 8, 12, 4, 4);
    }
}
