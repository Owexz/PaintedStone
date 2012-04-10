package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public PinkGlowstone(Plugin plugin)
    {
        super(plugin, "Pink Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("PinkGlowstone"), 16));
    }
}