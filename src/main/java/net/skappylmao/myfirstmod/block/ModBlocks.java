package net.skappylmao.myfirstmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.skappylmao.myfirstmod.MyFirstMod;

public class ModBlocks {

    public static final Block MEAT_BLOCK = registerBlock("meat_block",
            new Block(FabricBlockSettings.of(Material.MOSS_BLOCK).strength(0.5f)), ItemGroup.FOOD);

    public static final Block MEAT_ORE = registerBlock("meat_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1f)), ItemGroup.FOOD);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MyFirstMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {

        return Registry.register(Registry.ITEM, new Identifier(MyFirstMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }


    public static void registerModBlocks() {
        MyFirstMod.LOGGER.info("Registering mod blocks for " + MyFirstMod.MOD_ID);
    }
}
