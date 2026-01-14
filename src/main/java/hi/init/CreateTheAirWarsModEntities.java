
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import hi.entity.Zm54bullEntity;
import hi.entity.TomahawkbultEntity;
import hi.entity.Rim7actvbultEntity;
import hi.entity.Ninek119mactvbultEntity;
import hi.entity.M24bultEntity;
import hi.entity.GvrdcrcdEntity;
import hi.entity.Fab3000trueEntity;
import hi.entity.CsdsEntity;
import hi.entity.C3ktrueEntity;
import hi.entity.C25actvbultEntity;
import hi.entity.C25Entity;
import hi.entity.BgghEntity;
import hi.entity.AstrkEntity;
import hi.entity.AIM9ROCKETTRUEEntity;

import hi.CreateTheAirWarsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreateTheAirWarsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<EntityType<AIM9ROCKETTRUEEntity>> AIM_9_ROCKETTRUE = register("aim_9_rockettrue",
			EntityType.Builder.<AIM9ROCKETTRUEEntity>of(AIM9ROCKETTRUEEntity::new, MobCategory.MISC).setCustomClientFactory(AIM9ROCKETTRUEEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<C3ktrueEntity>> C_3KTRUE = register("c_3ktrue",
			EntityType.Builder.<C3ktrueEntity>of(C3ktrueEntity::new, MobCategory.MISC).setCustomClientFactory(C3ktrueEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CsdsEntity>> CSDS = register("csds",
			EntityType.Builder.<CsdsEntity>of(CsdsEntity::new, MobCategory.MISC).setCustomClientFactory(CsdsEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GvrdcrcdEntity>> GVRDCRCD = register("gvrdcrcd",
			EntityType.Builder.<GvrdcrcdEntity>of(GvrdcrcdEntity::new, MobCategory.MISC).setCustomClientFactory(GvrdcrcdEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Zm54bullEntity>> ZM_54BULL = register("zm_54bull",
			EntityType.Builder.<Zm54bullEntity>of(Zm54bullEntity::new, MobCategory.MISC).setCustomClientFactory(Zm54bullEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<C25Entity>> C_25 = register("c_25",
			EntityType.Builder.<C25Entity>of(C25Entity::new, MobCategory.MISC).setCustomClientFactory(C25Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Rim7actvbultEntity>> RIM_7ACTVBULT = register("rim_7actvbult",
			EntityType.Builder.<Rim7actvbultEntity>of(Rim7actvbultEntity::new, MobCategory.MISC).setCustomClientFactory(Rim7actvbultEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Ninek119mactvbultEntity>> NINEK_119MACTVBULT = register("ninek_119mactvbult", EntityType.Builder.<Ninek119mactvbultEntity>of(Ninek119mactvbultEntity::new, MobCategory.MISC)
			.setCustomClientFactory(Ninek119mactvbultEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<C25actvbultEntity>> C_25ACTVBULT = register("c_25actvbult",
			EntityType.Builder.<C25actvbultEntity>of(C25actvbultEntity::new, MobCategory.MISC).setCustomClientFactory(C25actvbultEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<M24bultEntity>> M_24BULT = register("m_24bult",
			EntityType.Builder.<M24bultEntity>of(M24bultEntity::new, MobCategory.MISC).setCustomClientFactory(M24bultEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TomahawkbultEntity>> TOMAHAWKBULT = register("tomahawkbult",
			EntityType.Builder.<TomahawkbultEntity>of(TomahawkbultEntity::new, MobCategory.MISC).setCustomClientFactory(TomahawkbultEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BgghEntity>> BGGH = register("bggh",
			EntityType.Builder.<BgghEntity>of(BgghEntity::new, MobCategory.MISC).setCustomClientFactory(BgghEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Fab3000trueEntity>> FAB_3000TRUE = register("fab_3000true",
			EntityType.Builder.<Fab3000trueEntity>of(Fab3000trueEntity::new, MobCategory.MISC).setCustomClientFactory(Fab3000trueEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AstrkEntity>> ASTRK = register("astrk",
			EntityType.Builder.<AstrkEntity>of(AstrkEntity::new, MobCategory.MISC).setCustomClientFactory(AstrkEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
