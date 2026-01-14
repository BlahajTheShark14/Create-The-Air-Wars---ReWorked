
package hi.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class OZENItem extends RecordItem {
	public OZENItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("create_the_air_wars:ozen")), new Item.Properties().stacksTo(64).rarity(Rarity.EPIC), 1840);
	}
}
