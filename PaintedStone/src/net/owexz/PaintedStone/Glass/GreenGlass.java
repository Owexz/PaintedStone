package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class GreenGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public GreenGlass(Plugin plugin)
    {
        super(plugin, "Green Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("GreenGlass"), 16));
        setOpaque(false);
    }
}