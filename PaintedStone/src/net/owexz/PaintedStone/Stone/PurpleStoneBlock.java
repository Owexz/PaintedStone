package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleStoneBlock extends GenericCubeCustomBlock
{
 
    public PurpleStoneBlock(Plugin plugin)
    {
        super(plugin, "Purple Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/9137035.png", 16));
    }
}