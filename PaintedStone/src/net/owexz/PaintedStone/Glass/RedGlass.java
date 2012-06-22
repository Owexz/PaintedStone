package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public RedGlass(Plugin plugin)
    {
        super(plugin, "Red Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("RedGlass"), 16));
        setOpaque(false);
    }
}