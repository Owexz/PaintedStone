package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowWood extends GenericCubeCustomBlock
{
 
    public YellowWood(Plugin plugin)
    {
        super(plugin, "Yellow Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("YellowWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}