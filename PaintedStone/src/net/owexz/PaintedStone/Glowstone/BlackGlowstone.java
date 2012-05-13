package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public BlackGlowstone(Plugin plugin)
    {
        super(plugin, "Black Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlackGlowstone"), 16));
    }
}