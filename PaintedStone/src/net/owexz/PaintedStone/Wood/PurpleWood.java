package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleWood extends GenericCubeCustomBlock
{
 
    public PurpleWood(Plugin plugin)
    {
        super(plugin, "Purple Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("PurpleWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}