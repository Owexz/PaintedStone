package net.owexz.PaintedStone.Cobblestone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueCobbleStoneBlock extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public LightBlueCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "Light Blue Cobblestone", new GenericCubeBlockDesign(plugin, CFTextures.getString("LightBlueCobbleStoneBlock"), 16));
    }
}