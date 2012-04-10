package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownObsidian extends GenericCubeCustomBlock
{
 
    public BrownObsidian(Plugin plugin)
    {
        super(plugin, "Brown Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("BrownObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}