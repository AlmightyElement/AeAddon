package almightyelement.AeAddon.init.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomLightBlock extends Block
{
	public CustomLightBlock(String name, float hardness, float resistance)
	{
		super(Material.REDSTONE_LIGHT);
		this.setLightLevel(0.2F);
		this.setTickRandomly(true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);}
		
	    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return MapColor.NETHERRACK;
	    }

	    @SideOnly(Side.CLIENT)
	    public int getPackedLightmapCoords(IBlockState state, IBlockAccess source, BlockPos pos)
	    {
	        return 15728880;
	    }

	    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        BlockPos blockpos = pos.up();
	        IBlockState iblockstate = worldIn.getBlockState(blockpos);

	        if (iblockstate.getBlock() == Blocks.WATER || iblockstate.getBlock() == Blocks.FLOWING_WATER)
	        {
	            worldIn.setBlockToAir(blockpos);
	            worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

	            if (worldIn instanceof WorldServer)
	            {
	                ((WorldServer)worldIn).spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.25D, (double)blockpos.getZ() + 0.5D, 8, 0.5D, 0.25D, 0.5D, 0.0D);
	            }
	        }
	    }

	    public boolean canEntitySpawn(IBlockState state, Entity entityIn)
	    {
	        return entityIn.isImmuneToFire();
	    }
	}
