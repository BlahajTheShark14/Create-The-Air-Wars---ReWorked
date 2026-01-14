package hi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import hi.init.CreateTheAirWarsModParticleTypes;

public class GvrdcrcdKoghdaSnariadPopadaietVBlokProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 15, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:fire_big_cannon")), SoundSource.BLOCKS, 15, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:fire_big_cannon")), SoundSource.BLOCKS, 15, 1, false);
			}
		}
		world.addParticle((SimpleParticleType) (CreateTheAirWarsModParticleTypes.EXLOSION.get()), x, y, z, 0, 1, 0);
	}
}
