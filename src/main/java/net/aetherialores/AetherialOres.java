package net.aetherialores;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AetherialOresMod implements ModInitializer {
    public static final String MOD_ID = "aetherial_ores";

    // تسجيل الـ Dusts والـ Ingots لكل المعادن (أثيريوم، فويدستيل، كرونوكايت)
    public static final Item AETHERIUM_DUST = registerItem("aetherium_dust", new Item(new Item.Settings()));
    public static final Item AETHERIUM_INGOT = registerItem("aetherium_ingot", new Item(new Item.Settings()));

    public static final Item VOIDSTEEL_DUST = registerItem("voidsteel_dust", new Item(new Item.Settings()));
    public static final Item VOIDSTEEL_INGOT = registerItem("voidsteel_ingot", new Item(new Item.Settings().fireproof()));

    public static final Item CHRONOCITE_DUST = registerItem("chronocite_dust", new Item(new Item.Settings()));
    public static final Item CHRONOCITE_INGOT = registerItem("chronocite_ingot", new Item(new Item.Settings().fireproof()));

    public static final ItemGroup AETHERIAL_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "aetherial_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(CHRONOCITE_INGOT))
                    .displayName(Text.translatable("itemgroup.aetherial_ores.aetherial_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(AETHERIUM_DUST);
                        entries.add(AETHERIUM_INGOT);
                        entries.add(VOIDSTEEL_DUST);
                        entries.add(VOIDSTEEL_INGOT);
                        entries.add(CHRONOCITE_DUST);
                        entries.add(CHRONOCITE_INGOT);
                    })
                    .build()
    );

    @Override
    public void onInitialize() {
        System.out.println("Aetherial Ores Mod Initialized successfully for Minecraft 1.21.11!");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }
}
