
package net.mcreator.orderofobsidian.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.orderofobsidian.procedures.XpBush1UpdateTickProcedure;
import net.mcreator.orderofobsidian.procedures.XPberryStage0NeighbourBlockChangesProcedure;
import net.mcreator.orderofobsidian.procedures.XPberryStage0EntityCollidesInTheBlockProcedure;
import net.mcreator.orderofobsidian.init.OrderofobsidianModBlocks;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Xpbush1Block extends Block {
	public Xpbush1Block() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GRASS).strength(1f, 10f).noOcclusion().randomTicks()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("xpbush_1");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public ItemStack getPickBlock(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(OrderofobsidianModBlocks.X_PBUSH_ORE);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(OrderofobsidianModBlocks.X_PBUSH_ORE));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		XPberryStage0NeighbourBlockChangesProcedure.execute(

		);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		XpBush1UpdateTickProcedure.execute(world, x, y, z);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		XPberryStage0EntityCollidesInTheBlockProcedure.execute(entity);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(OrderofobsidianModBlocks.XPBUSH_1, renderType -> renderType == RenderType.cutout());
	}
}
