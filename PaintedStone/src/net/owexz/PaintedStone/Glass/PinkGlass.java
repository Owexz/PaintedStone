package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PinkGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public PinkGlass(Plugin plugin)
    {
        super(plugin, "Pink Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("PinkGlass"), 16));
        setOpaque(false);
    }
}