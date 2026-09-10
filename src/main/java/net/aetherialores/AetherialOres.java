package net.a9sgg.aetherialores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AetherialOres implements ModInitializer {
    public static final String MOD_ID = "aetherial-ores";

    // 1. تعريف بلوكة أور الأثيريل بخصائص Deepslate Diamond Ore
    public static final Block AETHERIAL_ORE = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));

    @Override
    public void onInitialize() {
        // 2. تسجيل البلوكة والعنصر في السجل البرمجي
        Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "aetherial_ore"), AETHERIAL_ORE);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "aetherial_ore"), 
            new BlockItem(AETHERIAL_ORE, new Item.Settings()));

        // 3. إضافتها لقائمة البناء Natural / Building Blocks في الكريتيف
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(AETHERIAL_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.add(AETHERIAL_ORE);
        });
    }
}
