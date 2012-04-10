package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanStoneBlock extends GenericCubeCustomBlock
{
 
    public CyanStoneBlock(Plugin plugin)
    {
        super(plugin, "Cyan Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("CyanStoneBlock"), 16));
    }
}