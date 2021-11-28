
package net.mcreator.orderofobsidian.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.orderofobsidian.procedures.XPberryStage0UpdateTickProcedure;
import net.mcreator.orderofobsidian.procedures.XPberryStage0NeighbourBlockChangesProcedure;
import net.mcreator.orderofobsidian.init.OrderofobsidianModBlocks;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class XPberryStage0Block extends Block {
	public XPberryStage0Block() {
		super(Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.5f, 1f).lightLevel(s -> 0).noOcclusion().randomTicks()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("xpbush_stage_0");
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
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(0, 0, 0, 12, 12, 12).move(offset.x, offset.y, offset.z);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
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

		XPberryStage0UpdateTickProcedure.execute(world, x, y, z);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(OrderofobsidianModBlocks.XPBUSH_STAGE_0, renderType -> renderType == RenderType.cutoutMipped());
	}

}
