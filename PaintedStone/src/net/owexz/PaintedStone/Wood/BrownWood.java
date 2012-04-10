package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownWood extends GenericCubeCustomBlock
{
 
    public BrownWood(Plugin plugin)
    {
        super(plugin, "Brown Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("BrownWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}