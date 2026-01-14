package hi.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.Map;

import hi.init.CreateTheAirWarsModEntities;
import hi.init.CreateTheAirWarsModBlocks;

import hi.entity.CsdsEntity;

import hi.CreateTheAirWarsMod;

public class C9ROCKETBOXRiedstounVkliuchionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 50, 5);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(0, 0, (-50), 6, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
				}
			}
			CreateTheAirWarsMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 50, 5);
					_entityToSpawn.setPos(x, y, z);
					_entityToSpawn.shoot(0, 0, (-50), 6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
					}
				}
				CreateTheAirWarsMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setCritArrow(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 50, 5);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot(0, 0, (-50), 6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
						}
					}
					CreateTheAirWarsMod.queueServerWork(10, () -> {
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 50, 5);
							_entityToSpawn.setPos(x, y, z);
							_entityToSpawn.shoot(0, 0, (-50), 6, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
							}
						}
						CreateTheAirWarsMod.queueServerWork(10, () -> {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setCritArrow(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 50, 5);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0, 0, (-50), 6, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
								}
							}
							CreateTheAirWarsMod.queueServerWork(10, () -> {
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setCritArrow(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 50, 5);
									_entityToSpawn.setPos(x, y, z);
									_entityToSpawn.shoot(0, 0, (-50), 6, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
									}
								}
								CreateTheAirWarsMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, float damage, int knockback) {
												AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setCritArrow(true);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, 50, 5);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0, 0, (-50), 6, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
										}
									}
									CreateTheAirWarsMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel projectileLevel) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, float damage, int knockback) {
													AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													entityToSpawn.setCritArrow(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, 50, 5);
											_entityToSpawn.setPos(x, y, z);
											_entityToSpawn.shoot(0, 0, (-50), 6, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
											}
										}
										CreateTheAirWarsMod.queueServerWork(10, () -> {
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, float damage, int knockback) {
														AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setCritArrow(true);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, 50, 5);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0, 0, (-50), 6, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
												}
											}
											{
												BlockPos _bp = BlockPos.containing(x, y, z);
												BlockState _bs = CreateTheAirWarsModBlocks.C_9EMPTYROCKETBOX.get().defaultBlockState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
													if (_property != null && _bs.getValue(_property) != null)
														try {
															_bs = _bs.setValue(_property, (Comparable) entry.getValue());
														} catch (Exception e) {
														}
												}
												world.setBlock(_bp, _bs, 3);
											}
										});
									});
								});
							});
						});
					});
				});
			});
		}
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.SOUTH) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 50, 5);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(0, 0, 50, 6, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
				}
			}
			CreateTheAirWarsMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 50, 5);
					_entityToSpawn.setPos(x, y, z);
					_entityToSpawn.shoot(0, 0, 50, 6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
					}
				}
				CreateTheAirWarsMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setCritArrow(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 50, 5);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot(0, 0, 50, 6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
						}
					}
					CreateTheAirWarsMod.queueServerWork(10, () -> {
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 50, 5);
							_entityToSpawn.setPos(x, y, z);
							_entityToSpawn.shoot(0, 0, 50, 6, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
							}
						}
						CreateTheAirWarsMod.queueServerWork(10, () -> {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setCritArrow(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 50, 5);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(0, 0, 50, 6, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
								}
							}
							CreateTheAirWarsMod.queueServerWork(10, () -> {
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setCritArrow(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 50, 5);
									_entityToSpawn.setPos(x, y, z);
									_entityToSpawn.shoot(0, 0, 50, 6, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
									}
								}
								CreateTheAirWarsMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, float damage, int knockback) {
												AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setCritArrow(true);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, 50, 5);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(0, 0, 50, 6, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
										}
									}
									CreateTheAirWarsMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel projectileLevel) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, float damage, int knockback) {
													AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													entityToSpawn.setCritArrow(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, 50, 5);
											_entityToSpawn.setPos(x, y, z);
											_entityToSpawn.shoot(0, 0, 50, 6, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
											}
										}
										CreateTheAirWarsMod.queueServerWork(10, () -> {
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, float damage, int knockback) {
														AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setCritArrow(true);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, 50, 5);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(0, 0, 50, 6, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
												}
											}
											{
												BlockPos _bp = BlockPos.containing(x, y, z);
												BlockState _bs = CreateTheAirWarsModBlocks.C_9EMPTYROCKETBOX.get().defaultBlockState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
													if (_property != null && _bs.getValue(_property) != null)
														try {
															_bs = _bs.setValue(_property, (Comparable) entry.getValue());
														} catch (Exception e) {
														}
												}
												world.setBlock(_bp, _bs, 3);
											}
										});
									});
								});
							});
						});
					});
				});
			});
		}
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.WEST) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 50, 5);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot((-50), 0, 0, 6, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
				}
			}
			CreateTheAirWarsMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 50, 5);
					_entityToSpawn.setPos(x, y, z);
					_entityToSpawn.shoot((-50), 0, 0, 6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
					}
				}
				CreateTheAirWarsMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setCritArrow(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 50, 5);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot((-50), 0, 0, 6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
						}
					}
					CreateTheAirWarsMod.queueServerWork(10, () -> {
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 50, 5);
							_entityToSpawn.setPos(x, y, z);
							_entityToSpawn.shoot((-50), 0, 0, 6, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
							}
						}
						CreateTheAirWarsMod.queueServerWork(10, () -> {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setCritArrow(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 50, 5);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot((-50), 0, 0, 6, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
								}
							}
							CreateTheAirWarsMod.queueServerWork(10, () -> {
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setCritArrow(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 50, 5);
									_entityToSpawn.setPos(x, y, z);
									_entityToSpawn.shoot((-50), 0, 0, 6, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
									}
								}
								CreateTheAirWarsMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, float damage, int knockback) {
												AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setCritArrow(true);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, 50, 5);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot((-50), 0, 0, 6, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
										}
									}
									CreateTheAirWarsMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel projectileLevel) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, float damage, int knockback) {
													AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													entityToSpawn.setCritArrow(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, 50, 5);
											_entityToSpawn.setPos(x, y, z);
											_entityToSpawn.shoot((-50), 0, 0, 6, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
											}
										}
										CreateTheAirWarsMod.queueServerWork(10, () -> {
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, float damage, int knockback) {
														AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setCritArrow(true);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, 50, 5);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot((-50), 0, 0, 6, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
												}
											}
											{
												BlockPos _bp = BlockPos.containing(x, y, z);
												BlockState _bs = CreateTheAirWarsModBlocks.C_9EMPTYROCKETBOX.get().defaultBlockState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
													if (_property != null && _bs.getValue(_property) != null)
														try {
															_bs = _bs.setValue(_property, (Comparable) entry.getValue());
														} catch (Exception e) {
														}
												}
												world.setBlock(_bp, _bs, 3);
											}
										});
									});
								});
							});
						});
					});
				});
			});
		}
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.EAST) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 50, 5);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(50, 0, 0, 6, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
				}
			}
			CreateTheAirWarsMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 50, 5);
					_entityToSpawn.setPos(x, y, z);
					_entityToSpawn.shoot(50, 0, 0, 6, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
					}
				}
				CreateTheAirWarsMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setCritArrow(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 50, 5);
						_entityToSpawn.setPos(x, y, z);
						_entityToSpawn.shoot(50, 0, 0, 6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
						}
					}
					CreateTheAirWarsMod.queueServerWork(10, () -> {
						if (world instanceof ServerLevel projectileLevel) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback) {
									AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 50, 5);
							_entityToSpawn.setPos(x, y, z);
							_entityToSpawn.shoot(50, 0, 0, 6, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
							}
						}
						CreateTheAirWarsMod.queueServerWork(10, () -> {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, float damage, int knockback) {
										AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setCritArrow(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, 50, 5);
								_entityToSpawn.setPos(x, y, z);
								_entityToSpawn.shoot(50, 0, 0, 6, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
								}
							}
							CreateTheAirWarsMod.queueServerWork(10, () -> {
								if (world instanceof ServerLevel projectileLevel) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, float damage, int knockback) {
											AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setCritArrow(true);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, 50, 5);
									_entityToSpawn.setPos(x, y, z);
									_entityToSpawn.shoot(50, 0, 0, 6, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
									}
								}
								CreateTheAirWarsMod.queueServerWork(10, () -> {
									if (world instanceof ServerLevel projectileLevel) {
										Projectile _entityToSpawn = new Object() {
											public Projectile getArrow(Level level, float damage, int knockback) {
												AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
												entityToSpawn.setBaseDamage(damage);
												entityToSpawn.setKnockback(knockback);
												entityToSpawn.setSilent(true);
												entityToSpawn.setCritArrow(true);
												return entityToSpawn;
											}
										}.getArrow(projectileLevel, 50, 5);
										_entityToSpawn.setPos(x, y, z);
										_entityToSpawn.shoot(50, 0, 0, 6, 0);
										projectileLevel.addFreshEntity(_entityToSpawn);
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
										}
									}
									CreateTheAirWarsMod.queueServerWork(10, () -> {
										if (world instanceof ServerLevel projectileLevel) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, float damage, int knockback) {
													AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													entityToSpawn.setCritArrow(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, 50, 5);
											_entityToSpawn.setPos(x, y, z);
											_entityToSpawn.shoot(50, 0, 0, 6, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
											}
										}
										CreateTheAirWarsMod.queueServerWork(10, () -> {
											if (world instanceof ServerLevel projectileLevel) {
												Projectile _entityToSpawn = new Object() {
													public Projectile getArrow(Level level, float damage, int knockback) {
														AbstractArrow entityToSpawn = new CsdsEntity(CreateTheAirWarsModEntities.CSDS.get(), level);
														entityToSpawn.setBaseDamage(damage);
														entityToSpawn.setKnockback(knockback);
														entityToSpawn.setSilent(true);
														entityToSpawn.setCritArrow(true);
														return entityToSpawn;
													}
												}.getArrow(projectileLevel, 50, 5);
												_entityToSpawn.setPos(x, y, z);
												_entityToSpawn.shoot(50, 0, 0, 6, 0);
												projectileLevel.addFreshEntity(_entityToSpawn);
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:zapusk")), SoundSource.BLOCKS, 5, 1, false);
												}
											}
											{
												BlockPos _bp = BlockPos.containing(x, y, z);
												BlockState _bs = CreateTheAirWarsModBlocks.C_9EMPTYROCKETBOX.get().defaultBlockState();
												BlockState _bso = world.getBlockState(_bp);
												for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
													Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
													if (_property != null && _bs.getValue(_property) != null)
														try {
															_bs = _bs.setValue(_property, (Comparable) entry.getValue());
														} catch (Exception e) {
														}
												}
												world.setBlock(_bp, _bs, 3);
											}
										});
									});
								});
							});
						});
					});
				});
			});
		}
	}
}
