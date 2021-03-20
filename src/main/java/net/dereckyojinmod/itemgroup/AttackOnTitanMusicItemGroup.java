
package net.dereckyojinmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.dereckyojinmod.DerecKyojinmodModElements;

@DerecKyojinmodModElements.ModElement.Tag
public class AttackOnTitanMusicItemGroup extends DerecKyojinmodModElements.ModElement {
	public AttackOnTitanMusicItemGroup(DerecKyojinmodModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabattack_on_titan_music") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.TORCH, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
