
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soulknife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.soulknife.enchantment.UltraSoulSharpnessEnchantment;
import net.mcreator.soulknife.enchantment.SuperSoulSharpnessEnchantment;
import net.mcreator.soulknife.enchantment.SoulSharpnessEnchantment;
import net.mcreator.soulknife.enchantment.InfiniteSoulSharpnessEnchantment;
import net.mcreator.soulknife.SoulKnifeMod;

public class SoulKnifeModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SoulKnifeMod.MODID);
	public static final RegistryObject<Enchantment> SOUL_SHARPNESS = REGISTRY.register("soul_sharpness", () -> new SoulSharpnessEnchantment());
	public static final RegistryObject<Enchantment> SUPER_SOUL_SHARPNESS = REGISTRY.register("super_soul_sharpness", () -> new SuperSoulSharpnessEnchantment());
	public static final RegistryObject<Enchantment> ULTRA_SOUL_SHARPNESS = REGISTRY.register("ultra_soul_sharpness", () -> new UltraSoulSharpnessEnchantment());
	public static final RegistryObject<Enchantment> INFINITE_SOUL_SHARPNESS = REGISTRY.register("infinite_soul_sharpness", () -> new InfiniteSoulSharpnessEnchantment());
}
