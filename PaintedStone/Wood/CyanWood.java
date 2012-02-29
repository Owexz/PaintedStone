package net.owexz.PaintedStone.Wood;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanWood extends GenericCubeCustomBlock
{
 
    public CyanWood(Plugin plugin)
    {
        super(plugin, "Cyan Wood", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7882469.png", 16));
    }
    public int getBlockId() {
    	return 5;
        }
}