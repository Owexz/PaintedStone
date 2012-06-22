package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BlueGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public BlueGlass(Plugin plugin)
    {
        super(plugin, "Blue Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("BlueGlass"), 16));
        setOpaque(false);
    }
}