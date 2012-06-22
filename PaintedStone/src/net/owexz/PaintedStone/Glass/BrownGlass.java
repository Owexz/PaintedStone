package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public BrownGlass(Plugin plugin)
    {
        super(plugin, "Brown Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("BrownGlass"), 16));
        setOpaque(false);
    }
}