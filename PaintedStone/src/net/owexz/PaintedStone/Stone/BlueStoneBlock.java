package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueStoneBlock extends GenericCubeCustomBlock
{
 
    public BlueStoneBlock(Plugin plugin)
    {
        super(plugin, "Blue Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1864681.png", 16));
    }
}