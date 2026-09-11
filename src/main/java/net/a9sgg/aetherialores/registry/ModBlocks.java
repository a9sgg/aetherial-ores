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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public final class ModBlocks {

    private ModBlocks() {}

    // ---------------- Aetherium ----------------

    public static final Block AETHERIUM_ORE = registerBlock(
            "aetherium_ore",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .requiresTool()
                    .strength(4.0f, 6.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .luminance(state -> 6)
    );

    public static final Block AETHERIUM_BLOCK = registerBlock(
            "aetherium_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.LIGHT_BLUE)
                    .requiresTool()
                    .strength(5.0f, 6.0f)
                    .sounds(BlockSoundGroup.METAL)
                    .luminance(state -> 9)
    );

    // ---------------- Voidsteel ----------------

    public static final Block VOIDSTEEL_ORE = registerBlock(
            "voidsteel_ore",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .requiresTool()
                    .strength(6.5f, 8.0f)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .luminance(state -> 4)
    );

    public static final Block VOIDSTEEL_BLOCK = registerBlock(
            "voidsteel_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .requiresTool()
                    .strength(7.5f, 9.0f)
                    .sounds(BlockSoundGroup.NETHERITE)
                    .luminance(state -> 7)
    );

    // ---------------- Chronocite ----------------

    public static final Block CHRONOCITE_ORE = registerBlock(
            "chronocite_ore",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(5.0f, 7.0f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .luminance(state -> 12)
    );

    public static final Block CHRONOCITE_BLOCK = registerBlock(
            "chronocite_block",
            Block::new,
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(6.0f, 8.0f)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .luminance(state -> 15)
    );

    // ---------------- Helpers ----------------

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory,
            AbstractBlock.Settings settings) {
        Identifier id = Identifier.of(AetherialOres.MOD_ID, name);
        Block block = factory.apply(settings);
        Registry.register(Registries.BLOCK, id, block);
        Registry.register(Registries.ITEM, id, new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void registerBlocks() {
        AetherialOres.LOGGER.info("[{}] Registered 6 blocks.", AetherialOres.MOD_ID);
    }
}
