
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import hi.CreateTheAirWarsMod;

public class CreateTheAirWarsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATETHEAIRWAR = REGISTRY.register("createtheairwar",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_the_air_wars.createtheairwar")).icon(() -> new ItemStack(CreateTheAirWarsModBlocks.RIM_7.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateTheAirWarsModBlocks.AIM_9ROCKET.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.CATCHER.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.OZEN.get());
				tabData.accept(CreateTheAirWarsModBlocks.C_3K.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.C_9_ROCKETBOX.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.C_9EMPTYROCKETBOX.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.EFSSDFSDF.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.SC_250.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.CHIP.get());
				tabData.accept(CreateTheAirWarsModBlocks.ZM_54_E.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.TARGET_GUNNERGADGET.get());
				tabData.accept(CreateTheAirWarsModBlocks.OZM_72.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.RAWTITANIUM.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMINGOT.get());
				tabData.accept(CreateTheAirWarsModBlocks.DEEPSLATETITANIUMORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.ACTIVATOR.get());
				tabData.accept(CreateTheAirWarsModItems.EXPLOSIVE.get());
				tabData.accept(CreateTheAirWarsModItems.ROCKETENGINE.get());
				tabData.accept(CreateTheAirWarsModBlocks.RIM_7.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.TITANIUM_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.NINE_K_119M.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.C_25A.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.M_24.get());
				tabData.accept(CreateTheAirWarsModItems.MINIEXPLZV.get());
				tabData.accept(CreateTheAirWarsModItems.BIGEXPLZV.get());
				tabData.accept(CreateTheAirWarsModItems.WT.get());
				tabData.accept(CreateTheAirWarsModItems.CRASHEDTITANIUM.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMSHEET.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMNUGGET.get());
				tabData.accept(CreateTheAirWarsModItems.ANTENNA.get());
				tabData.accept(CreateTheAirWarsModItems.CHICK.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUM_AXE.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMPICKAXE.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMSHOVEL.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUM_HOE.get());
				tabData.accept(CreateTheAirWarsModBlocks.TOMAHAWK.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.SULFUR_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.RAW_SULFUR.get());
				tabData.accept(CreateTheAirWarsModBlocks.DEEPDLATESULFURORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.CRASHEDSULFUR.get());
				tabData.accept(CreateTheAirWarsModBlocks.TITANIUMBLOCK.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.SONAR.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.ROUGH_AMALGAM.get());
				tabData.accept(CreateTheAirWarsModBlocks.AMALGAM_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.DEEP_STATE_AMALGAM_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.CRUSHED_AMALGAM.get());
				tabData.accept(CreateTheAirWarsModItems.AMALGAM_BUCKET_BUCKET.get());
				tabData.accept(CreateTheAirWarsModItems.MIRROR.get());
				tabData.accept(CreateTheAirWarsModItems.PIECEOF_MIRROR.get());
				tabData.accept(CreateTheAirWarsModItems.WIRES.get());
				tabData.accept(CreateTheAirWarsModItems.DISPLAY.get());
				tabData.accept(CreateTheAirWarsModItems.AMPILIFIER.get());
				tabData.accept(CreateTheAirWarsModItems.AIRSTRIKE_GRENADE.get());
				tabData.accept(CreateTheAirWarsModItems.SOLIDFUEL.get());
				tabData.accept(CreateTheAirWarsModBlocks.SOLID_FUEL_CORE.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.LARGE_PROPELLER_BLADE.get().asItem());
			}).build());
	public static final RegistryObject<CreativeModeTab> CTAWW = REGISTRY.register("ctaww",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_the_air_wars.ctaww")).icon(() -> new ItemStack(CreateTheAirWarsModBlocks.TOMAHAWK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateTheAirWarsModBlocks.AIM_9ROCKET.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.C_3K.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.C_9_ROCKETBOX.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.EFSSDFSDF.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.SC_250.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.ZM_54_E.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.OZM_72.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.RIM_7.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.NINE_K_119M.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.C_25A.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.M_24.get());
				tabData.accept(CreateTheAirWarsModBlocks.TOMAHAWK.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.FAB_3000.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.AIRSTRIKE_GRENADE.get());
			}).withTabsBefore(CREATETHEAIRWAR.getId()).build());
	public static final RegistryObject<CreativeModeTab> CREATETWI = REGISTRY.register("createtwi",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_the_air_wars.createtwi")).icon(() -> new ItemStack(CreateTheAirWarsModItems.TITANIUMINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateTheAirWarsModItems.OZEN.get());
				tabData.accept(CreateTheAirWarsModItems.CHIP.get());
				tabData.accept(CreateTheAirWarsModItems.TARGET_GUNNERGADGET.get());
				tabData.accept(CreateTheAirWarsModItems.RAWTITANIUM.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMINGOT.get());
				tabData.accept(CreateTheAirWarsModBlocks.DEEPSLATETITANIUMORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.ACTIVATOR.get());
				tabData.accept(CreateTheAirWarsModItems.EXPLOSIVE.get());
				tabData.accept(CreateTheAirWarsModItems.ROCKETENGINE.get());
				tabData.accept(CreateTheAirWarsModBlocks.TITANIUM_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.MINIEXPLZV.get());
				tabData.accept(CreateTheAirWarsModItems.BIGEXPLZV.get());
				tabData.accept(CreateTheAirWarsModItems.WT.get());
				tabData.accept(CreateTheAirWarsModItems.CRASHEDTITANIUM.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMSHEET.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMNUGGET.get());
				tabData.accept(CreateTheAirWarsModItems.ANTENNA.get());
				tabData.accept(CreateTheAirWarsModItems.CHICK.get());
				tabData.accept(CreateTheAirWarsModBlocks.SULFUR_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.RAW_SULFUR.get());
				tabData.accept(CreateTheAirWarsModBlocks.DEEPDLATESULFURORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.CRASHEDSULFUR.get());
				tabData.accept(CreateTheAirWarsModBlocks.TITANIUMBLOCK.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.AMALGAM_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.DEEP_STATE_AMALGAM_ORE.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.CRUSHED_AMALGAM.get());
				tabData.accept(CreateTheAirWarsModItems.AMALGAM_BUCKET_BUCKET.get());
				tabData.accept(CreateTheAirWarsModItems.MIRROR.get());
				tabData.accept(CreateTheAirWarsModItems.PIECEOF_MIRROR.get());
				tabData.accept(CreateTheAirWarsModItems.WIRES.get());
				tabData.accept(CreateTheAirWarsModItems.DISPLAY.get());
			}).withTabsBefore(CTAWW.getId()).build());
	public static final RegistryObject<CreativeModeTab> CREATETAWI = REGISTRY.register("createtawi",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_the_air_wars.createtawi")).icon(() -> new ItemStack(CreateTheAirWarsModItems.TITANIUMPICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateTheAirWarsModItems.TITANIUM_AXE.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMPICKAXE.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUMSHOVEL.get());
				tabData.accept(CreateTheAirWarsModItems.TITANIUM_HOE.get());
				tabData.accept(CreateTheAirWarsModItems.AMALGAM_BUCKET_BUCKET.get());
				tabData.accept(CreateTheAirWarsModItems.AIRSTRIKE_GRENADE.get());
			}).withTabsBefore(CREATETWI.getId()).build());
}
