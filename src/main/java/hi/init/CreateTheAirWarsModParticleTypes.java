
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import hi.CreateTheAirWarsMod;

public class CreateTheAirWarsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<SimpleParticleType> QWE = REGISTRY.register("qwe", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SDF = REGISTRY.register("sdf", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> EXLOSION = REGISTRY.register("exlosion", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> EXP = REGISTRY.register("exp", () -> new SimpleParticleType(true));
}
