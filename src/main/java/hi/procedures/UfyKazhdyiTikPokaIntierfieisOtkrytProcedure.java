package hi.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

import hi.network.CreateTheAirWarsModVariables;

public class UfyKazhdyiTikPokaIntierfieisOtkrytProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:output") instanceof EditBox _tf)
			_tf.setValue(CreateTheAirWarsModVariables.MapVariables.get(world).WT);
	}
}
