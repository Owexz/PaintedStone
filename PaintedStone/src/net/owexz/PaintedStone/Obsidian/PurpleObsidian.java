package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleObsidian extends GenericCubeCustomBlock
{
 
    public PurpleObsidian(Plugin plugin)
    {
        super(plugin, "Purple Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("PurpleObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}