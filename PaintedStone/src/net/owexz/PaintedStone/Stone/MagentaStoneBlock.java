package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaStoneBlock extends GenericCubeCustomBlock
{
 
    public MagentaStoneBlock(Plugin plugin)
    {
        super(plugin, "Magenta Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("MagentaStoneBlock"), 16));
    }
}