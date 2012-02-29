package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedStoneBlock extends GenericCubeCustomBlock
{
 
    public RedStoneBlock(Plugin plugin)
    {
        super(plugin, "Red Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6750918.png", 16));
    }
}