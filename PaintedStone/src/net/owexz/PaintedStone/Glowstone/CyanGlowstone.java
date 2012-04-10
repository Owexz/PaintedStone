package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public CyanGlowstone(Plugin plugin)
    {
        super(plugin, "Cyan Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("CyanGlowstone"), 16));
    }
}