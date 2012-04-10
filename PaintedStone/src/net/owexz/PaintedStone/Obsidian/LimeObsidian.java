package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LimeObsidian extends GenericCubeCustomBlock
{
 
    public LimeObsidian(Plugin plugin)
    {
        super(plugin, "Lime Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("LimeObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}