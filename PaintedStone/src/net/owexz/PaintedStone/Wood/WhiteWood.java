package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteWood extends GenericCubeCustomBlock
{
 
    public WhiteWood(Plugin plugin)
    {
        super(plugin, "White Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("WhiteWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}