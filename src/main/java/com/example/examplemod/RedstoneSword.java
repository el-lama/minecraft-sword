package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class RedstoneSword extends ItemSword {

    public RedstoneSword() {
        super(RedstoneSwordMod.toolMaterial);

        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
