package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CyanStoneBlock extends GenericCubeCustomBlock
{
 
    public CyanStoneBlock(Plugin plugin)
    {
        super(plugin, "Cyan Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/4248659.png", 16));
    }
}