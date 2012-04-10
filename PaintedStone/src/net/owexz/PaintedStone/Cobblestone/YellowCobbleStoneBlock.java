package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public YellowCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Yellow Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("YellowCobbleStoneBlock"), 16));
    }
}