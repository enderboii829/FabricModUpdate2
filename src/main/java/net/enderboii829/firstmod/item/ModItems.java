package net.enderboii829.firstmod.item;

import net.enderboii829.firstmod.FirstMod;
import net.enderboii829.firstmod.block.ModBlocks;
import net.enderboii829.firstmod.block.custom.CherryCropBlock;
import net.enderboii829.firstmod.item.custom.EightBallItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_UFO = registerItem("raw_ufo",
            new Item(new FabricItemSettings().group(ModItemGroup.FABRIC_TAB)));
    public static final Item UFO = registerItem("ufo",
            new Item(new FabricItemSettings().group(ModItemGroup.FABRIC_TAB)));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.FABRIC_TAB).maxCount(1)));
    public static final Item CHERRY_SEEDS = registerItem("cherry_seeds",
            new AliasedBlockItem(ModBlocks.CHERRY_CROP,new FabricItemSettings().group(ModItemGroup.FABRIC_TAB)));
    public static final Item CHERRY = registerItem("cherry",
            new Item(new FabricItemSettings().group(ModItemGroup.FABRIC_TAB)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FirstMod.LOGGER.debug("Registering Mod Items for " + FirstMod.MOD_ID);

    }
}
