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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AetherialOres implements ModInitializer {
    public static final String MOD_ID = "aetherial-ores";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // 1. تعريف بلوكة الأور وروناتها
    public static final Block AETHERIAL_ORE = new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE));
    public static final Item CLASSIC_RUNE = new Item(new Item.Settings());

    @Override
    public void onInitialize() {
        LOGGER.info("Registering Aetherial Ores items and blocks...");

        // 2. تسجيل الأور كـ Block وكـ Item باللعبة
        Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "aetherial_ore"), AETHERIAL_ORE);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "aetherial_ore"), 
            new BlockItem(AETHERIAL_ORE, new Item.Settings()));

        // 3. تسجيل الرونة كـ Item
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "classic_rune"), CLASSIC_RUNE);

        // 4. إضافتهم تلقائياً لـ Creative Tab في قائمة Ingredients & Building Blocks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(AETHERIAL_ORE);
        });
        
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(CLASSIC_RUNE);
        });
    }
}
