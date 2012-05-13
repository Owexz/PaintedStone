package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkStoneBlock extends GenericCubeCustomBlock
{
 
    public PinkStoneBlock(Plugin plugin)
    {
        super(plugin, "Pink Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("PinkStoneBlock"), 16));
    }
}