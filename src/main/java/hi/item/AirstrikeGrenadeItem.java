
package hi.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import hi.procedures.AirstrikeGrenadePriShchielchkiePKMProcedure;

public class AirstrikeGrenadeItem extends Item {
	public AirstrikeGrenadeItem() {
		super(new Item.Properties().stacksTo(5).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AirstrikeGrenadePriShchielchkiePKMProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
