package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlackGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public BlackGlass(Plugin plugin)
    {
        super(plugin, "Black Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlackGlass"), 16));
        setOpaque(false);
    }
}