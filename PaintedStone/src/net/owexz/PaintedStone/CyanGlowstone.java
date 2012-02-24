package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public CyanGlowstone(Plugin plugin)
    {
        super(plugin, "Cyan Glowstone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/433511.png", 16));
    }
}