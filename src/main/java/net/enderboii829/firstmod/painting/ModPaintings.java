package net.enderboii829.firstmod.painting;

import net.enderboii829.firstmod.FirstMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingVariant SUNSET = registerPainting("sunset", new PaintingVariant(32, 16));
    public static final PaintingVariant PLANT = registerPainting("plant", new PaintingVariant(32, 16));
    public static final PaintingVariant WANDERER = registerPainting("wanderer", new PaintingVariant(32, 16));


    private static final PaintingVariant registerPainting(String name, PaintingVariant paintingVariant){
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(FirstMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings(){
        FirstMod.LOGGER.debug("Registering Paintings for " + FirstMod.MOD_ID);
    }

}
