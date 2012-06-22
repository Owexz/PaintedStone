package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class YellowGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public YellowGlass(Plugin plugin)
    {
        super(plugin, "Yellow Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("YellowGlass"), 16));
        setOpaque(false);
    }
}