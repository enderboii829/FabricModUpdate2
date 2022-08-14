package net.enderboii829.firstmod.block;

import net.enderboii829.firstmod.FirstMod;
import net.enderboii829.firstmod.block.custom.CherryCropBlock;
import net.enderboii829.firstmod.block.custom.BlueLampBlock;
import net.enderboii829.firstmod.block.custom.JumpyBlock;
import net.enderboii829.firstmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
public static final Block UFO_BLOCK = registerBlock("ufo_block",
        new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.FABRIC_TAB);

    public static final Block UFO_ORE = registerBlock("ufo_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.FABRIC_TAB);
    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.FABRIC_TAB);
    public static final Block BLUE_LAMP = registerBlock("blue_lamp",
            new BlueLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(BlueLampBlock.LIT)? 15 : 0)), ModItemGroup.FABRIC_TAB);
    public static final Block CHERRY_CROP = registerBlockWithoutItem("cherry_crop",
            new CherryCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.FABRIC_TAB);
    public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.FABRIC_TAB);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
    }




    private static Block registerBlock(String name, Block block, ItemGroup tab) {
    registerBlockItem(name, block, tab);
    return Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
}

private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
    return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(tab)));
}

    public static void registerModBlocks() {
        FirstMod.LOGGER.debug("Register ModBlocks for" + FirstMod.MOD_ID);
    }
}
