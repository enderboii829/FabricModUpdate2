package net.enderboii829.firstmod.world.feautures;

import net.enderboii829.firstmod.FirstMod;
import net.enderboii829.firstmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.*;
import net.minecraft.util.registry.RegistryEntry;

import java.util.List;

public class ModConfigedFeatures {

    public static final List<OreFeatureConfig.Target> OVERWOLD_UFO_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.UFO_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.UFO_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_UFO_ORES = List.of(
        OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_TANZANITE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_UFO_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENDSTONE_TANZANITE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> UFO_ORE =
            ConfiguredFeatures.register("ufo_ore", Feature.ORE, new OreFeatureConfig(OVERWOLD_UFO_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHERRACK_TANZANITE_ORES =
            ConfiguredFeatures.register("netherrack_tanzanite_ore", Feature.ORE, new OreFeatureConfig(NETHER_UFO_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ENDSTONE_TANZANITE_ORES =
            ConfiguredFeatures.register("endstone_tanzanite_ore", Feature.ORE, new OreFeatureConfig(END_UFO_ORES, 12));


    public static void registerConfigedFeatures(){
        FirstMod.LOGGER.debug("Registering the ModConfigedFeatures " + FirstMod.MOD_ID);
    }
}
