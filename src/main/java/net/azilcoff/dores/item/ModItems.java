package net.azilcoff.dores.item;

import net.azilcoff.dores.DestructiveOres;
import net.azilcoff.dores.item.custom.UraniumItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item URANIUM = registerItem("uranium", UraniumItem::new);

    public static <R extends Item> Item registerItem (String id, Function<Item.Settings,R> entry){
        return Registry.register(Registries.ITEM, Identifier.of(DestructiveOres.MOD_ID, id), entry.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DestructiveOres.MOD_ID, id)))));
    }

    public static void registerModItems(){
        DestructiveOres.LOGGER.info("Registering Mod Items for "+DestructiveOres.MOD_ID);
    }

    public static String getItemTranslationKey(Item item){
        return item.getTranslationKey();
    }
}
