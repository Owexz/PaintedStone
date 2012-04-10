package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkObsidian extends GenericCubeCustomBlock
{
 
    public PinkObsidian(Plugin plugin)
    {
        super(plugin, "Pink Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("PinkObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}