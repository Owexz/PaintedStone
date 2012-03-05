package net.owexz.PaintedStone.Obsidian;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaObsidian extends GenericCubeCustomBlock
{
 
    public MagentaObsidian(Plugin plugin)
    {
        super(plugin, "Magenta Obsidian", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/8983751.png", 16));
    }
    public int getBlockId() {
    	return 49;
        }
}