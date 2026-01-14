
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

import hi.item.WtItem;
import hi.item.WiresItem;
import hi.item.TitaniumshovelItem;
import hi.item.TitaniumsheetItem;
import hi.item.TitaniumpickaxeItem;
import hi.item.TitaniumnuggetItem;
import hi.item.TitaniumingotItem;
import hi.item.TitaniumHoeItem;
import hi.item.TitaniumAxeItem;
import hi.item.TargetGunnergadgetItem;
import hi.item.SolidfuelItem;
import hi.item.RoughAmalgamItem;
import hi.item.RocketengineItem;
import hi.item.RocketPlatingItem;
import hi.item.RawtitaniumItem;
import hi.item.RawSulfurItem;
import hi.item.PieceofMirrorItem;
import hi.item.OZENItem;
import hi.item.MiniexplzvItem;
import hi.item.MIRRORItem;
import hi.item.M24Item;
import hi.item.ExplosiveItem;
import hi.item.DisplayItem;
import hi.item.CrushedAmalgamItem;
import hi.item.CrashedtitaniumItem;
import hi.item.CrashedsulfurItem;
import hi.item.ChipItem;
import hi.item.ChickItem;
import hi.item.BigexplzvItem;
import hi.item.AntennaItem;
import hi.item.AmpilifierItem;
import hi.item.AmalgamBucketItem;
import hi.item.AirstrikeGrenadeItem;
import hi.item.ActivatorItem;

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
	public static final RegistryObject<Item> CHIP = REGISTRY.register("chip", () -> new ChipItem());
	public static final RegistryObject<Item> ZM_54_EBULLET = block(CreateTheAirWarsModBlocks.ZM_54_EBULLET);
	public static final RegistryObject<Item> ZM_54_E = block(CreateTheAirWarsModBlocks.ZM_54_E);
	public static final RegistryObject<Item> TARGET_GUNNERGADGET = REGISTRY.register("target_gunnergadget", () -> new TargetGunnergadgetItem());
	public static final RegistryObject<Item> GDFFGDGDG = block(CreateTheAirWarsModBlocks.GDFFGDGDG);
	public static final RegistryObject<Item> OZM_72 = block(CreateTheAirWarsModBlocks.OZM_72);
	public static final RegistryObject<Item> RAWTITANIUM = REGISTRY.register("rawtitanium", () -> new RawtitaniumItem());
	public static final RegistryObject<Item> TITANIUMINGOT = REGISTRY.register("titaniumingot", () -> new TitaniumingotItem());
	public static final RegistryObject<Item> DEEPSLATETITANIUMORE = block(CreateTheAirWarsModBlocks.DEEPSLATETITANIUMORE);
	public static final RegistryObject<Item> ACTIVATOR = REGISTRY.register("activator", () -> new ActivatorItem());
	public static final RegistryObject<Item> EXPLOSIVE = REGISTRY.register("explosive", () -> new ExplosiveItem());
	public static final RegistryObject<Item> ROCKETENGINE = REGISTRY.register("rocketengine", () -> new RocketengineItem());
	public static final RegistryObject<Item> RIM_7 = block(CreateTheAirWarsModBlocks.RIM_7);
	public static final RegistryObject<Item> RIM_7ACTIVE = block(CreateTheAirWarsModBlocks.RIM_7ACTIVE);
	public static final RegistryObject<Item> TITANIUM_ORE = block(CreateTheAirWarsModBlocks.TITANIUM_ORE);
	public static final RegistryObject<Item> NINE_K_119M = block(CreateTheAirWarsModBlocks.NINE_K_119M);
	public static final RegistryObject<Item> NINEK_119MACTV = block(CreateTheAirWarsModBlocks.NINEK_119MACTV);
	public static final RegistryObject<Item> C_25A = block(CreateTheAirWarsModBlocks.C_25A);
	public static final RegistryObject<Item> C_25ACTV = block(CreateTheAirWarsModBlocks.C_25ACTV);
	public static final RegistryObject<Item> M_24 = REGISTRY.register("m_24", () -> new M24Item());
	public static final RegistryObject<Item> MINIEXPLZV = REGISTRY.register("miniexplzv", () -> new MiniexplzvItem());
	public static final RegistryObject<Item> BIGEXPLZV = REGISTRY.register("bigexplzv", () -> new BigexplzvItem());
	public static final RegistryObject<Item> WT = REGISTRY.register("wt", () -> new WtItem());
	public static final RegistryObject<Item> CRASHEDTITANIUM = REGISTRY.register("crashedtitanium", () -> new CrashedtitaniumItem());
	public static final RegistryObject<Item> TITANIUMSHEET = REGISTRY.register("titaniumsheet", () -> new TitaniumsheetItem());
	public static final RegistryObject<Item> TITANIUMNUGGET = REGISTRY.register("titaniumnugget", () -> new TitaniumnuggetItem());
	public static final RegistryObject<Item> ANTENNA = REGISTRY.register("antenna", () -> new AntennaItem());
	public static final RegistryObject<Item> CHICK = REGISTRY.register("chick", () -> new ChickItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUMPICKAXE = REGISTRY.register("titaniumpickaxe", () -> new TitaniumpickaxeItem());
	public static final RegistryObject<Item> TITANIUMSHOVEL = REGISTRY.register("titaniumshovel", () -> new TitaniumshovelItem());
	public static final RegistryObject<Item> TITANIUM_HOE = REGISTRY.register("titanium_hoe", () -> new TitaniumHoeItem());
	public static final RegistryObject<Item> TOMAHAWK = block(CreateTheAirWarsModBlocks.TOMAHAWK);
	public static final RegistryObject<Item> THTRUE = block(CreateTheAirWarsModBlocks.THTRUE);
	public static final RegistryObject<Item> SULFUR_ORE = block(CreateTheAirWarsModBlocks.SULFUR_ORE);
	public static final RegistryObject<Item> RAW_SULFUR = REGISTRY.register("raw_sulfur", () -> new RawSulfurItem());
	public static final RegistryObject<Item> DEEPDLATESULFURORE = block(CreateTheAirWarsModBlocks.DEEPDLATESULFURORE);
	public static final RegistryObject<Item> CRASHEDSULFUR = REGISTRY.register("crashedsulfur", () -> new CrashedsulfurItem());
	public static final RegistryObject<Item> TITANIUMBLOCK = block(CreateTheAirWarsModBlocks.TITANIUMBLOCK);
	public static final RegistryObject<Item> SONAR = block(CreateTheAirWarsModBlocks.SONAR);
	public static final RegistryObject<Item> ROUGH_AMALGAM = REGISTRY.register("rough_amalgam", () -> new RoughAmalgamItem());
	public static final RegistryObject<Item> AMALGAM_ORE = block(CreateTheAirWarsModBlocks.AMALGAM_ORE);
	public static final RegistryObject<Item> DEEP_STATE_AMALGAM_ORE = block(CreateTheAirWarsModBlocks.DEEP_STATE_AMALGAM_ORE);
	public static final RegistryObject<Item> CRUSHED_AMALGAM = REGISTRY.register("crushed_amalgam", () -> new CrushedAmalgamItem());
	public static final RegistryObject<Item> AMALGAM_BUCKET_BUCKET = REGISTRY.register("amalgam_bucket_bucket", () -> new AmalgamBucketItem());
	public static final RegistryObject<Item> MIRROR = REGISTRY.register("mirror", () -> new MIRRORItem());
	public static final RegistryObject<Item> PIECEOF_MIRROR = REGISTRY.register("pieceof_mirror", () -> new PieceofMirrorItem());
	public static final RegistryObject<Item> WIRES = REGISTRY.register("wires", () -> new WiresItem());
	public static final RegistryObject<Item> DISPLAY = REGISTRY.register("display", () -> new DisplayItem());
	public static final RegistryObject<Item> AMPILIFIER = REGISTRY.register("ampilifier", () -> new AmpilifierItem());
	public static final RegistryObject<Item> FAB_3000TRUEBLOCK = block(CreateTheAirWarsModBlocks.FAB_3000TRUEBLOCK);
	public static final RegistryObject<Item> FAB_3000 = block(CreateTheAirWarsModBlocks.FAB_3000);
	public static final RegistryObject<Item> AIRSTRIKE_GRENADE = REGISTRY.register("airstrike_grenade", () -> new AirstrikeGrenadeItem());
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
