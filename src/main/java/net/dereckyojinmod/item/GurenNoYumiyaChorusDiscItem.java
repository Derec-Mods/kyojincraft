
package net.dereckyojinmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.dereckyojinmod.itemgroup.AttackOnTitanMusicItemGroup;
import net.dereckyojinmod.DerecKyojinmodModElements;

import java.util.List;

@DerecKyojinmodModElements.ModElement.Tag
public class GurenNoYumiyaChorusDiscItem extends DerecKyojinmodModElements.ModElement {
	@ObjectHolder("derec_kyojinmod:guren_no_yumiya_chorus_disc")
	public static final Item block = null;
	public GurenNoYumiyaChorusDiscItem(DerecKyojinmodModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DerecKyojinmodModElements.sounds.get(new ResourceLocation("derec_kyojinmod:gurenoyumiyachorus")),
					new Item.Properties().group(AttackOnTitanMusicItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("guren_no_yumiya_chorus_disc");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Go check them out on Spotify and Youtube!"));
		}
	}
}
