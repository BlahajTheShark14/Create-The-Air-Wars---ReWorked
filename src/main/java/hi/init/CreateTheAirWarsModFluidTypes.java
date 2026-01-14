
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import hi.fluid.types.AmalgamBucketFluidType;

import hi.CreateTheAirWarsMod;

public class CreateTheAirWarsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<FluidType> AMALGAM_BUCKET_TYPE = REGISTRY.register("amalgam_bucket", () -> new AmalgamBucketFluidType());
}
