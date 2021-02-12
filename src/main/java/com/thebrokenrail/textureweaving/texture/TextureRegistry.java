package com.thebrokenrail.textureweaving.texture;

import java.util.ArrayList;
import java.util.List;

public abstract class TextureRegistry {
    public TextureRegistry() {
        init();
    }

    private final List<Texture> textures = new ArrayList<>();

    public Texture get(int index) {
        return textures.get(index);
    }

    public int size() {
        return textures.size();
    }

    protected void add(Texture texture) {
        texture.init();
        textures.add(texture);
    }

    protected abstract void init();
}
