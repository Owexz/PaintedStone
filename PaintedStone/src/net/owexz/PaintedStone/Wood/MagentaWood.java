package net.owexz.PaintedStone.Wood;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaWood extends GenericCubeCustomBlock
{
 
    public MagentaWood(Plugin plugin)
    {
        super(plugin, "Magenta Wood", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/2418595.png", 16));
    }
    public int getBlockId() {
    	return 5;
        }
}