package net.enderboii829.firstmod.world.feautures;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> UFO_ORE_PLACED = PlacedFeatures.register("ufo_ore_placed",
            ModConfigedFeatures.UFO_ORE, modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));


    public static final RegistryEntry<PlacedFeature> NETHER_TANZANITE_ORE_PLACED = PlacedFeatures.register("nether_tanzanite_ore_placed",
                ModConfigedFeatures.NETHERRACK_TANZANITE_ORES, modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));


    public static final RegistryEntry<PlacedFeature> END_TANZANITE_ORE_PLACED = PlacedFeatures.register("end_tanzanite_ore_placed",
            ModConfigedFeatures.ENDSTONE_TANZANITE_ORES, modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));


    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
