package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public PinkCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Pink Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("PinkCobbleStoneBlock"), 16));
    }
}