
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import hi.world.inventory.MgMenu;
import hi.world.inventory.FdgddMenu;
import hi.world.inventory.DfgdfgMenu;

import hi.CreateTheAirWarsMod;

public class CreateTheAirWarsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<MenuType<FdgddMenu>> FDGDD = REGISTRY.register("fdgdd", () -> IForgeMenuType.create(FdgddMenu::new));
	public static final RegistryObject<MenuType<DfgdfgMenu>> DFGDFG = REGISTRY.register("dfgdfg", () -> IForgeMenuType.create(DfgdfgMenu::new));
	public static final RegistryObject<MenuType<MgMenu>> MG = REGISTRY.register("mg", () -> IForgeMenuType.create(MgMenu::new));
}
