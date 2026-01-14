
package hi.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import hi.procedures.Fab3000trueKoghdaSnariadPopadaietVBlokProcedure;

import hi.init.CreateTheAirWarsModEntities;
import hi.init.CreateTheAirWarsModBlocks;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class Fab3000trueEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(CreateTheAirWarsModBlocks.FAB_3000TRUEBLOCK.get());

	public Fab3000trueEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(CreateTheAirWarsModEntities.FAB_3000TRUE.get(), world);
	}

	public Fab3000trueEntity(EntityType<? extends Fab3000trueEntity> type, Level world) {
		super(type, world);
	}

	public Fab3000trueEntity(EntityType<? extends Fab3000trueEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public Fab3000trueEntity(EntityType<? extends Fab3000trueEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		Fab3000trueKoghdaSnariadPopadaietVBlokProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static Fab3000trueEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 5, 5);
	}

	public static Fab3000trueEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1f, 5, 5);
	}

	public static Fab3000trueEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		Fab3000trueEntity entityarrow = new Fab3000trueEntity(CreateTheAirWarsModEntities.FAB_3000TRUE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(0).x, entity.getViewVector(0).y, entity.getViewVector(0).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static Fab3000trueEntity shoot(LivingEntity entity, LivingEntity target) {
		Fab3000trueEntity entityarrow = new Fab3000trueEntity(CreateTheAirWarsModEntities.FAB_3000TRUE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getY();
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
