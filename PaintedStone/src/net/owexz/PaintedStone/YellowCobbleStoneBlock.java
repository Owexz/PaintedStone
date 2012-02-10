package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public YellowCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "YellowCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7461858.png", 16));
    }
}