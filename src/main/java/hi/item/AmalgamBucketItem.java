
package hi.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import hi.init.CreateTheAirWarsModFluids;

public class AmalgamBucketItem extends BucketItem {
	public AmalgamBucketItem() {
		super(CreateTheAirWarsModFluids.AMALGAM_BUCKET, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
