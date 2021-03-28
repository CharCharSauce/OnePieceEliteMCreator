
package onepieceelite.itemgroup;

import onepieceelite.item.CoinItem;

import onepieceelite.OnePieceEliteModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@OnePieceEliteModElements.ModElement.Tag
public class LeSaucyExtensionItemGroup extends OnePieceEliteModElements.ModElement {
	public LeSaucyExtensionItemGroup(OnePieceEliteModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("table_saucy_extension") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CoinItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
