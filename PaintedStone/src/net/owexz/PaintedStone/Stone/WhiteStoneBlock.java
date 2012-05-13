package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteStoneBlock extends GenericCubeCustomBlock
{
 
    public WhiteStoneBlock(Plugin plugin)
    {
        super(plugin, "White Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("WhiteStoneBlock"), 16));
    }
}