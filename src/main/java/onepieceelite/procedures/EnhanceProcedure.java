package onepieceelite.procedures;

import onepieceelite.OnePieceEliteModVariables;

import onepieceelite.OnePieceEliteModElements;

import onepieceelite.OnePieceEliteMod;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import java.util.function.Supplier;
import java.util.Map;

@OnePieceEliteModElements.ModElement.Tag
public class EnhanceProcedure extends OnePieceEliteModElements.ModElement {
	public EnhanceProcedure(OnePieceEliteModElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OnePieceEliteMod.LOGGER.warn("Failed to load dependency entity for procedure Enhance!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new OnePieceEliteModVariables.PlayerVariables())).EnhancementPoints) > 0) && ((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() instanceof SwordItem))) {
			{
				double _setval = (double) (((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OnePieceEliteModVariables.PlayerVariables())).EnhancementPoints) - 1);
				entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnhancementPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) ((EnchantmentHelper.getEnchantmentLevel(Enchantments.SHARPNESS, (new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))))) + 1);
				entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SharpnessLevelStorageForEnhancement = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))));
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments, (new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0))));
				}
			}
			((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0)))).addEnchantment(Enchantments.SHARPNESS,
					(int) ((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new OnePieceEliteModVariables.PlayerVariables())).SharpnessLevelStorageForEnhancement));
			{
				double _setval = (double) 0;
				entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.SharpnessLevelStorageForEnhancement = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
