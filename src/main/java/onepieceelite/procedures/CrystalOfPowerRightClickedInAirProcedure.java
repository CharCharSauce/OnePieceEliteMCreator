package onepieceelite.procedures;

import onepieceelite.item.CrystalOfPowerItem;

import onepieceelite.OnePieceEliteModVariables;

import onepieceelite.OnePieceEliteModElements;

import onepieceelite.OnePieceEliteMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@OnePieceEliteModElements.ModElement.Tag
public class CrystalOfPowerRightClickedInAirProcedure extends OnePieceEliteModElements.ModElement {
	public CrystalOfPowerRightClickedInAirProcedure(OnePieceEliteModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OnePieceEliteMod.LOGGER.warn("Failed to load dependency entity for procedure CrystalOfPowerRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(CrystalOfPowerItem.block, (int) (1));
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
		}
		{
			double _setval = (double) (((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new OnePieceEliteModVariables.PlayerVariables())).EnhancementPoints) + 1);
			entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EnhancementPoints = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
