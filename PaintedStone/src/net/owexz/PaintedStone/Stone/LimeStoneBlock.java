package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LimeStoneBlock extends GenericCubeCustomBlock
{
 
    public LimeStoneBlock(Plugin plugin)
    {
        super(plugin, "Lime Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("LimeStoneBlock"), 16));
    }
}