package net.owexz.PaintedStone.Obsidian;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleObsidian extends GenericCubeCustomBlock
{
 
    public PurpleObsidian(Plugin plugin)
    {
        super(plugin, "Purple Obsidian", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/8751995.png", 16));
    }
    public int getBlockId() {
    	return 49;
        }
}