package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkWood extends GenericCubeCustomBlock
{
 
    public PinkWood(Plugin plugin)
    {
        super(plugin, "Pink Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("PinkWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}