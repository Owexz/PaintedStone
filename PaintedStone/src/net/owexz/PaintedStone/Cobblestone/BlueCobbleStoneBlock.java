package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public BlueCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Blue Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlueCobbleStoneBlock"), 16));
    }
}