package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownStoneBlock extends GenericCubeCustomBlock
{
 
    public BrownStoneBlock(Plugin plugin)
    {
        super(plugin, "Brown Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BrownStoneBlock"), 16));
    }
}