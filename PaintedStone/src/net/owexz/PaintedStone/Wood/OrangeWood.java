package net.owexz.PaintedStone.Wood;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeWood extends GenericCubeCustomBlock
{
 
    public OrangeWood(Plugin plugin)
    {
        super(plugin, "Orange Wood", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/591872.png", 16));
    }
    public int getBlockId() {
    	return 5;
        }
}