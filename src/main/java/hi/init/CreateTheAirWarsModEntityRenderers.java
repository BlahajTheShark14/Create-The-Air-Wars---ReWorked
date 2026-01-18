
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreateTheAirWarsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreateTheAirWarsModEntities.AIM_9_ROCKETTRUE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.C_3KTRUE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.CSDS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.GVRDCRCD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.ZM_54BULL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.C_25.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.RIM_7ACTVBULT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.NINEK_119MACTVBULT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.C_25ACTVBULT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.TOMAHAWKBULT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.BGGH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CreateTheAirWarsModEntities.FAB_3000TRUE.get(), ThrownItemRenderer::new);
	}
}
