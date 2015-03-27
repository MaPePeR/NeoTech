package com.dyonovan.neotech.handlers;

import com.dyonovan.neotech.common.items.BaseItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ItemHandler {

    public static Item dustIron, dustGold, ingotCopper, dustCopper, ingotTin, dustTin, speedProcessor, effRam;

    public static void PreInit() {

        registerItem(dustCopper = new BaseItem("dustCopper", 64), "dustCopper", "dustCopper");
        registerItem(dustTin = new BaseItem("dustTin", 64), "dustTin", "dustTin");
        registerItem(dustIron = new BaseItem("dustIron", 64), "dustIron", "dustIron");
        registerItem(dustGold = new BaseItem("dustGold", 64), "dustGold", "dustGold");
        registerItem(ingotCopper = new BaseItem("ingotCopper", 64), "ingotCopper", "ingotCopper");
        registerItem(ingotTin = new BaseItem("ingotTin", 64), "ingotTin", "ingotTin");
        registerItem(speedProcessor = new BaseItem("speedProcessor", 4), "speedProcessor", null);
        registerItem(effRam = new BaseItem("effRam", 4), "effRam", null);

    }

    public static void registerItem(Item registerItem, String name, String oreDict) {
        GameRegistry.registerItem(registerItem, name);
        if(oreDict != null)
            OreDictionary.registerOre(oreDict, registerItem);
    }
}
