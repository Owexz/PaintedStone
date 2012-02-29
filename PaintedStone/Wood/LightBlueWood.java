package net.owexz.PaintedStone.Wood;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueWood extends GenericCubeCustomBlock
{
 
    public LightBlueWood(Plugin plugin)
    {
        super(plugin, "Light Blue Wood", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6712322.png", 16));
    }
    public int getBlockId() {
    	return 5;
        }
}