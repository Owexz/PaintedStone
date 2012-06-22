package net.owexz.PaintedStone.Glass;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class MagentaGlass extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 20;
        }
    public MagentaGlass(Plugin plugin)
    {
        super(plugin, "Magenta Glass", new GenericCubeBlockDesign(plugin, CFTextures.getString("MagentaGlass"), 16));
        setOpaque(false);
    }
}