
package net.mcreator.orderofobsidian.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;

public class XpBush1Block extends Block {

	public XpBush1Block() {
		super(Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).strength(0.5f, 1f).lightLevel(s -> 0).noOcclusion().randomTicks()
				.isRedstoneConductor((bs, br, bp) -> false));

		setRegistryName("xp_bush_1");
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
		return box(0, 0, 0, 12, 12, 12)

				.move(offset.x, offset.y, offset.z);
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(OrderofobsidianModBlocks.XPBUSH_STAGE_0));
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
		ItemBlockRenderTypes.setRenderLayer(OrderofobsidianModBlocks.XP_BUSH_1, renderType -> renderType == RenderType.cutoutMipped());
	}

}
