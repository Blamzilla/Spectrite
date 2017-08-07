package com.samuel.spectrite.init;

import com.samuel.spectrite.Spectrite;
import com.samuel.spectrite.items.ItemDiamondRod;
import com.samuel.spectrite.items.ItemMoltenSpectriteBucket;
import com.samuel.spectrite.items.ItemSpectriteArmor;
import com.samuel.spectrite.items.ItemSpectriteArrow;
import com.samuel.spectrite.items.ItemSpectriteAxe;
import com.samuel.spectrite.items.ItemSpectriteAxeSpecial;
import com.samuel.spectrite.items.ItemSpectriteBow;
import com.samuel.spectrite.items.ItemSpectriteBowSpecial;
import com.samuel.spectrite.items.ItemSpectriteBrick;
import com.samuel.spectrite.items.ItemSpectriteCompass;
import com.samuel.spectrite.items.ItemSpectriteGem;
import com.samuel.spectrite.items.ItemSpectriteLegendBlade;
import com.samuel.spectrite.items.ItemSpectriteOrb;
import com.samuel.spectrite.items.ItemSpectritePickaxe;
import com.samuel.spectrite.items.ItemSpectritePickaxeSpecial;
import com.samuel.spectrite.items.ItemSpectriteRod;
import com.samuel.spectrite.items.ItemSpectriteShield;
import com.samuel.spectrite.items.ItemSpectriteShieldSpecial;
import com.samuel.spectrite.items.ItemSpectriteShovel;
import com.samuel.spectrite.items.ItemSpectriteShovelSpecial;
import com.samuel.spectrite.items.ItemSpectriteSword;
import com.samuel.spectrite.items.ItemSpectriteSwordSpecial;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemDiamondRod diamond_rod;
	public static ItemSpectriteRod spectrite_rod;
	public static ItemSpectriteBrick spectrite_brick;
	public static ItemSpectriteGem spectrite_gem;
	public static ItemSpectriteOrb spectrite_orb;
	public static ItemSpectriteShovel spectrite_shovel;
	public static ItemSpectriteShovelSpecial spectrite_shovel_special;
	public static ItemSpectritePickaxe spectrite_pickaxe;
	public static ItemSpectritePickaxeSpecial spectrite_pickaxe_special;
	public static ItemSpectriteAxe spectrite_axe;
	public static ItemSpectriteAxeSpecial spectrite_axe_special;
	public static ItemSpectriteSword spectrite_sword;
	public static ItemSpectriteSwordSpecial spectrite_sword_special;
	public static ItemSpectriteLegendBlade spectrite_sword_2;
	public static ItemSpectriteArrow spectrite_arrow;
	public static ItemSpectriteBow spectrite_bow;
	public static ItemSpectriteBowSpecial spectrite_bow_special;
	public static ItemSpectriteShield spectrite_shield;
	public static ItemSpectriteShieldSpecial spectrite_shield_special;
	public static ItemSpectriteArmor spectrite_helmet;
	public static ItemSpectriteArmor spectrite_chestplate;
	public static ItemSpectriteArmor spectrite_leggings;
	public static ItemSpectriteArmor spectrite_boots;
	public static ItemMoltenSpectriteBucket molten_spectrite_bucket;
	public static ItemSpectriteCompass spectrite_compass;

	public static void createItems() {
		(diamond_rod = new ItemDiamondRod()).setCreativeTab(CreativeTabs.MATERIALS);
		(spectrite_rod = new ItemSpectriteRod()).setCreativeTab(CreativeTabs.MATERIALS);
		(spectrite_brick = new ItemSpectriteBrick()).setCreativeTab(CreativeTabs.MATERIALS);
		(spectrite_gem = new ItemSpectriteGem()).setCreativeTab(CreativeTabs.MATERIALS);
		Spectrite.SPECTRITE_TOOL.setRepairItem(new ItemStack(spectrite_gem));
		Spectrite.PERFECT_SPECTRITE_TOOL.setRepairItem(new ItemStack(spectrite_gem));
		(spectrite_orb = new ItemSpectriteOrb()).setCreativeTab(CreativeTabs.MISC);
		spectrite_shovel = new ItemSpectriteShovel();
		spectrite_shovel_special = new ItemSpectriteShovelSpecial();
		spectrite_pickaxe = new ItemSpectritePickaxe();
		spectrite_pickaxe_special = new ItemSpectritePickaxeSpecial();
		spectrite_axe = new ItemSpectriteAxe();
		spectrite_axe_special = new ItemSpectriteAxeSpecial();
		spectrite_sword = new ItemSpectriteSword(Spectrite.SPECTRITE_TOOL);
		spectrite_sword_special = new ItemSpectriteSwordSpecial(Spectrite.PERFECT_SPECTRITE_TOOL);
		spectrite_sword_2 = new ItemSpectriteLegendBlade(Spectrite.PERFECT_SPECTRITE_2_TOOL);
		spectrite_arrow = new ItemSpectriteArrow();
		spectrite_bow = new ItemSpectriteBow();
		spectrite_bow_special = new ItemSpectriteBowSpecial();
		spectrite_shield = new ItemSpectriteShield();
		spectrite_shield_special = new ItemSpectriteShieldSpecial();
		Spectrite.SPECTRITE.setRepairItem(new ItemStack(spectrite_gem));
		spectrite_helmet = new ItemSpectriteArmor(EntityEquipmentSlot.HEAD);
		spectrite_chestplate = new ItemSpectriteArmor(EntityEquipmentSlot.CHEST);
		spectrite_leggings = new ItemSpectriteArmor(EntityEquipmentSlot.LEGS);
		spectrite_boots = new ItemSpectriteArmor(EntityEquipmentSlot.FEET);
		molten_spectrite_bucket = new ItemMoltenSpectriteBucket();
		(spectrite_compass = new ItemSpectriteCompass()).setCreativeTab(CreativeTabs.TOOLS);
	}
	
	@SubscribeEvent
	public void onRegisterItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry itemRegistry = event.getRegistry();
		registerItem(itemRegistry, diamond_rod, "diamond_rod");
		registerItem(itemRegistry, spectrite_rod, "spectrite_rod");
		registerItem(itemRegistry, spectrite_brick, "spectrite_brick");
		registerItem(itemRegistry, spectrite_gem,
			"spectrite_gem");
		registerItem(itemRegistry, spectrite_orb,
			"spectrite_orb");
		registerItem(itemRegistry, spectrite_shovel,
			"spectrite_shovel");
		registerItem(itemRegistry, spectrite_shovel_special,
			"spectrite_shovel_special");
		registerItem(itemRegistry, spectrite_pickaxe,
			"spectrite_pickaxe");
		registerItem(itemRegistry, spectrite_pickaxe_special,
			"spectrite_pickaxe_special");
		registerItem(itemRegistry, spectrite_axe,
			"spectrite_axe");
		registerItem(itemRegistry, spectrite_axe_special,
			"spectrite_axe_special");
		registerItem(itemRegistry, spectrite_sword,
			"spectrite_sword");
		registerItem(itemRegistry, spectrite_sword_special,
			"spectrite_sword_special");
		registerItem(itemRegistry, spectrite_sword_2,
			"spectrite_sword_2");
		registerItem(itemRegistry, spectrite_arrow,
			"spectrite_arrow");
		registerItem(itemRegistry, spectrite_bow,
			"spectrite_bow");
		registerItem(itemRegistry, spectrite_bow_special,
			"spectrite_bow_special");
		registerItem(itemRegistry, spectrite_shield,
			"spectrite_shield");
		registerItem(itemRegistry, spectrite_shield_special,
			"spectrite_shield_special");
		registerItem(itemRegistry, spectrite_helmet,
			"spectrite_helmet");
		registerItem(itemRegistry, spectrite_chestplate,
			"spectrite_chestplate");
		registerItem(itemRegistry, spectrite_leggings,
			"spectrite_leggings");
		registerItem(itemRegistry, spectrite_boots,
			"spectrite_boots");
		registerItem(itemRegistry, spectrite_compass,
			"spectrite_compass");
	}
	
	private static <T extends Item> T registerItem(IForgeRegistry<Item> registry, T item, String name)
	{
		item.setUnlocalizedName(name);
		item.setRegistryName(name);

		registry.register(item);

		return item;
	}

}
