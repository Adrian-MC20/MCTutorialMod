package maleficent.pinkweaponmod;

import maleficent.pinkweaponmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PinkWeaponMod implements ModInitializer {
	public static final String MOD_ID = "pinkweaponmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}