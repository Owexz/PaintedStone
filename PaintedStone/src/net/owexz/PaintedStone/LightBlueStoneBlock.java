package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueStoneBlock extends GenericCubeCustomBlock
{
 
    public LightBlueStoneBlock(Plugin plugin)
    {
        super(plugin, "LightBlueStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6757814.png", 16));
    }
}