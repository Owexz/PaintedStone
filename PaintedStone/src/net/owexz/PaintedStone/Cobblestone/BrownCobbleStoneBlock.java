package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public BrownCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Brown Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BrownCobbleStoneBlock"), 16));
    }
}