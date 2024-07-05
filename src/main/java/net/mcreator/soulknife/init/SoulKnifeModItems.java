
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.soulknife.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.soulknife.procedures.SoulKnifeCheckIfHasInfiniteSoulSharpnessProcedure;
import net.mcreator.soulknife.item.SoulKnifeItem;
import net.mcreator.soulknife.SoulKnifeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SoulKnifeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SoulKnifeMod.MODID);
	public static final RegistryObject<Item> SOUL_KNIFE = REGISTRY.register("soul_knife", () -> new SoulKnifeItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(SOUL_KNIFE.get(), new ResourceLocation("soul_knife:soul_knife_has_infinite_soul_sharpness"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) SoulKnifeCheckIfHasInfiniteSoulSharpnessProcedure.execute(itemStackToRender));
		});
	}
}
