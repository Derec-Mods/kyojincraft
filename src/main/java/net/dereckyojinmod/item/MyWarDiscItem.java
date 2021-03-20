
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
public class MyWarDiscItem extends DerecKyojinmodModElements.ModElement {
	@ObjectHolder("derec_kyojinmod:my_war_disc")
	public static final Item block = null;
	public MyWarDiscItem(DerecKyojinmodModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, DerecKyojinmodModElements.sounds.get(new ResourceLocation("derec_kyojinmod:mywar")),
					new Item.Properties().group(AttackOnTitanMusicItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("my_war_disc");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Go check them out on Spotify and Youtube!"));
		}
	}
}
