package net.owexz.PaintedStone.Stone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaStoneBlock extends GenericCubeCustomBlock
{
 
    public MagentaStoneBlock(Plugin plugin)
    {
        super(plugin, "Magenta Stone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7694621.png", 16));
    }
}