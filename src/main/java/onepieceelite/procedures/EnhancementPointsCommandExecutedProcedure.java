package onepieceelite.procedures;

import onepieceelite.OnePieceEliteModVariables;

import onepieceelite.OnePieceEliteModElements;

import onepieceelite.OnePieceEliteMod;

import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

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
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				OnePieceEliteMod.LOGGER.warn("Failed to load dependency cmdparams for procedure EnhancementPointsCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("1"))) {
			{
				double _setval = (double) (((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OnePieceEliteModVariables.PlayerVariables())).EnhancementPoints) + 1);
				entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnhancementPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("5"))) {
			{
				double _setval = (double) (((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OnePieceEliteModVariables.PlayerVariables())).EnhancementPoints) + 5);
				entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnhancementPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("10"))) {
			{
				double _setval = (double) (((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OnePieceEliteModVariables.PlayerVariables())).EnhancementPoints) + 10);
				entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnhancementPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText())).equals("100"))) {
			{
				double _setval = (double) (((entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new OnePieceEliteModVariables.PlayerVariables())).EnhancementPoints) + 100);
				entity.getCapability(OnePieceEliteModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnhancementPoints = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
