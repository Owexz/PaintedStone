package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackStoneBlock extends GenericCubeCustomBlock
{
 
    public BlackStoneBlock(Plugin plugin)
    {
        super(plugin, "BlackStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/4483553.png", 16));
    }
}