package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LimeStoneBlock extends GenericCubeCustomBlock
{
 
    public LimeStoneBlock(Plugin plugin)
    {
        super(plugin, "LimeStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7239441.png", 16));
    }
}