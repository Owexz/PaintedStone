package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackWood extends GenericCubeCustomBlock
{

    public BlackWood(Plugin plugin)
    {
        super(plugin, "Black Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlackWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}