
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import hi.item.TargetGunnergadgetItem;
import hi.item.SolidfuelItem;
import hi.item.RocketPlatingItem;
import hi.item.OZENItem;

import hi.CreateTheAirWarsMod;

public class CreateTheAirWarsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateTheAirWarsMod.MODID);
	public static final RegistryObject<Item> AIM_9ROCKET = block(CreateTheAirWarsModBlocks.AIM_9ROCKET);
	public static final RegistryObject<Item> CATCHER = block(CreateTheAirWarsModBlocks.CATCHER);
	public static final RegistryObject<Item> AIM9_PROJECTLE = block(CreateTheAirWarsModBlocks.AIM9_PROJECTLE);
	public static final RegistryObject<Item> OZEN = REGISTRY.register("ozen", () -> new OZENItem());
	public static final RegistryObject<Item> C_3K = block(CreateTheAirWarsModBlocks.C_3K);
	public static final RegistryObject<Item> DSFSDSF = block(CreateTheAirWarsModBlocks.DSFSDSF);
	public static final RegistryObject<Item> C_9_ROCKETBOX = block(CreateTheAirWarsModBlocks.C_9_ROCKETBOX);
	public static final RegistryObject<Item> C_9EMPTYROCKETBOX = block(CreateTheAirWarsModBlocks.C_9EMPTYROCKETBOX);
	public static final RegistryObject<Item> EFSSDFSDF = block(CreateTheAirWarsModBlocks.EFSSDFSDF);
	public static final RegistryObject<Item> GTDFDGF = block(CreateTheAirWarsModBlocks.GTDFDGF);
	public static final RegistryObject<Item> SC_250 = block(CreateTheAirWarsModBlocks.SC_250);
	public static final RegistryObject<Item> ZM_54_EBULLET = block(CreateTheAirWarsModBlocks.ZM_54_EBULLET);
	public static final RegistryObject<Item> ZM_54_E = block(CreateTheAirWarsModBlocks.ZM_54_E);
	public static final RegistryObject<Item> TARGET_GUNNERGADGET = REGISTRY.register("target_gunnergadget", () -> new TargetGunnergadgetItem());
	public static final RegistryObject<Item> GDFFGDGDG = block(CreateTheAirWarsModBlocks.GDFFGDGDG);
	public static final RegistryObject<Item> OZM_72 = block(CreateTheAirWarsModBlocks.OZM_72);
	public static final RegistryObject<Item> RIM_7 = block(CreateTheAirWarsModBlocks.RIM_7);
	public static final RegistryObject<Item> RIM_7ACTIVE = block(CreateTheAirWarsModBlocks.RIM_7ACTIVE);
	public static final RegistryObject<Item> NINE_K_119M = block(CreateTheAirWarsModBlocks.NINE_K_119M);
	public static final RegistryObject<Item> NINEK_119MACTV = block(CreateTheAirWarsModBlocks.NINEK_119MACTV);
	public static final RegistryObject<Item> C_25A = block(CreateTheAirWarsModBlocks.C_25A);
	public static final RegistryObject<Item> C_25ACTV = block(CreateTheAirWarsModBlocks.C_25ACTV);
	public static final RegistryObject<Item> TOMAHAWK = block(CreateTheAirWarsModBlocks.TOMAHAWK);
	public static final RegistryObject<Item> THTRUE = block(CreateTheAirWarsModBlocks.THTRUE);
	public static final RegistryObject<Item> FAB_3000TRUEBLOCK = block(CreateTheAirWarsModBlocks.FAB_3000TRUEBLOCK);
	public static final RegistryObject<Item> FAB_3000 = block(CreateTheAirWarsModBlocks.FAB_3000);
	public static final RegistryObject<Item> SOLIDFUEL = REGISTRY.register("solidfuel", () -> new SolidfuelItem());
	public static final RegistryObject<Item> ROCKET_PLATING = REGISTRY.register("rocket_plating", () -> new RocketPlatingItem());
	public static final RegistryObject<Item> SOLID_FUEL_CORE = block(CreateTheAirWarsModBlocks.SOLID_FUEL_CORE);
	public static final RegistryObject<Item> LARGE_PROPELLER_BLADE = block(CreateTheAirWarsModBlocks.LARGE_PROPELLER_BLADE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
