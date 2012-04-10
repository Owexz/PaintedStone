package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedObsidian extends GenericCubeCustomBlock
{
 
    public RedObsidian(Plugin plugin)
    {
        super(plugin, "Red Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("RedObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}