package net.owexz.PaintedStone.Wood;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaWood extends GenericCubeCustomBlock
{
 
    public MagentaWood(Plugin plugin)
    {
        super(plugin, "Magenta Wood", new GenericCubeBlockDesign(plugin, CFTextures.getString("MagentaWood"), 16));
    }
    public int getBlockId() {
    	return 5;
        }
}