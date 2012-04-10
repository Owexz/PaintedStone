package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public MagentaCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Magenta Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("MagentaCobbleStoneBlock"), 16));
    }
}