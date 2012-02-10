package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public PinkCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "PinkCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/3134081.png", 16));
    }
}