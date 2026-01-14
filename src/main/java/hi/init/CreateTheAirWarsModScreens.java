
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import hi.client.gui.UfyScreen;
import hi.client.gui.MgScreen;
import hi.client.gui.FdgddScreen;
import hi.client.gui.DfgdfgScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreateTheAirWarsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CreateTheAirWarsModMenus.FDGDD.get(), FdgddScreen::new);
			MenuScreens.register(CreateTheAirWarsModMenus.DFGDFG.get(), DfgdfgScreen::new);
			MenuScreens.register(CreateTheAirWarsModMenus.UFY.get(), UfyScreen::new);
			MenuScreens.register(CreateTheAirWarsModMenus.MG.get(), MgScreen::new);
		});
	}
}
