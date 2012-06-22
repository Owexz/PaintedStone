package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class WhiteGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public WhiteGlass(Plugin plugin)
    {
        super(plugin, "White Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("WhiteGlass"), 16));
        setOpaque(false);
    }
}