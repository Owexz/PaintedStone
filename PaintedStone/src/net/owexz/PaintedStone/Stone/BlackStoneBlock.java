package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackStoneBlock extends GenericCubeCustomBlock
{
 
    public BlackStoneBlock(Plugin plugin)
    {
        super(plugin, "Black Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/5578079.png", 16));
    }
}