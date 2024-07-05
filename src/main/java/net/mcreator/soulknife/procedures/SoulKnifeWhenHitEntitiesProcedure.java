package net.mcreator.soulknife.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.soulknife.init.SoulKnifeModEnchantments;

import java.util.Map;

public class SoulKnifeWhenHitEntitiesProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double previousSoulSharpnessLevel = 0;
		double previousSSSL = 0;
		double previousUSSL = 0;
		double previousISSL = 0;
		if (itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.INFINITE_SOUL_SHARPNESS.get()) != 0) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK), sourceentity),
					(float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) + itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.INFINITE_SOUL_SHARPNESS.get()) * 9999 + 3));
		} else {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK), sourceentity), (float) (itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.SOUL_SHARPNESS.get())
					+ itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get()) * 10 + itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get()) * 100 + 3));
			if (!entity.isAlive()) {
				previousSoulSharpnessLevel = itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.SOUL_SHARPNESS.get());
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(SoulKnifeModEnchantments.SOUL_SHARPNESS.get())) {
						_enchantments.remove(SoulKnifeModEnchantments.SOUL_SHARPNESS.get());
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				itemstack.enchant(SoulKnifeModEnchantments.SOUL_SHARPNESS.get(), (int) (previousSoulSharpnessLevel + 1));
				if (itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.SOUL_SHARPNESS.get()) >= 10) {
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
						if (_enchantments.containsKey(SoulKnifeModEnchantments.SOUL_SHARPNESS.get())) {
							_enchantments.remove(SoulKnifeModEnchantments.SOUL_SHARPNESS.get());
							EnchantmentHelper.setEnchantments(_enchantments, itemstack);
						}
					}
					previousSSSL = itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get());
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
						if (_enchantments.containsKey(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get())) {
							_enchantments.remove(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get());
							EnchantmentHelper.setEnchantments(_enchantments, itemstack);
						}
					}
					itemstack.enchant(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get(), (int) (previousSSSL + 1));
				}
				if (itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get()) >= 10) {
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
						if (_enchantments.containsKey(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get())) {
							_enchantments.remove(SoulKnifeModEnchantments.SUPER_SOUL_SHARPNESS.get());
							EnchantmentHelper.setEnchantments(_enchantments, itemstack);
						}
					}
					previousUSSL = itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get());
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
						if (_enchantments.containsKey(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get())) {
							_enchantments.remove(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get());
							EnchantmentHelper.setEnchantments(_enchantments, itemstack);
						}
					}
					itemstack.enchant(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get(), (int) (previousUSSL + 1));
				}
				if (itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get()) >= 10) {
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
						if (_enchantments.containsKey(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get())) {
							_enchantments.remove(SoulKnifeModEnchantments.ULTRA_SOUL_SHARPNESS.get());
							EnchantmentHelper.setEnchantments(_enchantments, itemstack);
						}
					}
					previousISSL = itemstack.getEnchantmentLevel(SoulKnifeModEnchantments.INFINITE_SOUL_SHARPNESS.get());
					{
						Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
						if (_enchantments.containsKey(SoulKnifeModEnchantments.INFINITE_SOUL_SHARPNESS.get())) {
							_enchantments.remove(SoulKnifeModEnchantments.INFINITE_SOUL_SHARPNESS.get());
							EnchantmentHelper.setEnchantments(_enchantments, itemstack);
						}
					}
					itemstack.enchant(SoulKnifeModEnchantments.INFINITE_SOUL_SHARPNESS.get(), (int) (previousISSL + 1));
				}
			}
		}
	}
}
