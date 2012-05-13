package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public WhiteCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "White Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("WhiteCobbleStoneBlock"), 16));
    }
}