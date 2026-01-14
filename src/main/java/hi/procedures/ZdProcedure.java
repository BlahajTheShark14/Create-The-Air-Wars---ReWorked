package hi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

import hi.network.CreateTheAirWarsModVariables;

public class ZdProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		CreateTheAirWarsModVariables.MapVariables.get(world).WT = guistate.containsKey("text:input") ? ((EditBox) guistate.get("text:input")).getValue() : "";
		CreateTheAirWarsModVariables.MapVariables.get(world).syncData(world);
	}
}
