
package net.mcreator.orderofobsidian.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public abstract class HeavyIronItem extends ArmorItem {
	public HeavyIronItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 22;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrderofobsidianModItems.IRONPLATE));
			}

			@Override
			public String getName() {
				return "heavy_iron";
			}

			@Override
			public float getToughness() {
				return 0.3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends HeavyIronItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));
			setRegistryName("heavy_iron_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/heavy_iron__layer_1.png";
		}
	}

	public static class Chestplate extends HeavyIronItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));
			setRegistryName("heavy_iron_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/heavy_iron__layer_1.png";
		}
	}

	public static class Leggings extends HeavyIronItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));
			setRegistryName("heavy_iron_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/heavy_iron__layer_2.png";
		}
	}

	public static class Boots extends HeavyIronItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));
			setRegistryName("heavy_iron_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "orderofobsidian:textures/models/armor/heavy_iron__layer_1.png";
		}
	}
}
