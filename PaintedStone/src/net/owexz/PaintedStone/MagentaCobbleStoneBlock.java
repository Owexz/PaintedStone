package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public MagentaCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "MagentaCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1755093.png", 16));
    }
}