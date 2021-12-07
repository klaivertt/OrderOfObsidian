package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class EpilogueTNTBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 60, Explosion.BlockInteraction.BREAK);
		if (world instanceof Level _level)
			_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
					ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.primed")), SoundSource.NEUTRAL, 1, 1);
	}
}