package com.thebrokenrail.textureweaving.texture.builtin.atlas;

import com.thebrokenrail.textureweaving.texture.Texture;

public class BlockAtlas extends Texture {
    public BlockAtlas() {
        super("terrain", 256, 256);
    }

    private void block(String name, int x, int y) {
        rect("block/" + name, x * 16, y * 16, 16, 16);
    }

    private void liquid(String name, int x, int y) {
        x *= 16;
        y *= 16;
        SelectionPart part1 = new SelectionPart(0, 0, 3 * 16, 16);
        SelectionPart part2 = new SelectionPart(16, 16, 2 * 16, 16);
        Selection selection = new Selection("block/" + name, x, y, new SelectionPart[]{part1, part2});
        add(selection);
    }

    @Override
    protected void build() {
        block("grass_block_top", 0, 0);
        block("stone", 1, 0);
        block("dirt", 2, 0);
        block("grass_block_side", 3, 0);
        block("oak_planks", 4, 0);
        block("smooth_stone_slab_side", 5, 0);
        block("smooth_stone", 6, 0);
        block("bricks", 7, 0);
        block("tnt_side", 8, 0);
        block("tnt_top", 9, 0);
        block("tnt_bottom", 10, 0);
        block("cobweb", 11, 0);
        block("rose", 12, 0);
        block("dandelion", 13, 0);
        block("oak_sapling", 15, 0);
        block("cobblestone", 0, 1);
        block("bedrock", 1, 1);
        block("sand", 2, 1);
        block("gravel", 3, 1);
        block("oak_log", 4, 1);
        block("oak_log_top", 5, 1);
        block("iron_block", 6, 1);
        block("gold_block", 7, 1);
        block("diamond_block", 8, 1);
        block("chest_top", 9, 1);
        block("chest_side", 10, 1);
        block("chest_front", 11, 1);
        block("red_mushroom", 12, 1);
        block("brown_mushroom", 13, 1);
        block("fire_0", 15, 1);
        block("gold_ore", 0, 2);
        block("iron_ore", 1, 2);
        block("coal_ore", 2, 2);
        block("bookshelf", 3, 2);
        block("mossy_cobblestone", 4, 2);
        block("obsidian", 5, 2);
        block("grass", 7, 2);
        block("crafting_table_top", 11, 2);
        block("furnace_front", 12, 2);
        block("furnace_side", 13, 2);
        block("fire_1", 15, 2);
        block("glass", 1, 3);
        block("diamond_ore", 2, 3);
        block("redstone_ore", 3, 3);
        block("oak_leaves", 4, 3);
        block("oak_leaves_fast", 5, 3);
        block("stone_bricks", 6, 3);
        block("dead_bush", 7, 3);
        block("fern", 8, 3);
        block("crafting_table_side", 11, 3);
        block("crafting_table_front", 12, 3);
        block("furnace_front_on", 13, 3);
        block("furnace_top", 14, 3);
        block("spruce_sapling", 15, 3);
        block("white_wool", 0, 4);
        block("snow", 2, 4);
        block("ice", 3, 4);
        block("grass_block_snow", 4, 4);
        block("cactus_top", 5, 4);
        block("cactus_side", 6, 4);
        block("cactus_bottom", 7, 4);
        block("clay", 8, 4);
        block("sugar_cane", 9, 4);
        block("birch_sapling", 15, 4);
        block("torch", 0, 5);
        block("oak_door_top", 1, 5);
        block("iron_door_top", 2, 5);
        block("ladder", 3, 5);
        block("oak_trapdoor", 4, 5);
        block("farmland_moist", 6, 5);
        block("farmland", 7, 5);
        for (int stage = 0; stage < 8; stage++) {
            block("wheat_stage" + stage, 8 + stage, 5);
        }
        block("oak_door_bottom", 1, 6);
        block("iron_door_bottom", 2, 6);
        block("mossy_stone_bricks", 4, 6);
        block("cracked_stone_bricks", 5, 6);
        block("netherrack", 7, 6);
        block("glowstone", 9, 6);
        block("melon_stem", 15, 6);
        block("black_wool", 1, 7);
        block("gray_wool", 2, 7);
        block("spruce_log", 4, 7);
        block("birch_log", 5, 7);
        block("attached_melon_stem", 15, 7);
        block("red_wool", 1, 8);
        block("pink_wool", 2, 8);
        block("spruce_leaves", 4, 8);
        block("spruce_leaves_fast", 5, 8);
        block("bed_feet_top", 6, 8);
        block("bed_head_top", 7, 8);
        block("melon_side", 8, 8);
        block("melon_top", 9, 8);
        block("lapis_block", 0, 9);
        block("green_wool", 1, 9);
        block("lime_wool", 2, 9);
        block("glass_pane_top", 4, 9);
        block("bed_feet_end", 5, 9);
        block("bed_feet_side", 6, 9);
        block("bed_head_side", 7, 9);
        block("bed_head_end", 8, 9);
        block("lapis_ore", 0, 10);
        block("brown_wool", 1, 10);
        block("yellow_wool", 2, 10);
        block("stonecutter_front", 8, 10);
        block("stonecutter_top", 9, 10);
        block("sandstone_top", 0, 11);
        block("blue_wool", 1, 11);
        block("light_blue_wool", 2, 11);
        block("sandstone", 0, 12);
        block("purple_wool", 1, 12);
        block("magenta_wool", 2, 12);
        block("quartz_block_top", 4, 12);
        block("quartz_pillar_top", 5, 12);
        block("chiseled_quartz_block_top", 6, 12);
        block("grass_block_carried_top", 12, 12);
        liquid("water", 13, 12);
        block("sandstone_bottom", 0, 13);
        block("cyan_wool", 1, 13);
        block("orange_wool", 2, 13);
        block("quartz_block_bottom", 3, 13);
        block("quartz_block_side", 4, 13);
        block("quartz_pillar", 5, 13);
        block("chiseled_quartz_block", 6, 13);
        block("glowing_obsidian", 10, 13);
        block("spruce_leaves_carried", 11, 13);
        block("spruce_leaves_carried_fast", 12, 13);
        block("nether_bricks", 0, 14);
        block("light_gray_wool", 1, 14);
        block("chiseled_sandstone", 5, 14);
        block("cut_sandstone", 6, 14);
        block("reactor_core_stage_3", 8, 14);
        block("reactor_core_stage_2", 9, 14);
        block("reactor_core_stage_0", 10, 14);
        block("oak_leaves_carried", 11, 14);
        block("oak_leaves_carried_fast", 12, 14);
        liquid("lava", 13, 14);
        for (int stage = 0; stage < 10; stage++) {
            block("destroy_stage_" + stage, stage, 15);
        }
        block("missing_tile_0", 12, 15);
        block("missing_tile_1", 13, 15);
    }
}
