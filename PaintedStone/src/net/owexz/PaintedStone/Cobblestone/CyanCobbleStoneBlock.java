package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public CyanCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Cyan Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("CyanCobbleStoneBlock"), 16));
    }
}