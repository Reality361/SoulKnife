package net.mcreator.soulknife.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.soulknife.init.SoulKnifeModEnchantments;

public class SoulKnifeCheckIfHasInfiniteSoulSharpnessProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.INFINITE_SOUL_SHARPNESS.get()) != 0) {
			return 1;
		}
		return 0;
	}
}
