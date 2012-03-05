package net.owexz.PaintedStone.Obsidian;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownObsidian extends GenericCubeCustomBlock
{
 
    public BrownObsidian(Plugin plugin)
    {
        super(plugin, "Brown Obsidian", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/277079.png", 16));
    }
    public int getBlockId() {
    	return 49;
        }
}