package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public RedCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Red Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("RedCobbleStoneBlock"), 16));
    }
}