/*
 *  Copyright 2012 Owexz.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package net.owexz.PaintedStone;
 
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.*;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;
 
 
public class PaintedStone extends JavaPlugin
{
 
    public PaintedStone()
    {
        log = Logger.getLogger("Minecraft");
        BlackStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/5578079.png", 64, 16, 16);
        BlueStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1864681.png", 64, 16, 16);
        BrownStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/9251445.png", 64, 16, 16);
        CyanStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/4248659.png", 64, 16, 16);
        GreenStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/3464522.png", 64, 16, 16);
        LightBlueStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6757814.png", 64, 16, 16);
        LimeStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7239441.png", 64, 16, 16);
        MagentaStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7694621.png", 64, 16, 16);
        OrangeStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7151376.png", 64, 16, 16);
        PinkStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7831939.png", 64, 16, 16);
        PurpleStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/9137035.png", 64, 16, 16);
        RedStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6750918.png", 64, 16, 16);
        WhiteStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6338613.png", 64, 16, 16);
        YellowStoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/3983204.png", 64, 16, 16);
        
    }
 
    public void onEnable()
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
        SpoutShapedRecipe recipe = new SpoutShapedRecipe(new SpoutItemStack(BlackStoneBlock, 4));
        recipe.shape(" A ", "ABA", " A ");
        recipe.setIngredient('A', MaterialData.stone);
        recipe.setIngredient('B', MaterialData.inkSac);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
        SpoutShapedRecipe recipe1 = new SpoutShapedRecipe(new SpoutItemStack(BlueStoneBlock, 4));
        recipe1.shape(" A ", "ABA", " A ");
        recipe1.setIngredient('A', MaterialData.stone);
        recipe1.setIngredient('B', MaterialData.lapisLazuli);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
        SpoutShapedRecipe recipe2 = new SpoutShapedRecipe(new SpoutItemStack(BrownStoneBlock, 4));
        recipe2.shape(" A ", "ABA", " A ");
        recipe2.setIngredient('A', MaterialData.stone);
        recipe2.setIngredient('B', MaterialData.cocoaBeans);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
        SpoutShapedRecipe recipe3 = new SpoutShapedRecipe(new SpoutItemStack(CyanStoneBlock, 4));
        recipe3.shape(" A ", "ABA", " A ");
        recipe3.setIngredient('A', MaterialData.stone);
        recipe3.setIngredient('B', MaterialData.cyanDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
        SpoutShapedRecipe recipe4 = new SpoutShapedRecipe(new SpoutItemStack(GreenStoneBlock, 4));
        recipe4.shape(" A ", "ABA", " A ");
        recipe4.setIngredient('A', MaterialData.stone);
        recipe4.setIngredient('B', MaterialData.cactusGreen);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe4);
        SpoutShapedRecipe recipe5 = new SpoutShapedRecipe(new SpoutItemStack(LightBlueStoneBlock, 4));
        recipe5.shape(" A ", "ABA", " A ");
        recipe5.setIngredient('A', MaterialData.stone);
        recipe5.setIngredient('B', MaterialData.lightBlueDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe5);
        SpoutShapedRecipe recipe6 = new SpoutShapedRecipe(new SpoutItemStack(LimeStoneBlock, 4));
        recipe6.shape(" A ", "ABA", " A ");
        recipe6.setIngredient('A', MaterialData.stone);
        recipe6.setIngredient('B', MaterialData.limeDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe6);
        SpoutShapedRecipe recipe7 = new SpoutShapedRecipe(new SpoutItemStack(MagentaStoneBlock, 4));
        recipe7.shape(" A ", "ABA", " A ");
        recipe7.setIngredient('A', MaterialData.stone);
        recipe7.setIngredient('B', MaterialData.magentaDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe7);
        SpoutShapedRecipe recipe8 = new SpoutShapedRecipe(new SpoutItemStack(OrangeStoneBlock, 4));
        recipe8.shape(" A ", "ABA", " A ");
        recipe8.setIngredient('A', MaterialData.stone);
        recipe8.setIngredient('B', MaterialData.orangeDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe8);
        SpoutShapedRecipe recipe9 = new SpoutShapedRecipe(new SpoutItemStack(PinkStoneBlock, 4));
        recipe9.shape(" A ", "ABA", " A ");
        recipe9.setIngredient('A', MaterialData.stone);
        recipe9.setIngredient('B', MaterialData.pinkDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe9);
        SpoutShapedRecipe recipe10 = new SpoutShapedRecipe(new SpoutItemStack(PurpleStoneBlock, 4));
        recipe10.shape(" A ", "ABA", " A ");
        recipe10.setIngredient('A', MaterialData.stone);
        recipe10.setIngredient('B', MaterialData.purpleDye);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe10);
        SpoutShapedRecipe recipe11 = new SpoutShapedRecipe(new SpoutItemStack(RedStoneBlock, 4));
        recipe11.shape(" A ", "ABA", " A ");
        recipe11.setIngredient('A', MaterialData.stone);
        recipe11.setIngredient('B', MaterialData.roseRed);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe11);
        SpoutShapedRecipe recipe12 = new SpoutShapedRecipe(new SpoutItemStack(WhiteStoneBlock, 4));
        recipe12.shape(" A ", "ABA", " A ");
        recipe12.setIngredient('A', MaterialData.stone);
        recipe12.setIngredient('B', MaterialData.boneMeal);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe12);
        SpoutShapedRecipe recipe13 = new SpoutShapedRecipe(new SpoutItemStack(YellowStoneBlock, 4));
        recipe13.shape(" A ", "ABA", " A ");
        recipe13.setIngredient('A', MaterialData.stone);
        recipe13.setIngredient('B', MaterialData.dandelionYellow);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe13);
        log.info("PaintedStone by Owexz (Owexz.net) Enabled");
    }
 
    public void onDisable()
    {
        log.info("PaintedStone by Owexz (Owexz.net) disabled.");
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
    
}