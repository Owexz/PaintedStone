package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class GreenGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public GreenGlowstone(Plugin plugin)
    {
        super(plugin, "Green Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("GreenGlowstone"), 16));
    }
}