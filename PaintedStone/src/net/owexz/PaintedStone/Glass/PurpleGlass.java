package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class PurpleGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public PurpleGlass(Plugin plugin)
    {
        super(plugin, "Purple Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("PurpleGlass"), 16));
        setOpaque(false);
    }
}