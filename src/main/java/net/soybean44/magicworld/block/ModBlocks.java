package net.soybean44.magicworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.soybean44.magicworld.MagicWorld;
import net.soybean44.magicworld.item.ModItemGroup;

public class ModBlocks {
    public static final Block SOLIDIFIED_AURA_BLOCK = registerBlock("solidified_aura_block",
            new Block(FabricBlockSettings.of(Material.STONE).luminance(14).strength(2f)), ModItemGroup.MAGIC_WORLD);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK, new Identifier(MagicWorld.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MagicWorld.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        MagicWorld.LOGGER.debug("Registering ModBlocks for " + MagicWorld.MOD_ID);
    }
}
