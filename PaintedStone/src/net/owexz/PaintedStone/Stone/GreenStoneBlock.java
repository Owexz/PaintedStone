package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class GreenStoneBlock extends GenericCubeCustomBlock
{
 
    public GreenStoneBlock(Plugin plugin)
    {
        super(plugin, "Green Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("GreenStoneBlock"), 16));
    }
}