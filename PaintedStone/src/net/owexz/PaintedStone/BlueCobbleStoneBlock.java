package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public BlueCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "BlueCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/9661142.png", 16));
    }
}