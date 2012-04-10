package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LimeWood extends GenericCubeCustomBlock
{
 
    public LimeWood(Plugin plugin)
    {
        super(plugin, "Lime Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("LimeWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}