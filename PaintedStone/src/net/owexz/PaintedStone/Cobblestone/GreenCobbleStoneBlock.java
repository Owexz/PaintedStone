package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class GreenCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public GreenCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Green Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("GreenCobbleStoneBlock"), 16));
    }
}