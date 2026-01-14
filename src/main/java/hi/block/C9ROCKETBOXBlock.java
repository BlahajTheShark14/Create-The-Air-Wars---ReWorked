
package hi.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import hi.procedures.C9ROCKETBOXRiedstounVkliuchionProcedure;
import hi.procedures.AIM9rocketPriRazrushieniiBlokaOtVzryvaProcedure;

public class C9ROCKETBOXBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public C9ROCKETBOXBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(6, 12, 14, 10, 16, 16), box(10, 8, 20, 12, 10, 22), box(10, 5, 20, 12, 7, 22), box(7, 5, 20, 9, 7, 22), box(7, 8, 20, 9, 10, 22), box(4, 8, 20, 6, 10, 22), box(4, 5, 20, 6, 7, 22), box(4, 2, 20, 6, 4, 22),
					box(7, 2, 20, 9, 4, 22), box(10, 2, 20, 12, 4, 22), box(6, 11, 1, 10, 12, 12), box(4, 10, 2.5, 5, 14, 3.5), box(4, 10, 12.5, 5, 14, 13.5), box(11, 10, 2.5, 12, 14, 3.5), box(11, 10, 12.5, 12, 14, 13.5), box(5, 12, 0, 11, 16, 14),
					box(3, 1, -2, 13, 11, 20));
			case NORTH -> Shapes.or(box(6, 12, 0, 10, 16, 2), box(4, 8, -6, 6, 10, -4), box(4, 5, -6, 6, 7, -4), box(7, 5, -6, 9, 7, -4), box(7, 8, -6, 9, 10, -4), box(10, 8, -6, 12, 10, -4), box(10, 5, -6, 12, 7, -4), box(10, 2, -6, 12, 4, -4),
					box(7, 2, -6, 9, 4, -4), box(4, 2, -6, 6, 4, -4), box(6, 11, 4, 10, 12, 15), box(11, 10, 12.5, 12, 14, 13.5), box(11, 10, 2.5, 12, 14, 3.5), box(4, 10, 12.5, 5, 14, 13.5), box(4, 10, 2.5, 5, 14, 3.5), box(5, 12, 2, 11, 16, 16),
					box(3, 1, -4, 13, 11, 18));
			case EAST -> Shapes.or(box(14, 12, 6, 16, 16, 10), box(20, 8, 4, 22, 10, 6), box(20, 5, 4, 22, 7, 6), box(20, 5, 7, 22, 7, 9), box(20, 8, 7, 22, 10, 9), box(20, 8, 10, 22, 10, 12), box(20, 5, 10, 22, 7, 12), box(20, 2, 10, 22, 4, 12),
					box(20, 2, 7, 22, 4, 9), box(20, 2, 4, 22, 4, 6), box(1, 11, 6, 12, 12, 10), box(2.5, 10, 11, 3.5, 14, 12), box(12.5, 10, 11, 13.5, 14, 12), box(2.5, 10, 4, 3.5, 14, 5), box(12.5, 10, 4, 13.5, 14, 5), box(0, 12, 5, 14, 16, 11),
					box(-2, 1, 3, 20, 11, 13));
			case WEST -> Shapes.or(box(0, 12, 6, 2, 16, 10), box(-6, 8, 10, -4, 10, 12), box(-6, 5, 10, -4, 7, 12), box(-6, 5, 7, -4, 7, 9), box(-6, 8, 7, -4, 10, 9), box(-6, 8, 4, -4, 10, 6), box(-6, 5, 4, -4, 7, 6), box(-6, 2, 4, -4, 4, 6),
					box(-6, 2, 7, -4, 4, 9), box(-6, 2, 10, -4, 4, 12), box(4, 11, 6, 15, 12, 10), box(12.5, 10, 4, 13.5, 14, 5), box(2.5, 10, 4, 3.5, 14, 5), box(12.5, 10, 11, 13.5, 14, 12), box(2.5, 10, 11, 3.5, 14, 12), box(2, 12, 5, 16, 16, 11),
					box(-4, 1, 3, 18, 11, 13));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			C9ROCKETBOXRiedstounVkliuchionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		}
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		AIM9rocketPriRazrushieniiBlokaOtVzryvaProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
