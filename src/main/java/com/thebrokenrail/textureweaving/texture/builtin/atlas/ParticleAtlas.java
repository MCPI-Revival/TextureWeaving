package com.thebrokenrail.textureweaving.texture.builtin.atlas;

import com.thebrokenrail.textureweaving.texture.Texture;

public class ParticleAtlas extends Texture {
    public ParticleAtlas() {
        super("particles", 128, 128);
    }

    private void particle(String name, int x, int y) {
        rect("particle/" + name, x * 8, y * 8, 8, 8);
    }

    @Override
    protected void build() {
        for (int i = 0; i < 8; i++) {
            particle("generic_" + i, i, 0);
        }
        for (int i = 0; i < 4; i++) {
            particle("splash_" + i, i, 1);
        }
        particle("bubble", 0, 2);
        particle("flame", 0, 3);
        particle("critical_hit", 1, 4);
    }
}
