package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public OrangeGlass(Plugin plugin)
    {
        super(plugin, "Orange Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("OrangeGlass"), 16));
        setOpaque(false);
    }
}