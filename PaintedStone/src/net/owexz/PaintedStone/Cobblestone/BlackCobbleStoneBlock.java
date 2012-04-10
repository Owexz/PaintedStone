package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public BlackCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Black Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlackCobbleStoneBlock"), 16));
    }
}