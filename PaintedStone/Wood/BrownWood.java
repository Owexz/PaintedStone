package net.owexz.PaintedStone.Wood;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownWood extends GenericCubeCustomBlock
{
 
    public BrownWood(Plugin plugin)
    {
        super(plugin, "Brown Wood", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/4175146.png", 16));
    }
    public int getBlockId() {
    	return 5;
        }
}