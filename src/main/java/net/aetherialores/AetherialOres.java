package net.aetherialores.block;

import net.aetherialores.AetherialOresMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // تسجيل الأورات الثلاثة بصلابة توافق التدرج المطلوب
    public static final Block AETHERIUM_ORE = registerBlock("aetherium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(4.0f).requiresTool()));
    public static final Block VOIDSTEEL_ORE = registerBlock("voidsteel_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(6.0f).requiresTool()));
    public static final Block CHRONOCITE_ORE = registerBlock("chronocite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).strength(50.0f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AetherialOresMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(AetherialOresMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + AetherialOresMod.MOD_ID);
    }
}
