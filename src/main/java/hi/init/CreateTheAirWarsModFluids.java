
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import hi.fluid.AmalgamBucketFluid;

import hi.CreateTheAirWarsMod;

public class CreateTheAirWarsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<FlowingFluid> AMALGAM_BUCKET = REGISTRY.register("amalgam_bucket", () -> new AmalgamBucketFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_AMALGAM_BUCKET = REGISTRY.register("flowing_amalgam_bucket", () -> new AmalgamBucketFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(AMALGAM_BUCKET.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_AMALGAM_BUCKET.get(), RenderType.translucent());
		}
	}
}
