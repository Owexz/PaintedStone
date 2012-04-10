package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public WhiteGlowstone(Plugin plugin)
    {
        super(plugin, "White Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("WhiteGlowstone"), 16));
    }
}