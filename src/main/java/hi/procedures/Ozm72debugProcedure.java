package hi.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;

import hi.init.CreateTheAirWarsModBlocks;

public class Ozm72debugProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _isc = itemstack;
			final ItemStack _setstack = new ItemStack(CreateTheAirWarsModBlocks.GDFFGDGDG.get()).copy();
			final int _sltid = 1;
			_setstack.setCount(1);
			_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable itemHandlerModifiable) {
					itemHandlerModifiable.setStackInSlot(_sltid, _setstack);
				}
			});
		}
	}
}
