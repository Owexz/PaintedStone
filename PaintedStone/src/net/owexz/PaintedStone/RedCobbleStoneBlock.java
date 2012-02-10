package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public RedCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "RedCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6802317.png", 16));
    }
}