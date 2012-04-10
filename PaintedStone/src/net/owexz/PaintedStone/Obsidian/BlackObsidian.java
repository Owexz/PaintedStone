package net.owexz.PaintedStone.Obsidian;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackObsidian extends GenericCubeCustomBlock
{

    public BlackObsidian(Plugin plugin)
    {
        super(plugin, "Black Obsidian", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlackObsidian"), 16));
    }
    public int getBlockId() {
    	return 49;
        }
}