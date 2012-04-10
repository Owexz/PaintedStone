package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueStoneBlock extends GenericCubeCustomBlock
{
 
    public BlueStoneBlock(Plugin plugin)
    {
        super(plugin, "Blue Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlueStoneBlock"), 16));
    }
}