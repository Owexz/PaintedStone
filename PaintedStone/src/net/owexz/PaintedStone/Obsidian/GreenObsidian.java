package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class GreenObsidian extends GenericCubeCustomBlock
{
 
    public GreenObsidian(Plugin plugin)
    {
        super(plugin, "Green Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("GreenObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}