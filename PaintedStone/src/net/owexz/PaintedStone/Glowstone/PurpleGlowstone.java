package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public PurpleGlowstone(Plugin plugin)
    {
        super(plugin, "Purple Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("PurpleGlowstone"), 16));
    }
}