package net.neemiasrdl.industrialmachinery.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.neemiasrdl.industrialmachinery.Industrialmachinery;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
public class ModItemGroups {
    public static final ItemGroup INDUSTRIAL_MACHINES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Industrialmachinery.MOD_ID, "industrial_machine_components"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.industrial_machine_components"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SUGAR_CANE_BAGASSE);

                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_PLATE);
                        entries.add(ModItems.COPPER_GEAR);
                        entries.add(ModItems.FLUID_TANK);
                        entries.add(ModItems.ENGINE);

                    }).build());


    public static void registerItemGroups() {
        Industrialmachinery.LOGGER.info("Registering Item Groups for " + Industrialmachinery.MOD_ID);
    }
}
