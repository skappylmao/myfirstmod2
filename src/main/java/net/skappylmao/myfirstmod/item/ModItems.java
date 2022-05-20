package net.skappylmao.myfirstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.skappylmao.myfirstmod.MyFirstMod;



public class ModItems {

    public static final Item MRBEAST_BURGER = registerItem("mrbeast_burger",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));

    public static final Item MRBEAST_FRIES = registerItem("mrbeast_fries",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MyFirstMod.MOD_ID, name), item);
    }


    public static void registerModItems(){
        MyFirstMod.LOGGER.info("Registering mod items for " + MyFirstMod.MOD_ID);
    }
}
