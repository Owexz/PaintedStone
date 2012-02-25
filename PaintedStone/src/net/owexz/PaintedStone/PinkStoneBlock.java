package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkStoneBlock extends GenericCubeCustomBlock
{
 
    public PinkStoneBlock(Plugin plugin)
    {
        super(plugin, "PinkStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/8835567.png", 16));
    }
}