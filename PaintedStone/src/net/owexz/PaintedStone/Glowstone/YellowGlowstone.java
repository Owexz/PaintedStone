package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public YellowGlowstone(Plugin plugin)
    {
        super(plugin, "Yellow Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("YellowGlowstone"), 16));
    }
}