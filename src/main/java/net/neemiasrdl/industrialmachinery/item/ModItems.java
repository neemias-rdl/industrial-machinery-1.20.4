package net.neemiasrdl.industrialmachinery.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.neemiasrdl.industrialmachinery.Industrialmachinery;


public class ModItems {

    public static final Item SUGAR_CANE_BAGASSE = registerItem("sugar_cane_bagasse", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("steel_plate", new Item(new FabricItemSettings()));
    public static final Item COPPER_GEAR = registerItem("copper_gear", new Item(new FabricItemSettings()));
    public static final Item FLUID_TANK =  registerItem("fluid_tank", new Item(new FabricItemSettings()));
    public static final Item ENGINE =  registerItem("engine", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Industrialmachinery.MOD_ID, name), item);
    }

    public static void registerModItems() {

        Industrialmachinery.LOGGER.info("Registering mod items for" + Industrialmachinery.MOD_ID);

    }

}
