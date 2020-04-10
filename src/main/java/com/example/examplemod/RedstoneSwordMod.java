package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = RedstoneSwordMod.MODID, name = RedstoneSwordMod.NAME, version = RedstoneSwordMod.VERSION)
public class RedstoneSwordMod
{
    public static final String MODID = "redstone-sword";
    public static final String NAME = "Redstone Sword Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    public static Item.ToolMaterial toolMaterial;
    public static Item sword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        toolMaterial = EnumHelper.addToolMaterial("Material Name", 4, 10000, 20.0f, 100.0f, 30);
        sword = new RedstoneSword();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
