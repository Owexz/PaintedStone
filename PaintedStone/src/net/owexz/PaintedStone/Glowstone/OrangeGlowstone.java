package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public OrangeGlowstone(Plugin plugin)
    {
        super(plugin, "Orange Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("OrangeGlowstone"), 16));
    }
}