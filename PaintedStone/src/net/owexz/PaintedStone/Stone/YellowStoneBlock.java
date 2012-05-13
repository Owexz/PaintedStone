package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowStoneBlock extends GenericCubeCustomBlock
{
 
    public YellowStoneBlock(Plugin plugin)
    {
        super(plugin, "Yellow Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("YellowStoneBlock"), 16));
    }
}