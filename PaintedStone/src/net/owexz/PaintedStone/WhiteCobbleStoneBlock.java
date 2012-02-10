package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public WhiteCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "WhiteCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/8102036.png", 16));
    }
}