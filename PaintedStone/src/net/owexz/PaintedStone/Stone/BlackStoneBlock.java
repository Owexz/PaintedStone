package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackStoneBlock extends GenericCubeCustomBlock
{
 
    public BlackStoneBlock(Plugin plugin)
    {
        super(plugin, "Black Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlackStoneBlock"), 16));
    }
}