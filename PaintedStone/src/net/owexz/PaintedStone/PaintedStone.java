package net.owexz.PaintedStone;

import java.util.logging.Logger;
import net.owexz.PaintedStone.Cobblestone.BlackCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.BlueCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.BrownCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.CyanCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.GreenCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.LightBlueCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.LimeCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.MagentaCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.OrangeCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.PinkCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.PurpleCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.RedCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.WhiteCobbleStoneBlock;
import net.owexz.PaintedStone.Cobblestone.YellowCobbleStoneBlock;
import net.owexz.PaintedStone.Glass.BlackGlass;
import net.owexz.PaintedStone.Glass.BlueGlass;
import net.owexz.PaintedStone.Glass.BrownGlass;
import net.owexz.PaintedStone.Glass.CyanGlass;
import net.owexz.PaintedStone.Glass.GreenGlass;
import net.owexz.PaintedStone.Glass.LightBlueGlass;
import net.owexz.PaintedStone.Glass.LimeGlass;
import net.owexz.PaintedStone.Glass.MagentaGlass;
import net.owexz.PaintedStone.Glass.OrangeGlass;
import net.owexz.PaintedStone.Glass.PinkGlass;
import net.owexz.PaintedStone.Glass.PurpleGlass;
import net.owexz.PaintedStone.Glass.RedGlass;
import net.owexz.PaintedStone.Glass.WhiteGlass;
import net.owexz.PaintedStone.Glass.YellowGlass;
import net.owexz.PaintedStone.Glowstone.BlackGlowstone;
import net.owexz.PaintedStone.Glowstone.BlueGlowstone;
import net.owexz.PaintedStone.Glowstone.BrownGlowstone;
import net.owexz.PaintedStone.Glowstone.CyanGlowstone;
import net.owexz.PaintedStone.Glowstone.GreenGlowstone;
import net.owexz.PaintedStone.Glowstone.LightBlueGlowstone;
import net.owexz.PaintedStone.Glowstone.LimeGlowstone;
import net.owexz.PaintedStone.Glowstone.MagentaGlowstone;
import net.owexz.PaintedStone.Glowstone.OrangeGlowstone;
import net.owexz.PaintedStone.Glowstone.PinkGlowstone;
import net.owexz.PaintedStone.Glowstone.PurpleGlowstone;
import net.owexz.PaintedStone.Glowstone.RedGlowstone;
import net.owexz.PaintedStone.Glowstone.WhiteGlowstone;
import net.owexz.PaintedStone.Glowstone.YellowGlowstone;
import net.owexz.PaintedStone.Obsidian.BlackObsidian;
import net.owexz.PaintedStone.Obsidian.BlueObsidian;
import net.owexz.PaintedStone.Obsidian.BrownObsidian;
import net.owexz.PaintedStone.Obsidian.CyanObsidian;
import net.owexz.PaintedStone.Obsidian.GreenObsidian;
import net.owexz.PaintedStone.Obsidian.LightBlueObsidian;
import net.owexz.PaintedStone.Obsidian.LimeObsidian;
import net.owexz.PaintedStone.Obsidian.MagentaObsidian;
import net.owexz.PaintedStone.Obsidian.OrangeObsidian;
import net.owexz.PaintedStone.Obsidian.PinkObsidian;
import net.owexz.PaintedStone.Obsidian.PurpleObsidian;
import net.owexz.PaintedStone.Obsidian.RedObsidian;
import net.owexz.PaintedStone.Obsidian.WhiteObsidian;
import net.owexz.PaintedStone.Obsidian.YellowObsidian;
import net.owexz.PaintedStone.Stone.BlackStoneBlock;
import net.owexz.PaintedStone.Stone.BlueStoneBlock;
import net.owexz.PaintedStone.Stone.BrownStoneBlock;
import net.owexz.PaintedStone.Stone.CyanStoneBlock;
import net.owexz.PaintedStone.Stone.GreenStoneBlock;
import net.owexz.PaintedStone.Stone.LightBlueStoneBlock;
import net.owexz.PaintedStone.Stone.LimeStoneBlock;
import net.owexz.PaintedStone.Stone.MagentaStoneBlock;
import net.owexz.PaintedStone.Stone.OrangeStoneBlock;
import net.owexz.PaintedStone.Stone.PinkStoneBlock;
import net.owexz.PaintedStone.Stone.PurpleStoneBlock;
import net.owexz.PaintedStone.Stone.RedStoneBlock;
import net.owexz.PaintedStone.Stone.WhiteStoneBlock;
import net.owexz.PaintedStone.Stone.YellowStoneBlock;
import net.owexz.PaintedStone.Wood.BlackWood;
import net.owexz.PaintedStone.Wood.BlueWood;
import net.owexz.PaintedStone.Wood.BrownWood;
import net.owexz.PaintedStone.Wood.CyanWood;
import net.owexz.PaintedStone.Wood.GreenWood;
import net.owexz.PaintedStone.Wood.LightBlueWood;
import net.owexz.PaintedStone.Wood.LimeWood;
import net.owexz.PaintedStone.Wood.MagentaWood;
import net.owexz.PaintedStone.Wood.OrangeWood;
import net.owexz.PaintedStone.Wood.PinkWood;
import net.owexz.PaintedStone.Wood.PurpleWood;
import net.owexz.PaintedStone.Wood.RedWood;
import net.owexz.PaintedStone.Wood.WhiteWood;
import net.owexz.PaintedStone.Wood.YellowWood;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.*;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;

// Referenced classes of package net.owexz.PaintedStone:
//		    CFTextures

public class PaintedStone extends JavaPlugin
{

    public PaintedStone()
    {
    }

    public void onEnable()
    {
		log = Logger.getLogger("Minecraft");
		setupTextures();
		setupBlocks();
		setupRecipes();
		log.info("PaintedStone by Owexz (Owexz.net) Enabled");
    }

    public void onDisable()
    {
		log.info("PaintedStone by Owexz (Owexz.net) disabled.");
    }

