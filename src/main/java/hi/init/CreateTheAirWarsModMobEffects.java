
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import hi.potion.LocationMobEffect;

import hi.CreateTheAirWarsMod;

public class CreateTheAirWarsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<MobEffect> LOCATION = REGISTRY.register("location", () -> new LocationMobEffect());
}
