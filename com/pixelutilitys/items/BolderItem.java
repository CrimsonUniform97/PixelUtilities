package com.pixelutilitys.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.pixelutilitys.config.PixelUtilitysBlocks;
public class BolderItem extends Item {

	public BolderItem() {
		super();

		// Constructor Configuration
		maxStackSize = 64;
		setUnlocalizedName("Bolder");
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10){
		if(par7 != 1){
			return false;
		}
		else{
			if(player.canPlayerEdit(x, y + 1, z, par7, stack) && player.canPlayerEdit(x, y + 2, z, par7, stack)){
				world.setBlock(x, y + 1, z, PixelUtilitysBlocks.BolderBlock);

				world.notifyBlockOfNeighborChange(x, y + 1, z, PixelUtilitysBlocks.BolderBlock);

				--stack.stackSize;
				return true;
			}else{
				return false;
			}
		}
	}
}