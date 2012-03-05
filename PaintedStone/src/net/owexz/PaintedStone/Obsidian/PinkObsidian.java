package net.owexz.PaintedStone.Obsidian;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkObsidian extends GenericCubeCustomBlock
{
 
    public PinkObsidian(Plugin plugin)
    {
        super(plugin, "Pink Obsidian", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7408907.png", 16));
    }
    public int getBlockId() {
    	return 49;
        }
}