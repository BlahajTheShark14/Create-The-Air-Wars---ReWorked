
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
				tabData.accept(CreateTheAirWarsModBlocks.ZM_54_E.get().asItem());
				tabData.accept(CreateTheAirWarsModItems.TARGET_GUNNERGADGET.get());
				tabData.accept(CreateTheAirWarsModBlocks.OZM_72.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.RIM_7.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.NINE_K_119M.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.C_25A.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.TOMAHAWK.get().asItem());
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
				tabData.accept(CreateTheAirWarsModBlocks.TOMAHAWK.get().asItem());
				tabData.accept(CreateTheAirWarsModBlocks.FAB_3000.get().asItem());
			}).withTabsBefore(CREATETHEAIRWAR.getId()).build());
	public static final RegistryObject<CreativeModeTab> CREATETWI = REGISTRY.register("createtwi",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_the_air_wars.createtwi")).icon(() -> new ItemStack(CreateTheAirWarsModItems.TARGET_GUNNERGADGET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateTheAirWarsModItems.OZEN.get());
				tabData.accept(CreateTheAirWarsModItems.TARGET_GUNNERGADGET.get());
			}).withTabsBefore(CTAWW.getId()).build());
}
