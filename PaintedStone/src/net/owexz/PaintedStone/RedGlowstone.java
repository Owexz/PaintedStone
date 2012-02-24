package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public RedGlowstone(Plugin plugin)
    {
        super(plugin, "Red Glowstone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/5395357.png", 16));
    }
}