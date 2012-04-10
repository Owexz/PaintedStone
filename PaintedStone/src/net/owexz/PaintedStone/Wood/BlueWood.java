package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueWood extends GenericCubeCustomBlock
{
 
    public BlueWood(Plugin plugin)
    {
        super(plugin, "Blue Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlueWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}