package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueObsidian extends GenericCubeCustomBlock
{
 
    public LightBlueObsidian(Plugin plugin)
    {
        super(plugin, "Light Blue Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("LightBlueObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}