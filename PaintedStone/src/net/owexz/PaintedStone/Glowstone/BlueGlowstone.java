package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public BlueGlowstone(Plugin plugin)
    {
        super(plugin, "Blue Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlueGlowstone"), 16));
    }
}