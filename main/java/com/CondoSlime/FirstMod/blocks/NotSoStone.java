package com.CondoSlime.FirstMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NotSoStone extends BlockBase{
	public NotSoStone(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.ANVIL);
		setHardness(15.0F);
		setResistance(600.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(5.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
