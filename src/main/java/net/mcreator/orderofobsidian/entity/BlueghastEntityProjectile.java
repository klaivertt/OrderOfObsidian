
package net.mcreator.orderofobsidian.entity;

import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.orderofobsidian.init.OrderofobsidianModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BlueghastEntityProjectile extends AbstractArrow implements ItemSupplier {
	public BlueghastEntityProjectile(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(OrderofobsidianModEntities.BLUEGHAST_PROJECTILE, world);
	}

	public BlueghastEntityProjectile(EntityType<? extends BlueghastEntityProjectile> type, Level world) {
		super(type, world);
	}

	public BlueghastEntityProjectile(EntityType<? extends BlueghastEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BlueghastEntityProjectile(EntityType<? extends BlueghastEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.FIRE_CHARGE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.FIRE_CHARGE);
	}
}
