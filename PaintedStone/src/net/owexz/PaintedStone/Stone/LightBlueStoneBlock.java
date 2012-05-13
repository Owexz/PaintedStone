package net.owexz.PaintedStone.Stone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueStoneBlock extends GenericCubeCustomBlock
{
 
    public LightBlueStoneBlock(Plugin plugin)
    {
        super(plugin, "Light Blue Stone", new GenericCubeBlockDesign(plugin, CFTextures.getString("LightBlueStoneBlock"), 16));
    }
}