package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LimeGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public LimeGlowstone(Plugin plugin)
    {
        super(plugin, "Lime Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("LimeGlowstone"), 16));
    }
}