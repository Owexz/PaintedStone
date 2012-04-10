package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LimeCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public LimeCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Lime Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("LimeCobbleStoneBlock"), 16));
    }
}