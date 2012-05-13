package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeWood extends GenericCubeCustomBlock
{
 
    public OrangeWood(Plugin plugin)
    {
        super(plugin, "Orange Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("OrangeWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}