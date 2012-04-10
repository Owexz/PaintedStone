package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public PurpleCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Purple Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("PurpleCobbleStoneBlock"), 16));
    }
}