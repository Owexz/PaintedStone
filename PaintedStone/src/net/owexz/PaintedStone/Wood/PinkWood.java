package net.owexz.PaintedStone.Wood;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkWood extends GenericCubeCustomBlock
{
 
    public PinkWood(Plugin plugin)
    {
        super(plugin, "Pink Wood", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/3670943.png", 16));
    }
    public int getBlockId() {
    	return 5;
        }
}