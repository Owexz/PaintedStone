package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeObsidian extends GenericCubeCustomBlock
{
 
    public OrangeObsidian(Plugin plugin)
    {
        super(plugin, "Orange Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("OrangeObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}