package com.thebrokenrail.textureweaving.texture.builtin.atlas;

import com.thebrokenrail.textureweaving.texture.Texture;

public class ItemAtlas extends Texture {
    public ItemAtlas() {
        super("gui/items", 256, 256);
    }

    private void item(String name, int x, int y) {
        rect("item/" + name, x * 16, y * 16, 16, 16);
    }

    private enum ArmorMaterial {
        LEATHER(0, "leather"),
        CHAINMAIL(1, "chainmail"),
        IRON(2, "iron"),
        DIAMOND(3, "diamond"),
        GOLD(4, "golden"),
        EMPTY(15, "empty_armor_slot");

        private final int x;
        private final String name;

        ArmorMaterial(int x, String name) {
            this.x = x;
            this.name = name;
        }
    }
    private enum ArmorType {
        HELMET(0, "helmet"),
        CHESTPLATE(1, "chestplate"),
        LEGGINGS(2, "leggings"),
        BOOTS(3, "boots");

        private final int y;
        private final String name;

        ArmorType(int y, String name) {
            this.y = y;
            this.name = name;
        }
    }

    private enum ToolMaterial {
        WOOD(0, "wooden"),
        STONE(1, "stone"),
        IRON(2, "iron"),
        DIAMOND(3, "diamond"),
        GOLD(4, "golden");

        private final int x;
        private final String name;

        ToolMaterial(int x, String name) {
            this.x = x;
            this.name = name;
        }
    }
    private enum ToolType {
        SWORD(4, "sword"),
        SHOVEL(5, "shovel"),
        PICKAXE(6, "pickaxe"),
        AXE(7, "axe"),
        HOE(8, "hoe");

        private final int y;
        private final String name;

        ToolType(int y, String name) {
            this.y = y;
            this.name = name;
        }
    }

    @Override
    protected void build() {
        for (ArmorMaterial material : ArmorMaterial.values()) {
            for (ArmorType type : ArmorType.values()) {
                item(material.name + '_' + type.name, material.x, type.y);
            }
        }
        for (ToolMaterial material : ToolMaterial.values()) {
            for (ToolType type : ToolType.values()) {
                item(material.name + '_' + type.name, material.x, type.y);
            }
        }

        item("flint_and_steel", 5, 0);
        item("flint", 6, 0);
        item("coal", 7, 0);
        item("string", 8, 0);
        item("wheat_seeds", 9, 0);
        item("apple", 10, 0);
        item("egg", 12, 0);
        item("sugar", 13, 0);
        item("snowball", 14, 0);
        item("bow", 5, 1);
        item("brick", 6, 1);
        item("iron_ingot", 7, 1);
        item("feather", 8, 1);
        item("wheat", 9, 1);
        item("painting", 10, 1);
        item("sugar_cane", 11, 1);
        item("bone", 12, 1);
        item("arrow", 5, 2);
        item("gold_ingot", 7, 2);
        item("gunpowder", 8, 2);
        item("bread", 9, 2);
        item("oak_sign", 10, 2);
        item("oak_door", 11, 2);
        item("iron_door", 12, 2);
        item("bed_red", 13, 2);
        item("stick", 5, 3);
        item("compass", 6, 3);
        item("diamond", 7, 3);
        item("clay_ball", 9, 3);
        item("paper", 10, 3);
        item("book", 11, 3);
        item("melon_seeds", 14, 3);
        item("clock", 6, 4);
        item("bowl", 7, 4);
        item("mushroom_stew", 8, 4);
        item("glowstone_dust", 9, 4);
        item("ink_sac", 14, 4);
        item("gray_dye", 15, 4);
        item("porkchop", 7, 5);
        item("cooked_porkchop", 8, 5);
        item("shears", 13, 5);
        item("red_dye", 14, 5);
        item("pink_dye", 15, 5);
        item("bow_pulling_0", 5, 6);
        item("leather", 7, 6);
        item("beef", 9, 6);
        item("cooked_beef", 10, 6);
        item("melon_slice", 13, 6);
        item("green_dye", 14, 6);
        item("lime_dye", 15, 6);
        item("bow_pulling_1", 5, 7);
        item("chicken", 9, 7);
        item("cooked_chicken", 10, 7);
        item("cocoa_beans", 14, 7);
        item("yellow_dye", 15, 7);
        item("bow_pulling_2", 5, 8);
        item("lapis_lazuli", 14, 8);
        item("light_blue_dye", 15, 8);
        item("nether_brick", 5, 9);
        item("purple_dye", 14, 9);
        item("magenta_dye", 15, 9);
        item("quartz", 5, 10);
        item("cyan_dye", 14, 10);
        item("orange_dye", 15, 10);
        item("light_gray_dye", 14, 11);
        item("bone_meal", 15, 11);
        item("camera", 2, 15);
        item("camera_tripod", 3, 15);
    }
}
