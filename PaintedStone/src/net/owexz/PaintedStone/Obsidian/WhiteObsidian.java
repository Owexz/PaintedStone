package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteObsidian extends GenericCubeCustomBlock
{
 
    public WhiteObsidian(Plugin plugin)
    {
        super(plugin, "White Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("WhiteObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}