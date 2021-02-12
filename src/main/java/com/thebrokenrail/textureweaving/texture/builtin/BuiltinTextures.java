package com.thebrokenrail.textureweaving.texture.builtin;

import com.thebrokenrail.textureweaving.texture.DuplicateTexture;
import com.thebrokenrail.textureweaving.texture.TextureRegistry;
import com.thebrokenrail.textureweaving.texture.builtin.atlas.ArtAtlas;
import com.thebrokenrail.textureweaving.texture.builtin.atlas.ItemAtlas;
import com.thebrokenrail.textureweaving.texture.builtin.atlas.BlockAtlas;
import com.thebrokenrail.textureweaving.texture.builtin.atlas.ParticleAtlas;

public final class BuiltinTextures extends TextureRegistry {
    private BuiltinTextures() {
    }

    public static final BuiltinTextures INSTANCE = new BuiltinTextures();

    @Override
    protected void init() {
        // Armor
        add(new DuplicateTexture("armor/diamond_1", "models/armor/diamond_layer_1", 64, 32));
        add(new DuplicateTexture("armor/diamond_2", "models/armor/diamond_layer_2", 64, 32));
        add(new DuplicateTexture("armor/gold_1", "models/armor/gold_layer_1", 64, 32));
        add(new DuplicateTexture("armor/gold_2", "models/armor/gold_layer_2", 64, 32));
        add(new DuplicateTexture("armor/iron_1", "models/armor/iron_layer_1", 64, 32));
        add(new DuplicateTexture("armor/iron_2", "models/armor/iron_layer_2", 64, 32));
        add(new DuplicateTexture("armor/chain_1", "models/armor/chainmail_layer_1", 64, 32));
        add(new DuplicateTexture("armor/chain_2", "models/armor/chainmail_layer_2", 64, 32));
        add(new DuplicateTexture("armor/cloth_1", "models/armor/leather_layer_1", 64, 32));
        add(new DuplicateTexture("armor/cloth_2", "models/armor/leather_layer_2", 64, 32));
        // Art
        add(new ArtAtlas());
        // Environment
        add(new DuplicateTexture("environment/clouds", 256, 256));
        // Font
        add(new DuplicateTexture("font/default8", "font/ascii", 128, 128));
        // GUI
        add(new DuplicateTexture("gui/background", 16, 16));
        add(new DuplicateTexture("gui/bg32", 32, 32));
        add(new DuplicateTexture("gui/cursor", 16, 16));
        add(new DuplicateTexture("gui/default_world", 128, 128));
        add(new DuplicateTexture("gui/gui", 256, 256));
        add(new DuplicateTexture("gui/gui2", "gui/widgets", 256, 256));
        add(new DuplicateTexture("gui/gui_blocks", 512, 512));
        add(new DuplicateTexture("gui/icons", 256, 256));
        add(new DuplicateTexture("gui/itemframe", 256, 128));
        add(new ItemAtlas());
        add(new DuplicateTexture("gui/pi_title", "gui/title/pi_title", 256, 64));
        add(new DuplicateTexture("gui/spritesheet", 128, 128));
        add(new DuplicateTexture("gui/touchgui", 256, 256));
        add(new DuplicateTexture("gui/badge/minecon140", 256, 32));
        add(new DuplicateTexture("gui/logo/raknet_high_72", "gui/title/raknet_logo", 256, 128));
        // Object Entity
        add(new DuplicateTexture("item/sign", "entity/signs/oak", 64, 32));
        add(new DuplicateTexture("item/arrows", "entity/arrow", 32, 32));
        add(new DuplicateTexture("item/camera", "entity/camera", 64, 32));
        // Mob
        add(new DuplicateTexture("mob/char", "entity/steve", 64, 32));
        add(new DuplicateTexture("mob/chicken", "entity/chicken", 64, 32));
        add(new DuplicateTexture("mob/cow", "entity/cow/cow", 64, 32));
        add(new DuplicateTexture("mob/creeper", "entity/creeper/creeper", 64, 32));
        add(new DuplicateTexture("mob/pig", "entity/pig/pig", 64, 32));
        add(new DuplicateTexture("mob/pigzombie", "entity/zombie_pigman", 64, 32));
        add(new DuplicateTexture("mob/sheep", "entity/sheep/sheep", 64, 32));
        add(new DuplicateTexture("mob/sheep_fur", "entity/sheep/sheep_fur", 64, 32));
        add(new DuplicateTexture("mob/skeleton", "entity/skeleton/skeleton", 64, 32));
        add(new DuplicateTexture("mob/chicken", "entity/chicken", 64, 32));
        add(new DuplicateTexture("mob/spider", "entity/spider/spider", 64, 32));
        add(new DuplicateTexture("mob/zombie", "entity/zombie/zombie", 64, 32));
        // Root
        add(new BlockAtlas());
        add(new ParticleAtlas());
    }
}
