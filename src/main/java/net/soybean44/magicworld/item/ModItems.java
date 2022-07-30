package net.soybean44.magicworld.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.soybean44.magicworld.MagicWorld;

public class ModItems {

    public static final Item SOLIDIFIED_AURA = registerItem("solidified_aura",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MagicWorld.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MagicWorld.LOGGER.debug("Registering Mod Item for " + MagicWorld.MOD_ID);
    }
}
