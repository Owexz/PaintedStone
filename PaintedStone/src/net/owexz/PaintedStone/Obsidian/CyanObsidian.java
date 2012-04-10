package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanObsidian extends GenericCubeCustomBlock
{
 
    public CyanObsidian(Plugin plugin)
    {
        super(plugin, "Cyan Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("CyanObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}