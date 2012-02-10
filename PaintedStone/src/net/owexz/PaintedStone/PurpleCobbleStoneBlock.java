package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public PurpleCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "PurpleCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7871224.png", 16));
    }
}