package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class GreenWood extends GenericCubeCustomBlock
{
 
    public GreenWood(Plugin plugin)
    {
        super(plugin, "Green Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("GreenWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}