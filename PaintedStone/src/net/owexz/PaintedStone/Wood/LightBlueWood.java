package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueWood extends GenericCubeCustomBlock
{
 
    public LightBlueWood(Plugin plugin)
    {
        super(plugin, "Light Blue Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("LightBlueWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}