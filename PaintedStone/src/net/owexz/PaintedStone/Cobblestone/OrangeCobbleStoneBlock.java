package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public OrangeCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Orange Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("OrangeCobbleStoneBlock"), 16));
    }
}