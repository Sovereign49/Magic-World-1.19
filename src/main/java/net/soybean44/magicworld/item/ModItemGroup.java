package net.soybean44.magicworld.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.soybean44.magicworld.MagicWorld;

public class ModItemGroup {
    public static final ItemGroup MAGIC_WORLD = FabricItemGroupBuilder.build(new Identifier(MagicWorld.MOD_ID, "mgworld"), () -> new ItemStack(ModItems.SOLIDIFIED_AURA));
}
