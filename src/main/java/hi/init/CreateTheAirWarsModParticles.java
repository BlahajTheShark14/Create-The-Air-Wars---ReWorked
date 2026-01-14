
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import hi.client.particle.SdfParticle;
import hi.client.particle.QweParticle;
import hi.client.particle.ExpParticle;
import hi.client.particle.ExlosionParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreateTheAirWarsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CreateTheAirWarsModParticleTypes.QWE.get(), QweParticle::provider);
		event.registerSpriteSet(CreateTheAirWarsModParticleTypes.SDF.get(), SdfParticle::provider);
		event.registerSpriteSet(CreateTheAirWarsModParticleTypes.EXLOSION.get(), ExlosionParticle::provider);
		event.registerSpriteSet(CreateTheAirWarsModParticleTypes.EXP.get(), ExpParticle::provider);
	}
}
