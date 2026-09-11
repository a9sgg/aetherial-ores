package net.a9sgg.aetherialores.registry;

import java.util.function.Function;

import net.a9sgg.aetherialores.AetherialOres;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public final class ModBlocks {

    private ModBlocks() {}

    // Tier 1 - Aetherium
    public static final Block AETHERIUM_ORE = registerBlock("aetherium_ore",
            s -> new net.minecraft.block.ExperienceDroppingBlock(3, 7, s),
            AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)
                    .requiresTool());

    public static final Block AETHERIUM_BLOCK = registerBlock("aetherium_block",
            Block::new,
            AbstractBlock.Settings.create().mapColor(MapColor.DIAMOND_BLUE)
                    .strength(6.0f, 8.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool());

    // Tier 2 - Voidsteel
    public static final Block VOIDSTEEL_ORE = registerBlock("voidsteel_ore",
            s -> new net.minecraft.block.ExperienceDroppingBlock(4, 9, s),
            AbstractBlock.Settings.create().mapColor(MapColor.BLACK)
                    .strength(5.5f, 7.0f).sounds(BlockSoundGroup.NETHERITE)
                    .requiresTool());

    public static final Block VOIDSTEEL_BLOCK = registerBlock("voidsteel_block",
            Block::new,
            AbstractBlock.Settings.create().mapColor(MapColor.PURPLE)
                    .strength(7.0f, 9.0f).sounds(BlockSoundGroup.NETHERITE)
                    .requiresTool());

    // Tier 3 - Chronocite
    public static final Block CHRONOCITE_ORE = registerBlock("chronocite_ore",
            s -> new net.minecraft.block.ExperienceDroppingBlock(5, 11, s),
            AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW)
                    .strength(6.5f, 10.0f).sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .requiresTool().luminance(state -> 6));

    public static final Block CHRONOCITE_BLOCK = registerBlock("chronocite_block",
            Block::new,
            AbstractBlock.Settings.create().mapColor(MapColor.YELLOW)
                    .strength(8.0f, 10.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool().luminance(state -> 8));

    // Helpers
    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(AetherialOres.MOD_ID, path));
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AetherialOres.MOD_ID, path));
        Block block = factory.apply(settings.registryKey(key));
        Registry.register(Registries.BLOCK, key, block);
        Registry.register(Registries.ITEM, itemKey,
                new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey()));
        return block;
    }

    public static void registerBlocks() {}
}


