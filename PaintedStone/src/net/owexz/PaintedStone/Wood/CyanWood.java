package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanWood extends GenericCubeCustomBlock
{
 
    public CyanWood(Plugin plugin)
    {
        super(plugin, "Cyan Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("CyanWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}