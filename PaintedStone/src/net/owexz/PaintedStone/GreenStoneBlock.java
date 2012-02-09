package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class GreenStoneBlock extends GenericCubeCustomBlock
{
 
    public GreenStoneBlock(Plugin plugin)
    {
        super(plugin, "GreenStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/3464522.png", 16));
    }
}