package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleStoneBlock extends GenericCubeCustomBlock
{
 
    public PurpleStoneBlock(Plugin plugin)
    {
        super(plugin, "Purple Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("PurpleStoneBlock"), 16));
    }
}