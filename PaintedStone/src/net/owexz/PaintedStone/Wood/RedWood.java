package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedWood extends GenericCubeCustomBlock
{
 
    public RedWood(Plugin plugin)
    {
        super(plugin, "Red Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("RedWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}