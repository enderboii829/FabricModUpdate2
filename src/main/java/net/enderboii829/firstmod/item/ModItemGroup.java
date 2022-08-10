package net.enderboii829.firstmod.item;

import net.enderboii829.firstmod.FirstMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FABRIC_TAB = FabricItemGroupBuilder.build(
            new Identifier(FirstMod.MOD_ID, "fabric_tab"), () -> new ItemStack(ModItems.RAW_UFO));
}