    public void setupTextures()
    {
		BlackStoneBlockTexture = new Texture(this, CFTextures.getString("BlackStoneBlock"), 64, 16, 16);
		BlueStoneBlockTexture = new Texture(this, CFTextures.getString("BlueStoneBlock"), 64, 16, 16);
		BrownStoneBlockTexture = new Texture(this, CFTextures.getString("BrownStoneBlock"), 64, 16, 16);
		CyanStoneBlockTexture = new Texture(this, CFTextures.getString("CyanStoneBlock"), 64, 16, 16);
		GreenStoneBlockTexture = new Texture(this, CFTextures.getString("GreenStoneBlock"), 64, 16, 16);
		LightBlueStoneBlockTexture = new Texture(this, CFTextures.getString("LightBlueStoneBlock"), 64, 16, 16);
		LimeStoneBlockTexture = new Texture(this, CFTextures.getString("LimeStoneBlock"), 64, 16, 16);
		MagentaStoneBlockTexture = new Texture(this, CFTextures.getString("MagentaStoneBlock"), 64, 16, 16);
		OrangeStoneBlockTexture = new Texture(this, CFTextures.getString("OrangeStoneBlock"), 64, 16, 16);
		PinkStoneBlockTexture = new Texture(this, CFTextures.getString("PinkStoneBlock"), 64, 16, 16);
		PurpleStoneBlockTexture = new Texture(this, CFTextures.getString("PurpleStoneBlock"), 64, 16, 16);
		RedStoneBlockTexture = new Texture(this, CFTextures.getString("RedStoneBlock"), 64, 16, 16);
		WhiteStoneBlockTexture = new Texture(this, CFTextures.getString("WhiteStoneBlock"), 64, 16, 16);
		YellowStoneBlockTexture = new Texture(this, CFTextures.getString("YellowStoneBlock"), 64, 16, 16);
		BlackCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("BlackCobbleStoneBlock"), 64, 16, 16);
		BlueCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("BlueCobbleStoneBlock"), 64, 16, 16);
		BrownCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("BrownCobbleStoneBlock"), 64, 16, 16);
		CyanCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("CyanCobbleStoneBlock"), 64, 16, 16);
		GreenCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("GreenCobbleStoneBlock"), 64, 16, 16);
		LightBlueCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("LightBlueCobbleStoneBlock"), 64, 16, 16);
		LimeCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("LimeCobbleStoneBlock"), 64, 16, 16);
		MagentaCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("MagentaCobbleStoneBlock"), 64, 16, 16);
		OrangeCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("OrangeCobbleStoneBlock"), 64, 16, 16);
		PinkCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("PinkCobbleStoneBlock"), 64, 16, 16);
		PurpleCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("PurpleCobbleStoneBlock"), 64, 16, 16);
		RedCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("RedCobbleStoneBlock"), 64, 16, 16);
		WhiteCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("WhiteCobbleStoneBlock"), 64, 16, 16);
		YellowCobbleStoneBlockTexture = new Texture(this, CFTextures.getString("YellowCobbleStoneBlock"), 64, 16, 16);
		BlackGlowstoneTexture = new Texture(this, CFTextures.getString("BlackGlowstone"), 64, 16, 16);
		BlueGlowstoneTexture = new Texture(this, CFTextures.getString("BlueGlowstone"), 64, 16, 16);
		BrownGlowstoneTexture = new Texture(this, CFTextures.getString("BrownGlowstone"), 64, 16, 16);
		CyanGlowstoneTexture = new Texture(this, CFTextures.getString("CyanGlowstone"), 64, 16, 16);
		GreenGlowstoneTexture = new Texture(this, CFTextures.getString("GreenGlowstone"), 64, 16, 16);
		LightBlueGlowstoneTexture = new Texture(this, CFTextures.getString("LightBlueGlowstone"), 64, 16, 16);
		LimeGlowstoneTexture = new Texture(this, CFTextures.getString("LimeGlowstone"), 64, 16, 16);
		MagentaGlowstoneTexture = new Texture(this, CFTextures.getString("MagentaGlowstone"), 64, 16, 16);
		OrangeGlowstoneTexture = new Texture(this, CFTextures.getString("OrangeGlowstone"), 64, 16, 16);
		PinkGlowstoneTexture = new Texture(this, CFTextures.getString("PinkGlowstone"), 64, 16, 16);
		PurpleGlowstoneTexture = new Texture(this, CFTextures.getString("PurpleGlowstone"), 64, 16, 16);
		RedGlowstoneTexture = new Texture(this, CFTextures.getString("RedGlowstone"), 64, 16, 16);
		WhiteGlowstoneTexture = new Texture(this, CFTextures.getString("WhiteGlowstone"), 64, 16, 16);
		YellowGlowstoneTexture = new Texture(this, CFTextures.getString("YellowGlowstone"), 64, 16, 16);
		BlackWoodTexture = new Texture(this, CFTextures.getString("BlackWood"), 64, 16, 16);
		BlueWoodTexture = new Texture(this, CFTextures.getString("BlueWood"), 64, 16, 16);
		BrownWoodTexture = new Texture(this, CFTextures.getString("BrownWood"), 64, 16, 16);
		CyanWoodTexture = new Texture(this, CFTextures.getString("CyanWood"), 64, 16, 16);
		GreenWoodTexture = new Texture(this, CFTextures.getString("GreenWood"), 64, 16, 16);
		LightBlueWoodTexture = new Texture(this, CFTextures.getString("LightBlueWood"), 64, 16, 16);
		LimeWoodTexture = new Texture(this, CFTextures.getString("LimeWood"), 64, 16, 16);
		MagentaWoodTexture = new Texture(this, CFTextures.getString("MagentaWood"), 64, 16, 16);
		OrangeWoodTexture = new Texture(this, CFTextures.getString("OrangeWood"), 64, 16, 16);
		PinkWoodTexture = new Texture(this, CFTextures.getString("PinkWood"), 64, 16, 16);
		PurpleWoodTexture = new Texture(this, CFTextures.getString("PurpleWood"), 64, 16, 16);
		RedWoodTexture = new Texture(this, CFTextures.getString("RedWood"), 64, 16, 16);
		WhiteWoodTexture = new Texture(this, CFTextures.getString("WhiteWood"), 64, 16, 16);
		YellowWoodTexture = new Texture(this, CFTextures.getString("YellowWood"), 64, 16, 16);
		BlackObsidianTexture = new Texture(this, CFTextures.getString("BlackObsidian"), 64, 16, 16);
		BlueObsidianTexture = new Texture(this, CFTextures.getString("BlueObsidian"), 64, 16, 16);
		BrownObsidianTexture = new Texture(this, CFTextures.getString("BrownObsidian"), 64, 16, 16);
		CyanObsidianTexture = new Texture(this, CFTextures.getString("CyanObsidian"), 64, 16, 16);
		GreenObsidianTexture = new Texture(this, CFTextures.getString("GreenObsidian"), 64, 16, 16);
		LightBlueObsidianTexture = new Texture(this, CFTextures.getString("LightBlue"), 64, 16, 16);
		LimeObsidianTexture = new Texture(this, CFTextures.getString("LimeObsidian"), 64, 16, 16);
		MagentaObsidianTexture = new Texture(this, CFTextures.getString("MagentaObsidian"), 64, 16, 16);
		OrangeObsidianTexture = new Texture(this, CFTextures.getString("OrangeObsidian"), 64, 16, 16);
		PinkObsidianTexture = new Texture(this, CFTextures.getString("PinkObsidian"), 64, 16, 16);
		PurpleObsidianTexture = new Texture(this, CFTextures.getString("PurpleObsidian"), 64, 16, 16);
		RedObsidianTexture = new Texture(this, CFTextures.getString("RedObsidian"), 64, 16, 16);
		WhiteObsidianTexture = new Texture(this, CFTextures.getString("WhiteObsidian"), 64, 16, 16);
		YellowObsidianTexture = new Texture(this, CFTextures.getString("YellowObsidian"), 64, 16, 16);
		BlackGlassTexture = new Texture(this, CFTextures.getString("BlackGlass"), 64, 16, 16);
		BlueGlassTexture = new Texture(this, CFTextures.getString("BlueGlass"), 64, 16, 16);
		BrownGlassTexture = new Texture(this, CFTextures.getString("BrownGlass"), 64, 16, 16);
		CyanGlassTexture = new Texture(this, CFTextures.getString("CyanGlass"), 64, 16, 16);
		GreenGlassTexture = new Texture(this, CFTextures.getString("GreenGlass"), 64, 16, 16);
		LightBlueGlassTexture = new Texture(this, CFTextures.getString("LightBlueGlass"), 64, 16, 16);
		LimeGlassTexture = new Texture(this, CFTextures.getString("LimeGlass"), 64, 16, 16);
		MagentaGlassTexture = new Texture(this, CFTextures.getString("MagentaGlass"), 64, 16, 16);
		OrangeGlassTexture = new Texture(this, CFTextures.getString("OrangeGlass"), 64, 16, 16);
		PinkGlassTexture = new Texture(this, CFTextures.getString("PinkGlass"), 64, 16, 16);
		PurpleGlassTexture = new Texture(this, CFTextures.getString("PurpleGlass"), 64, 16, 16);
		RedGlassTexture = new Texture(this, CFTextures.getString("RedGlass"), 64, 16, 16);
		WhiteGlassTexture = new Texture(this, CFTextures.getString("WhiteGlass"), 64, 16, 16);
		YellowGlassTexture = new Texture(this, CFTextures.getString("YellowGlass"), 64, 16, 16);
    }

    public void setupBlocks()
    {
		BlackStoneBlock = new BlackStoneBlock(this);
		BlueStoneBlock = new BlueStoneBlock(this);
		BrownStoneBlock = new BrownStoneBlock(this);
		CyanStoneBlock = new CyanStoneBlock(this);
		GreenStoneBlock = new GreenStoneBlock(this);
		LightBlueStoneBlock = new LightBlueStoneBlock(this);
		LimeStoneBlock = new LimeStoneBlock(this);
		MagentaStoneBlock = new MagentaStoneBlock(this);
		OrangeStoneBlock = new OrangeStoneBlock(this);
		PinkStoneBlock = new PinkStoneBlock(this);
		PurpleStoneBlock = new PurpleStoneBlock(this);
		RedStoneBlock = new RedStoneBlock(this);
		WhiteStoneBlock = new WhiteStoneBlock(this);
		YellowStoneBlock = new YellowStoneBlock(this);
		BlackCobbleStoneBlock = new BlackCobbleStoneBlock(this);
		BlueCobbleStoneBlock = new BlueCobbleStoneBlock(this);
		BrownCobbleStoneBlock = new BrownCobbleStoneBlock(this);
		CyanCobbleStoneBlock = new CyanCobbleStoneBlock(this);
		GreenCobbleStoneBlock = new GreenCobbleStoneBlock(this);
		LightBlueCobbleStoneBlock = new LightBlueCobbleStoneBlock(this);
		LimeCobbleStoneBlock = new LimeCobbleStoneBlock(this);
		MagentaCobbleStoneBlock = new MagentaCobbleStoneBlock(this);
		OrangeCobbleStoneBlock = new OrangeCobbleStoneBlock(this);
		PinkCobbleStoneBlock = new PinkCobbleStoneBlock(this);
		PurpleCobbleStoneBlock = new PurpleCobbleStoneBlock(this);
		RedCobbleStoneBlock = new RedCobbleStoneBlock(this);
		WhiteCobbleStoneBlock = new WhiteCobbleStoneBlock(this);
		YellowCobbleStoneBlock = new YellowCobbleStoneBlock(this);
		BlackGlowstone = new BlackGlowstone(this);
		BlueGlowstone = new BlueGlowstone(this);
		BrownGlowstone = new BrownGlowstone(this);
		CyanGlowstone = new CyanGlowstone(this);
		GreenGlowstone = new GreenGlowstone(this);
		LightBlueGlowstone = new LightBlueGlowstone(this);
		LimeGlowstone = new LimeGlowstone(this);
		MagentaGlowstone = new MagentaGlowstone(this);
		OrangeGlowstone = new OrangeGlowstone(this);
		PinkGlowstone = new PinkGlowstone(this);
		PurpleGlowstone = new PurpleGlowstone(this);
		RedGlowstone = new RedGlowstone(this);
		WhiteGlowstone = new WhiteGlowstone(this);
		YellowGlowstone = new YellowGlowstone(this);
		BlackWood = new BlackWood(this);
		BlueWood = new BlueWood(this);
		BrownWood = new BrownWood(this);
		CyanWood = new CyanWood(this);
		GreenWood = new GreenWood(this);
		LightBlueWood = new LightBlueWood(this);
		LimeWood = new LimeWood(this);
		MagentaWood = new MagentaWood(this);
		OrangeWood = new OrangeWood(this);
		PinkWood = new PinkWood(this);
		PurpleWood = new PurpleWood(this);
		RedWood = new RedWood(this);
		WhiteWood = new WhiteWood(this);
		YellowWood = new YellowWood(this);
		BlackObsidian = new BlackObsidian(this);
		BlueObsidian = new BlueObsidian(this);
		BrownObsidian = new BrownObsidian(this);
		CyanObsidian = new CyanObsidian(this);
		GreenObsidian = new GreenObsidian(this);
		LightBlueObsidian = new LightBlueObsidian(this);
		LimeObsidian = new LimeObsidian(this);
		MagentaObsidian = new MagentaObsidian(this);
		OrangeObsidian = new OrangeObsidian(this);
		PinkObsidian = new PinkObsidian(this);
		PurpleObsidian = new PurpleObsidian(this);
		RedObsidian = new RedObsidian(this);
		WhiteObsidian = new WhiteObsidian(this);
		YellowObsidian = new YellowObsidian(this);
		BlackGlass = new BlackGlass(this);
		BlueGlass = new BlueGlass(this);
		BrownGlass = new BrownGlass(this);
		CyanGlass = new CyanGlass(this);
		GreenGlass = new GreenGlass(this);
		LightBlueGlass = new LightBlueGlass(this);
		LimeGlass = new LimeGlass(this);
		MagentaGlass = new MagentaGlass(this);
		OrangeGlass = new OrangeGlass(this);
		PinkGlass = new PinkGlass(this);
		PurpleGlass = new PurpleGlass(this);
		RedGlass = new RedGlass(this);
		WhiteGlass = new WhiteGlass(this);
		YellowGlass = new YellowGlass(this);
    }

    public void setupRecipes()
    {
		SpoutShapedRecipe recipe = new SpoutShapedRecipe(new SpoutItemStack(BlackStoneBlock, 2));
		recipe.shape(new String[] {
		    "ABA"
		});
		recipe.setIngredient('A', MaterialData.stone);
		recipe.setIngredient('B', MaterialData.inkSac);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
		SpoutShapedRecipe recipe1 = new SpoutShapedRecipe(new SpoutItemStack(BlueStoneBlock, 2));
		recipe1.shape(new String[] {
		    "ABA"
		});
		recipe1.setIngredient('A', MaterialData.stone);
		recipe1.setIngredient('B', MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
		SpoutShapedRecipe recipe2 = new SpoutShapedRecipe(new SpoutItemStack(BrownStoneBlock, 2));
		recipe2.shape(new String[] {
		    "ABA"
		});
		recipe2.setIngredient('A', MaterialData.stone);
		recipe2.setIngredient('B', MaterialData.cocoaBeans);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
		SpoutShapedRecipe recipe3 = new SpoutShapedRecipe(new SpoutItemStack(CyanStoneBlock, 2));
		recipe3.shape(new String[] {
		    "ABA"
		});
		recipe3.setIngredient('A', MaterialData.stone);
		recipe3.setIngredient('B', MaterialData.cyanDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
		SpoutShapedRecipe recipe4 = new SpoutShapedRecipe(new SpoutItemStack(GreenStoneBlock, 2));
		recipe4.shape(new String[] {
		    "ABA"
		});
		recipe4.setIngredient('A', MaterialData.stone);
		recipe4.setIngredient('B', MaterialData.cactusGreen);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe4);
		SpoutShapedRecipe recipe5 = new SpoutShapedRecipe(new SpoutItemStack(LightBlueStoneBlock, 2));
		recipe5.shape(new String[] {
		    "ABA"
		});
		recipe5.setIngredient('A', MaterialData.stone);
		recipe5.setIngredient('B', MaterialData.lightBlueDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe5);
		SpoutShapedRecipe recipe6 = new SpoutShapedRecipe(new SpoutItemStack(LimeStoneBlock, 2));
		recipe6.shape(new String[] {
		    "ABA"
		});
		recipe6.setIngredient('A', MaterialData.stone);
		recipe6.setIngredient('B', MaterialData.limeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe6);
		SpoutShapedRecipe recipe7 = new SpoutShapedRecipe(new SpoutItemStack(MagentaStoneBlock, 2));
		recipe7.shape(new String[] {
		    "ABA"
		});
		recipe7.setIngredient('A', MaterialData.stone);
		recipe7.setIngredient('B', MaterialData.magentaDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe7);
		SpoutShapedRecipe recipe8 = new SpoutShapedRecipe(new SpoutItemStack(OrangeStoneBlock, 2));
		recipe8.shape(new String[] {
		    "ABA"
		});
		recipe8.setIngredient('A', MaterialData.stone);
		recipe8.setIngredient('B', MaterialData.orangeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe8);
		SpoutShapedRecipe recipe9 = new SpoutShapedRecipe(new SpoutItemStack(PinkStoneBlock, 2));
		recipe9.shape(new String[] {
		    "ABA"
		});
		recipe9.setIngredient('A', MaterialData.stone);
		recipe9.setIngredient('B', MaterialData.pinkDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe9);
		SpoutShapedRecipe recipe10 = new SpoutShapedRecipe(new SpoutItemStack(PurpleStoneBlock, 2));
		recipe10.shape(new String[] {
		    "ABA"
		});
		recipe10.setIngredient('A', MaterialData.stone);
		recipe10.setIngredient('B', MaterialData.purpleDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe10);
		SpoutShapedRecipe recipe11 = new SpoutShapedRecipe(new SpoutItemStack(RedStoneBlock, 2));
		recipe11.shape(new String[] {
		    "ABA"
		});
		recipe11.setIngredient('A', MaterialData.stone);
		recipe11.setIngredient('B', MaterialData.roseRed);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe11);
		SpoutShapedRecipe recipe12 = new SpoutShapedRecipe(new SpoutItemStack(WhiteStoneBlock, 2));
		recipe12.shape(new String[] {
		    "ABA"
		});
		recipe12.setIngredient('A', MaterialData.stone);
		recipe12.setIngredient('B', MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe12);
		SpoutShapedRecipe recipe13 = new SpoutShapedRecipe(new SpoutItemStack(YellowStoneBlock, 2));
		recipe13.shape(new String[] {
		    "ABA"
		});
		recipe13.setIngredient('A', MaterialData.stone);
		recipe13.setIngredient('B', MaterialData.dandelionYellow);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe13);
		SpoutShapedRecipe recipe14 = new SpoutShapedRecipe(new SpoutItemStack(BlackCobbleStoneBlock, 2));
		recipe14.shape(new String[] {
		    "ABA"
		});
		recipe14.setIngredient('A', MaterialData.cobblestone);
		recipe14.setIngredient('B', MaterialData.inkSac);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe14);
		SpoutShapedRecipe recipe15 = new SpoutShapedRecipe(new SpoutItemStack(BlueCobbleStoneBlock, 2));
		recipe15.shape(new String[] {
		    "ABA"
		});
		recipe15.setIngredient('A', MaterialData.cobblestone);
		recipe15.setIngredient('B', MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe15);
		SpoutShapedRecipe recipe16 = new SpoutShapedRecipe(new SpoutItemStack(BrownCobbleStoneBlock, 2));
		recipe16.shape(new String[] {
		    "ABA"
		});
		recipe16.setIngredient('A', MaterialData.cobblestone);
		recipe16.setIngredient('B', MaterialData.cocoaBeans);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe16);
		SpoutShapedRecipe recipe17 = new SpoutShapedRecipe(new SpoutItemStack(CyanCobbleStoneBlock, 2));
		recipe17.shape(new String[] {
		    "ABA"
		});
		recipe17.setIngredient('A', MaterialData.cobblestone);
		recipe17.setIngredient('B', MaterialData.cyanDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe17);
		SpoutShapedRecipe recipe18 = new SpoutShapedRecipe(new SpoutItemStack(GreenCobbleStoneBlock, 2));
		recipe18.shape(new String[] {
		    "ABA"
		});
		recipe18.setIngredient('A', MaterialData.cobblestone);
		recipe18.setIngredient('B', MaterialData.cactusGreen);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe18);
		SpoutShapedRecipe recipe19 = new SpoutShapedRecipe(new SpoutItemStack(LightBlueCobbleStoneBlock, 2));
		recipe19.shape(new String[] {
		    "ABA"
		});
		recipe19.setIngredient('A', MaterialData.cobblestone);
		recipe19.setIngredient('B', MaterialData.lightBlueDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe19);
		SpoutShapedRecipe recipe20 = new SpoutShapedRecipe(new SpoutItemStack(LimeCobbleStoneBlock, 2));
		recipe20.shape(new String[] {
		    "ABA"
		});
		recipe20.setIngredient('A', MaterialData.cobblestone);
		recipe20.setIngredient('B', MaterialData.limeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe20);
		SpoutShapedRecipe recipe21 = new SpoutShapedRecipe(new SpoutItemStack(MagentaCobbleStoneBlock, 2));
		recipe21.shape(new String[] {
		    "ABA"
		});
		recipe21.setIngredient('A', MaterialData.cobblestone);
		recipe21.setIngredient('B', MaterialData.magentaDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe21);
		SpoutShapedRecipe recipe22 = new SpoutShapedRecipe(new SpoutItemStack(OrangeCobbleStoneBlock, 2));
		recipe22.shape(new String[] {
		    "ABA"
		});
		recipe22.setIngredient('A', MaterialData.cobblestone);
		recipe22.setIngredient('B', MaterialData.orangeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe22);
		SpoutShapedRecipe recipe23 = new SpoutShapedRecipe(new SpoutItemStack(PinkCobbleStoneBlock, 2));
		recipe23.shape(new String[] {
		    "ABA"
		});
		recipe23.setIngredient('A', MaterialData.cobblestone);
		recipe23.setIngredient('B', MaterialData.pinkDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe9);
		SpoutShapedRecipe recipe24 = new SpoutShapedRecipe(new SpoutItemStack(PurpleCobbleStoneBlock, 2));
		recipe24.shape(new String[] {
		    "ABA"
		});
		recipe24.setIngredient('A', MaterialData.cobblestone);
		recipe24.setIngredient('B', MaterialData.purpleDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe24);
		SpoutShapedRecipe recipe25 = new SpoutShapedRecipe(new SpoutItemStack(RedCobbleStoneBlock, 2));
		recipe25.shape(new String[] {
		    "ABA"
		});
		recipe25.setIngredient('A', MaterialData.cobblestone);
		recipe25.setIngredient('B', MaterialData.roseRed);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe25);
		SpoutShapedRecipe recipe26 = new SpoutShapedRecipe(new SpoutItemStack(WhiteCobbleStoneBlock, 2));
		recipe26.shape(new String[] {
		    "ABA"
		});
		recipe26.setIngredient('A', MaterialData.cobblestone);
		recipe26.setIngredient('B', MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe26);
		SpoutShapedRecipe recipe27 = new SpoutShapedRecipe(new SpoutItemStack(YellowCobbleStoneBlock, 2));
		recipe27.shape(new String[] {
		    "ABA"
		});
		recipe27.setIngredient('A', MaterialData.cobblestone);
		recipe27.setIngredient('B', MaterialData.dandelionYellow);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe27);
		SpoutShapedRecipe recipe28 = new SpoutShapedRecipe(new SpoutItemStack(BlackGlowstone, 2));
		recipe28.shape(new String[] {
		    "ABA"
		});
		recipe28.setIngredient('A', MaterialData.glowstoneBlock);
		recipe28.setIngredient('B', MaterialData.inkSac);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe28);
		SpoutShapedRecipe recipe29 = new SpoutShapedRecipe(new SpoutItemStack(BlueGlowstone, 2));
		recipe29.shape(new String[] {
		    "ABA"
		});
		recipe29.setIngredient('A', MaterialData.glowstoneBlock);
		recipe29.setIngredient('B', MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe29);
		SpoutShapedRecipe recipe30 = new SpoutShapedRecipe(new SpoutItemStack(BrownGlowstone, 2));
		recipe30.shape(new String[] {
		    "ABA"
		});
		recipe30.setIngredient('A', MaterialData.glowstoneBlock);
		recipe30.setIngredient('B', MaterialData.cocoaBeans);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe30);
		SpoutShapedRecipe recipe31 = new SpoutShapedRecipe(new SpoutItemStack(CyanGlowstone, 2));
		recipe31.shape(new String[] {
		    "ABA"
		});
		recipe31.setIngredient('A', MaterialData.glowstoneBlock);
		recipe31.setIngredient('B', MaterialData.cyanDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe31);
		SpoutShapedRecipe recipe32 = new SpoutShapedRecipe(new SpoutItemStack(GreenGlowstone, 2));
		recipe32.shape(new String[] {
		    "ABA"
		});
		recipe32.setIngredient('A', MaterialData.glowstoneBlock);
		recipe32.setIngredient('B', MaterialData.cactusGreen);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe32);
		SpoutShapedRecipe recipe33 = new SpoutShapedRecipe(new SpoutItemStack(LightBlueGlowstone, 2));
		recipe33.shape(new String[] {
		    "ABA"
		});
		recipe33.setIngredient('A', MaterialData.glowstoneBlock);
		recipe33.setIngredient('B', MaterialData.lightBlueDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe33);
		SpoutShapedRecipe recipe34 = new SpoutShapedRecipe(new SpoutItemStack(LimeGlowstone, 2));
		recipe34.shape(new String[] {
		    "ABA"
		});
		recipe34.setIngredient('A', MaterialData.glowstoneBlock);
		recipe34.setIngredient('B', MaterialData.limeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe34);
		SpoutShapedRecipe recipe35 = new SpoutShapedRecipe(new SpoutItemStack(MagentaGlowstone, 2));
		recipe35.shape(new String[] {
		    "ABA"
		});
		recipe35.setIngredient('A', MaterialData.glowstoneBlock);
		recipe35.setIngredient('B', MaterialData.magentaDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe21);
		SpoutShapedRecipe recipe36 = new SpoutShapedRecipe(new SpoutItemStack(OrangeGlowstone, 2));
		recipe36.shape(new String[] {
		    "ABA"
		});
		recipe36.setIngredient('A', MaterialData.glowstoneBlock);
		recipe36.setIngredient('B', MaterialData.orangeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe36);
		SpoutShapedRecipe recipe37 = new SpoutShapedRecipe(new SpoutItemStack(PinkGlowstone, 2));
		recipe37.shape(new String[] {
		    "ABA"
		});
		recipe37.setIngredient('A', MaterialData.glowstoneBlock);
		recipe37.setIngredient('B', MaterialData.pinkDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe37);
		SpoutShapedRecipe recipe38 = new SpoutShapedRecipe(new SpoutItemStack(PurpleGlowstone, 2));
		recipe38.shape(new String[] {
		    "ABA"
		});
		recipe38.setIngredient('A', MaterialData.glowstoneBlock);
		recipe38.setIngredient('B', MaterialData.purpleDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe38);
		SpoutShapedRecipe recipe39 = new SpoutShapedRecipe(new SpoutItemStack(RedGlowstone, 2));
		recipe39.shape(new String[] {
		    "ABA"
		});
		recipe39.setIngredient('A', MaterialData.glowstoneBlock);
		recipe39.setIngredient('B', MaterialData.roseRed);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe39);
		SpoutShapedRecipe recipe40 = new SpoutShapedRecipe(new SpoutItemStack(WhiteGlowstone, 2));
		recipe40.shape(new String[] {
		    "ABA"
		});
		recipe40.setIngredient('A', MaterialData.glowstoneBlock);
		recipe40.setIngredient('B', MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe40);
		SpoutShapedRecipe recipe41 = new SpoutShapedRecipe(new SpoutItemStack(YellowGlowstone, 2));
		recipe41.shape(new String[] {
		    "ABA"
		});
		recipe41.setIngredient('A', MaterialData.glowstoneBlock);
		recipe41.setIngredient('B', MaterialData.dandelionYellow);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe41);
		SpoutShapedRecipe recipe42 = new SpoutShapedRecipe(new SpoutItemStack(BlackWood, 2));
		recipe42.shape(new String[] {
		    "ABA"
		});
		recipe42.setIngredient('A', MaterialData.wood);
		recipe42.setIngredient('B', MaterialData.inkSac);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe42);
		SpoutShapedRecipe recipe43 = new SpoutShapedRecipe(new SpoutItemStack(BlueWood, 2));
		recipe43.shape(new String[] {
		    "ABA"
		});
		recipe43.setIngredient('A', MaterialData.wood);
		recipe43.setIngredient('B', MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe43);
		SpoutShapedRecipe recipe44 = new SpoutShapedRecipe(new SpoutItemStack(BrownWood, 2));
		recipe44.shape(new String[] {
		    "ABA"
		});
		recipe44.setIngredient('A', MaterialData.wood);
		recipe44.setIngredient('B', MaterialData.cocoaBeans);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe44);
		SpoutShapedRecipe recipe45 = new SpoutShapedRecipe(new SpoutItemStack(CyanWood, 2));
		recipe45.shape(new String[] {
		    "ABA"
		});
		recipe45.setIngredient('A', MaterialData.wood);
		recipe45.setIngredient('B', MaterialData.cyanDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe45);
		SpoutShapedRecipe recipe46 = new SpoutShapedRecipe(new SpoutItemStack(GreenWood, 2));
		recipe46.shape(new String[] {
		    "ABA"
		});
		recipe46.setIngredient('A', MaterialData.wood);
		recipe46.setIngredient('B', MaterialData.cactusGreen);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe46);
		SpoutShapedRecipe recipe47 = new SpoutShapedRecipe(new SpoutItemStack(LightBlueWood, 2));
		recipe47.shape(new String[] {
		    "ABA"
		});
		recipe47.setIngredient('A', MaterialData.wood);
		recipe47.setIngredient('B', MaterialData.lightBlueDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe47);
		SpoutShapedRecipe recipe48 = new SpoutShapedRecipe(new SpoutItemStack(LimeWood, 2));
		recipe48.shape(new String[] {
		    "ABA"
		});
		recipe48.setIngredient('A', MaterialData.wood);
		recipe48.setIngredient('B', MaterialData.limeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe48);
		SpoutShapedRecipe recipe49 = new SpoutShapedRecipe(new SpoutItemStack(MagentaWood, 2));
		recipe49.shape(new String[] {
		    "ABA"
		});
		recipe49.setIngredient('A', MaterialData.wood);
		recipe49.setIngredient('B', MaterialData.magentaDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe49);
		SpoutShapedRecipe recipe50 = new SpoutShapedRecipe(new SpoutItemStack(OrangeWood, 2));
		recipe50.shape(new String[] {
		    "ABA"
		});
		recipe50.setIngredient('A', MaterialData.wood);
		recipe50.setIngredient('B', MaterialData.orangeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe50);
		SpoutShapedRecipe recipe51 = new SpoutShapedRecipe(new SpoutItemStack(PinkWood, 2));
		recipe51.shape(new String[] {
		    "ABA"
		});
		recipe51.setIngredient('A', MaterialData.wood);
		recipe51.setIngredient('B', MaterialData.pinkDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe51);
		SpoutShapedRecipe recipe52 = new SpoutShapedRecipe(new SpoutItemStack(PurpleWood, 2));
		recipe52.shape(new String[] {
		    "ABA"
		});
		recipe52.setIngredient('A', MaterialData.wood);
		recipe52.setIngredient('B', MaterialData.purpleDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe52);
		SpoutShapedRecipe recipe53 = new SpoutShapedRecipe(new SpoutItemStack(RedWood, 2));
		recipe53.shape(new String[] {
		    "ABA"
		});
		recipe53.setIngredient('A', MaterialData.wood);
		recipe53.setIngredient('B', MaterialData.roseRed);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe53);
		SpoutShapedRecipe recipe54 = new SpoutShapedRecipe(new SpoutItemStack(WhiteWood, 2));
		recipe54.shape(new String[] {
		    "ABA"
		});
		recipe54.setIngredient('A', MaterialData.wood);
		recipe54.setIngredient('B', MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe54);
		SpoutShapedRecipe recipe55 = new SpoutShapedRecipe(new SpoutItemStack(YellowWood, 2));
		recipe55.shape(new String[] {
		    "ABA"
		});
		recipe55.setIngredient('A', MaterialData.wood);
		recipe55.setIngredient('B', MaterialData.dandelionYellow);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe55);
		SpoutShapedRecipe recipe56 = new SpoutShapedRecipe(new SpoutItemStack(BlackObsidian, 2));
		recipe56.shape(new String[] {
		    "ABA"
		});
		recipe56.setIngredient('A', MaterialData.obsidian);
		recipe56.setIngredient('B', MaterialData.inkSac);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe56);
		SpoutShapedRecipe recipe57 = new SpoutShapedRecipe(new SpoutItemStack(BlueObsidian, 2));
		recipe57.shape(new String[] {
		    "ABA"
		});
		recipe57.setIngredient('A', MaterialData.obsidian);
		recipe57.setIngredient('B', MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe57);
		SpoutShapedRecipe recipe58 = new SpoutShapedRecipe(new SpoutItemStack(BrownObsidian, 2));
		recipe58.shape(new String[] {
		    "ABA"
		});
		recipe58.setIngredient('A', MaterialData.obsidian);
		recipe58.setIngredient('B', MaterialData.cocoaBeans);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe58);
		SpoutShapedRecipe recipe59 = new SpoutShapedRecipe(new SpoutItemStack(CyanObsidian, 2));
		recipe59.shape(new String[] {
		    "ABA"
		});
		recipe59.setIngredient('A', MaterialData.obsidian);
		recipe59.setIngredient('B', MaterialData.cyanDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe59);
		SpoutShapedRecipe recipe60 = new SpoutShapedRecipe(new SpoutItemStack(GreenObsidian, 2));
		recipe60.shape(new String[] {
		    "ABA"
		});
		recipe60.setIngredient('A', MaterialData.obsidian);
		recipe60.setIngredient('B', MaterialData.cactusGreen);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe60);
		SpoutShapedRecipe recipe61 = new SpoutShapedRecipe(new SpoutItemStack(LightBlueObsidian, 2));
		recipe61.shape(new String[] {
		    "ABA"
		});
		recipe61.setIngredient('A', MaterialData.obsidian);
		recipe61.setIngredient('B', MaterialData.lightBlueDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe61);
		SpoutShapedRecipe recipe62 = new SpoutShapedRecipe(new SpoutItemStack(LimeObsidian, 2));
		recipe62.shape(new String[] {
		    "ABA"
		});
		recipe62.setIngredient('A', MaterialData.obsidian);
		recipe62.setIngredient('B', MaterialData.limeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe62);
		SpoutShapedRecipe recipe63 = new SpoutShapedRecipe(new SpoutItemStack(MagentaObsidian, 2));
		recipe63.shape(new String[] {
		    "ABA"
		});
		recipe63.setIngredient('A', MaterialData.obsidian);
		recipe63.setIngredient('B', MaterialData.magentaDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe63);
		SpoutShapedRecipe recipe64 = new SpoutShapedRecipe(new SpoutItemStack(OrangeObsidian, 2));
		recipe64.shape(new String[] {
		    "ABA"
		});
		recipe64.setIngredient('A', MaterialData.obsidian);
		recipe64.setIngredient('B', MaterialData.orangeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe64);
		SpoutShapedRecipe recipe65 = new SpoutShapedRecipe(new SpoutItemStack(PinkObsidian, 2));
		recipe65.shape(new String[] {
		    "ABA"
		});
		recipe65.setIngredient('A', MaterialData.obsidian);
		recipe65.setIngredient('B', MaterialData.pinkDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe65);
		SpoutShapedRecipe recipe66 = new SpoutShapedRecipe(new SpoutItemStack(PurpleObsidian, 2));
		recipe66.shape(new String[] {
		    "ABA"
		});
		recipe66.setIngredient('A', MaterialData.obsidian);
		recipe66.setIngredient('B', MaterialData.purpleDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe66);
		SpoutShapedRecipe recipe67 = new SpoutShapedRecipe(new SpoutItemStack(RedObsidian, 2));
		recipe67.shape(new String[] {
		    "ABA"
		});
		recipe67.setIngredient('A', MaterialData.obsidian);
		recipe67.setIngredient('B', MaterialData.roseRed);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe67);
		SpoutShapedRecipe recipe68 = new SpoutShapedRecipe(new SpoutItemStack(WhiteObsidian, 2));
		recipe68.shape(new String[] {
		    "ABA"
		});
		recipe68.setIngredient('A', MaterialData.obsidian);
		recipe68.setIngredient('B', MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe68);
		SpoutShapedRecipe recipe69 = new SpoutShapedRecipe(new SpoutItemStack(YellowObsidian, 2));
		recipe69.shape(new String[] {
		    "ABA"
		});
		recipe69.setIngredient('A', MaterialData.obsidian);
		recipe69.setIngredient('B', MaterialData.dandelionYellow);
		SpoutManager.getMaterialManager().registerSpoutRecipe(recipe69);
		SpoutShapedRecipe glass = new SpoutShapedRecipe(new SpoutItemStack(BlackGlass, 2));
		glass.shape(new String[] {
		    "ABA"
		});
		glass.setIngredient('A', MaterialData.stone);
		glass.setIngredient('B', MaterialData.inkSac);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass);
		SpoutShapedRecipe glass1 = new SpoutShapedRecipe(new SpoutItemStack(BlueGlass, 2));
		glass1.shape(new String[] {
		    "ABA"
		});
		glass1.setIngredient('A', MaterialData.glass);
		glass1.setIngredient('B', MaterialData.lapisLazuli);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass1);
		SpoutShapedRecipe glass2 = new SpoutShapedRecipe(new SpoutItemStack(BrownGlass, 2));
		glass2.shape(new String[] {
		    "ABA"
		});
		glass2.setIngredient('A', MaterialData.glass);
		glass2.setIngredient('B', MaterialData.cocoaBeans);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass2);
		SpoutShapedRecipe glass3 = new SpoutShapedRecipe(new SpoutItemStack(CyanGlass, 2));
		glass3.shape(new String[] {
		    "ABA"
		});
		glass3.setIngredient('A', MaterialData.glass);
		glass3.setIngredient('B', MaterialData.cyanDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass3);
		SpoutShapedRecipe glass4 = new SpoutShapedRecipe(new SpoutItemStack(GreenGlass, 2));
		glass4.shape(new String[] {
		    "ABA"
		});
		glass4.setIngredient('A', MaterialData.glass);
		glass4.setIngredient('B', MaterialData.cactusGreen);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass4);
		SpoutShapedRecipe glass5 = new SpoutShapedRecipe(new SpoutItemStack(LightBlueGlass, 2));
		glass5.shape(new String[] {
		    "ABA"
		});
		glass5.setIngredient('A', MaterialData.glass);
		glass5.setIngredient('B', MaterialData.lightBlueDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass5);
		SpoutShapedRecipe glass6 = new SpoutShapedRecipe(new SpoutItemStack(LimeGlass, 2));
		glass6.shape(new String[] {
		    "ABA"
		});
		glass6.setIngredient('A', MaterialData.glass);
		glass6.setIngredient('B', MaterialData.limeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass6);
		SpoutShapedRecipe glass7 = new SpoutShapedRecipe(new SpoutItemStack(MagentaGlass, 2));
		glass7.shape(new String[] {
		    "ABA"
		});
		glass7.setIngredient('A', MaterialData.glass);
		glass7.setIngredient('B', MaterialData.magentaDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass7);
		SpoutShapedRecipe glass8 = new SpoutShapedRecipe(new SpoutItemStack(OrangeGlass, 2));
		glass8.shape(new String[] {
		    "ABA"
		});
		glass8.setIngredient('A', MaterialData.glass);
		glass8.setIngredient('B', MaterialData.orangeDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass8);
		SpoutShapedRecipe glass9 = new SpoutShapedRecipe(new SpoutItemStack(PinkGlass, 2));
		glass9.shape(new String[] {
		    "ABA"
		});
		glass9.setIngredient('A', MaterialData.glass);
		glass9.setIngredient('B', MaterialData.pinkDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass9);
		SpoutShapedRecipe glass10 = new SpoutShapedRecipe(new SpoutItemStack(PurpleGlass, 2));
		glass10.shape(new String[] {
		    "ABA"
		});
		glass10.setIngredient('A', MaterialData.glass);
		glass10.setIngredient('B', MaterialData.purpleDye);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass10);
		SpoutShapedRecipe glass11 = new SpoutShapedRecipe(new SpoutItemStack(RedGlass, 2));
		glass11.shape(new String[] {
		    "ABA"
		});
		glass11.setIngredient('A', MaterialData.glass);
		glass11.setIngredient('B', MaterialData.roseRed);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass11);
		SpoutShapedRecipe glass12 = new SpoutShapedRecipe(new SpoutItemStack(WhiteGlass, 2));
		glass12.shape(new String[] {
		    "ABA"
		});
		glass12.setIngredient('A', MaterialData.glass);
		glass12.setIngredient('B', MaterialData.boneMeal);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass12);
		SpoutShapedRecipe glass13 = new SpoutShapedRecipe(new SpoutItemStack(YellowGlass, 2));
		glass13.shape(new String[] {
		    "ABA"
		});
		glass13.setIngredient('A', MaterialData.glass);
		glass13.setIngredient('B', MaterialData.dandelionYellow);
		SpoutManager.getMaterialManager().registerSpoutRecipe(glass13);
    }

    public static CustomBlock BlackStoneBlock;
    CustomBlock BlueStoneBlock;
    CustomBlock BrownStoneBlock;
    CustomBlock CyanStoneBlock;
    CustomBlock GreenStoneBlock;
    CustomBlock LightBlueStoneBlock;
    CustomBlock LimeStoneBlock;
    CustomBlock MagentaStoneBlock;
    CustomBlock OrangeStoneBlock;
    CustomBlock PinkStoneBlock;
    CustomBlock PurpleStoneBlock;
    CustomBlock RedStoneBlock;
    CustomBlock WhiteStoneBlock;
    CustomBlock YellowStoneBlock;
    CustomBlock BlackCobbleStoneBlock;
    CustomBlock BlueCobbleStoneBlock;
    CustomBlock BrownCobbleStoneBlock;
    CustomBlock CyanCobbleStoneBlock;
    CustomBlock GreenCobbleStoneBlock;
    CustomBlock LightBlueCobbleStoneBlock;
    CustomBlock LimeCobbleStoneBlock;
    CustomBlock MagentaCobbleStoneBlock;
    CustomBlock OrangeCobbleStoneBlock;
    CustomBlock PinkCobbleStoneBlock;
    CustomBlock PurpleCobbleStoneBlock;
    CustomBlock RedCobbleStoneBlock;
    CustomBlock WhiteCobbleStoneBlock;
    CustomBlock YellowCobbleStoneBlock;
    CustomBlock BlackGlowstone;
    CustomBlock BlueGlowstone;
    CustomBlock BrownGlowstone;
    CustomBlock CyanGlowstone;
    CustomBlock GreenGlowstone;
    CustomBlock LightBlueGlowstone;
    CustomBlock LimeGlowstone;
    CustomBlock MagentaGlowstone;
    CustomBlock OrangeGlowstone;
    CustomBlock PinkGlowstone;
    CustomBlock PurpleGlowstone;
    CustomBlock RedGlowstone;
    CustomBlock WhiteGlowstone;
    CustomBlock YellowGlowstone;
    CustomBlock BlackWood;
    CustomBlock BlueWood;
    CustomBlock BrownWood;
    CustomBlock CyanWood;
    CustomBlock GreenWood;
    CustomBlock LightBlueWood;
    CustomBlock LimeWood;
    CustomBlock MagentaWood;
    CustomBlock OrangeWood;
    CustomBlock PinkWood;
    CustomBlock PurpleWood;
    CustomBlock RedWood;
    CustomBlock WhiteWood;
    CustomBlock YellowWood;
    CustomBlock BlackObsidian;
    CustomBlock BlueObsidian;
    CustomBlock BrownObsidian;
    CustomBlock CyanObsidian;
    CustomBlock GreenObsidian;
    CustomBlock LightBlueObsidian;
    CustomBlock LimeObsidian;
    CustomBlock MagentaObsidian;
    CustomBlock OrangeObsidian;
    CustomBlock PinkObsidian;
    CustomBlock PurpleObsidian;
    CustomBlock RedObsidian;
    CustomBlock WhiteObsidian;
    CustomBlock YellowObsidian;
    CustomBlock BlackGlass;
    CustomBlock BlueGlass;
    CustomBlock BrownGlass;
    CustomBlock CyanGlass;
    CustomBlock GreenGlass;
    CustomBlock LightBlueGlass;
    CustomBlock LimeGlass;
    CustomBlock MagentaGlass;
    CustomBlock OrangeGlass;
    CustomBlock PinkGlass;
    CustomBlock PurpleGlass;
    CustomBlock RedGlass;
    CustomBlock WhiteGlass;
    CustomBlock YellowGlass;
    Logger log;
    public Texture BlackStoneBlockTexture;
    Texture BlueStoneBlockTexture;
    Texture BrownStoneBlockTexture;
    Texture CyanStoneBlockTexture;
    Texture GreenStoneBlockTexture;
    Texture LightBlueStoneBlockTexture;
    Texture LimeStoneBlockTexture;
    Texture MagentaStoneBlockTexture;
    Texture OrangeStoneBlockTexture;
    Texture PinkStoneBlockTexture;
    Texture PurpleStoneBlockTexture;
    Texture RedStoneBlockTexture;
    Texture WhiteStoneBlockTexture;
    Texture YellowStoneBlockTexture;
    Texture BlackCobbleStoneBlockTexture;
    Texture BlueCobbleStoneBlockTexture;
    Texture BrownCobbleStoneBlockTexture;
    Texture CyanCobbleStoneBlockTexture;
    Texture GreenCobbleStoneBlockTexture;
    Texture LightBlueCobbleStoneBlockTexture;
    Texture LimeCobbleStoneBlockTexture;
    Texture MagentaCobbleStoneBlockTexture;
    Texture OrangeCobbleStoneBlockTexture;
    Texture PinkCobbleStoneBlockTexture;
    Texture PurpleCobbleStoneBlockTexture;
    Texture RedCobbleStoneBlockTexture;
    Texture WhiteCobbleStoneBlockTexture;
    Texture YellowCobbleStoneBlockTexture;
    Texture BlackGlowstoneTexture;
    Texture BlueGlowstoneTexture;
    Texture BrownGlowstoneTexture;
    Texture CyanGlowstoneTexture;
    Texture GreenGlowstoneTexture;
    Texture LightBlueGlowstoneTexture;
    Texture LimeGlowstoneTexture;
    Texture MagentaGlowstoneTexture;
    Texture OrangeGlowstoneTexture;
    Texture PinkGlowstoneTexture;
    Texture PurpleGlowstoneTexture;
    Texture RedGlowstoneTexture;
    Texture WhiteGlowstoneTexture;
    Texture YellowGlowstoneTexture;
    Texture BlackWoodTexture;
    Texture BlueWoodTexture;
    Texture BrownWoodTexture;
    Texture CyanWoodTexture;
    Texture GreenWoodTexture;
    Texture LightBlueWoodTexture;
    Texture LimeWoodTexture;
    Texture MagentaWoodTexture;
    Texture OrangeWoodTexture;
    Texture PinkWoodTexture;
    Texture PurpleWoodTexture;
    Texture RedWoodTexture;
    Texture WhiteWoodTexture;
    Texture YellowWoodTexture;
    Texture BlackObsidianTexture;
    Texture BlueObsidianTexture;
    Texture BrownObsidianTexture;
    Texture CyanObsidianTexture;
    Texture GreenObsidianTexture;
    Texture LightBlueObsidianTexture;
    Texture LimeObsidianTexture;
    Texture MagentaObsidianTexture;
    Texture OrangeObsidianTexture;
    Texture PinkObsidianTexture;
    Texture PurpleObsidianTexture;
    Texture RedObsidianTexture;
    Texture WhiteObsidianTexture;
    Texture YellowObsidianTexture;
    Texture BlackGlassTexture;
    Texture BlueGlassTexture;
    Texture BrownGlassTexture;
    Texture CyanGlassTexture;
    Texture GreenGlassTexture;
    Texture LightBlueGlassTexture;
    Texture LimeGlassTexture;
    Texture MagentaGlassTexture;
    Texture OrangeGlassTexture;
    Texture PinkGlassTexture;
    Texture PurpleGlassTexture;
    Texture RedGlassTexture;
    Texture WhiteGlassTexture;
    Texture YellowGlassTexture;
}