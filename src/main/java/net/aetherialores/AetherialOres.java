package net.aetherialores;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AetherialOres implements ModInitializer {
    public static final String MOD_ID = "aetherial_ores";

    public static final Block AETHERIUM_ORE = Registry.register(
        Registries.BLOCK,
        Identifier.of(MOD_ID, "aetherium_ore"),
        new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).requiresTool().strength(4.5f, 3.0f))
    );

    public static final Item AETHERIUM_ORE_ITEM = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "aetherium_ore"),
        new BlockItem(AETHERIUM_ORE, new Item.Settings())
    );

    public static final Item AETHERIUM_INGOT = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "aetherium_ingot"),
        new Item(new Item.Settings())
    );

    public static final Item CLASSIC_RUNE_SMITHING_TEMPLATE = Registry.register(
        Registries.ITEM,
        Identifier.of(MOD_ID, "classic_rune_smithing_template"),
        new Item(new Item.Settings())
    );

    @Override
    public void onInitialize() {
    }
}

