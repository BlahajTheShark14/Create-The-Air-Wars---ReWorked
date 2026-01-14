package hi.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

import hi.network.CreateTheAirWarsModVariables;

public class FdgddKazhdyiTikPokaIntierfieisOtkrytProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		CreateTheAirWarsModVariables.MapVariables.get(world).ZM54E = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:cordSE") ? ((EditBox) guistate.get("text:cordSE")).getValue() : "");
		CreateTheAirWarsModVariables.MapVariables.get(world).syncData(world);
	}
}
