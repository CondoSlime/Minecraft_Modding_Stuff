package com.CondoSlime.FirstMod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.NOT_SO_STONE_BLOCK, new ItemStack(ModItems.RUBY, 1), 1.5F);
		GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(Items.DIAMOND), 1.5F);
	}
}
