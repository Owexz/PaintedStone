package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaObsidian extends GenericCubeCustomBlock
{
 
    public MagentaObsidian(Plugin plugin)
    {
        super(plugin, "Magenta Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("MagentaObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}