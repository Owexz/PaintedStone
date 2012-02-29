package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowStoneBlock extends GenericCubeCustomBlock
{
 
    public YellowStoneBlock(Plugin plugin)
    {
        super(plugin, "Yellow Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/3983204.png", 16));
    }
}