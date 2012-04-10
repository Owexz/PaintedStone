package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeStoneBlock extends GenericCubeCustomBlock
{
 
    public OrangeStoneBlock(Plugin plugin)
    {
        super(plugin, "Orange Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("OrangeStoneBlock"), 16));
    }
}