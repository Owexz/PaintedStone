package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueStoneBlock extends GenericCubeCustomBlock
{
 
    public BlueStoneBlock(Plugin plugin)
    {
        super(plugin, "BlueStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/9924474.png", 16));
    }
}