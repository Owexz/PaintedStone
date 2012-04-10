package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueObsidian extends GenericCubeCustomBlock
{
 
    public BlueObsidian(Plugin plugin)
    {
        super(plugin, "Blue Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlueObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}