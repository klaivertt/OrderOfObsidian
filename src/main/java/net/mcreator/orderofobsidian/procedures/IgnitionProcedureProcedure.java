package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.orderofobsidian.init.OrderofobsidianModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IgnitionProcedureProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack ItemInHand = ItemStack.EMPTY;
		ItemInHand = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if ((ItemInHand).getItem() == Blocks.TNT.asItem()
				&& EnchantmentHelper.getItemEnchantmentLevel(OrderofobsidianModEnchantments.IGNITION, (ItemInHand)) > 0) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			((ItemInHand)).shrink(1);
		}
	}
}
