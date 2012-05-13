package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public RedGlowstone(Plugin plugin)
    {
        super(plugin, "Red Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("RedGlowstone"), 16));
    }
}