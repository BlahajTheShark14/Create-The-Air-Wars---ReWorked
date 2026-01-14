
package hi.potion;

import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

public class LocationMobEffect extends MobEffect {
	public LocationMobEffect() {
		super(MobEffectCategory.NEUTRAL, -65536);
		this.addAttributeModifier(ForgeMod.NAMETAG_DISTANCE.get(), "4a351e2e-c6aa-3534-be1d-93955d9c436c", 200, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(ForgeMod.ENTITY_REACH.get(), "36734528-8338-3c22-86a6-4d4e0821db7d", 200, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, "006f4e9c-5945-34db-95e2-665a0bc82d27", 200, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
