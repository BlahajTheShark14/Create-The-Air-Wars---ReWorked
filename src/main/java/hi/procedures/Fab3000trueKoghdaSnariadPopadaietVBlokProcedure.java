package hi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import hi.init.CreateTheAirWarsModParticleTypes;

public class Fab3000trueKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 120, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:shellexp2")), SoundSource.NEUTRAL, 30, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:shellexp2")), SoundSource.NEUTRAL, 30, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 3, 5, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 3, 10, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 3, 15, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 3, 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 8, 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 8, 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 8, 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, 8, 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, (-2), 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, (-2), 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, (-2), 20, 3, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXP.get()), x, y, z, 3, (-2), 20, 3, 1);
	}
}
