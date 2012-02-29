package net.owexz.PaintedStone.Obsidian;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LimeObsidian extends GenericCubeCustomBlock
{
 
    public LimeObsidian(Plugin plugin)
    {
        super(plugin, "Lime Obsidian", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/260873.png", 16));
    }
    public int getBlockId() {
    	return 49;
        }
}