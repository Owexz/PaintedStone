package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public LightBlueGlowstone(Plugin plugin)
    {
        super(plugin, "Light-Blue Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("LightBlueGlowstone"), 16));
    }
}