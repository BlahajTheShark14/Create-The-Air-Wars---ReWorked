package hi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import hi.init.CreateTheAirWarsModParticleTypes;

public class DsfsdsfPriObnovlieniiTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (CreateTheAirWarsModParticleTypes.SDF.get()), x, y, z, 0, 0, 0);
	}
}
