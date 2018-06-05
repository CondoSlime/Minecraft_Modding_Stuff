package com.CondoSlime.FirstMod.init;

import java.util.ArrayList;
import java.util.List;

import com.CondoSlime.FirstMod.blocks.BlockBase;
import com.CondoSlime.FirstMod.blocks.NotSoStone;
import com.CondoSlime.FirstMod.items.ItemBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block NOT_SO_STONE_BLOCK = new NotSoStone("not_so_stone_block", Material.ROCK);
}
