package onepieceelite.procedures;

import onepieceelite.OnePieceEliteModVariables;

import onepieceelite.OnePieceEliteModElements;

import onepieceelite.OnePieceEliteMod;

import net.minecraft.entity.Entity;

import java.util.Map;

@OnePieceEliteModElements.ModElement.Tag
public class EnhancementPointsCommandExecutedProcedure extends OnePieceEliteModElements.ModElement {
	public EnhancementPointsCommandExecutedProcedure(OnePieceEliteModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OnePieceEliteMod.LOGGER.warn("Failed to load dependency entity for procedure EnhancementPointsCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
