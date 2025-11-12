package net.azilcoff.dores.tag;

import net.azilcoff.dores.DestructiveOres;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> URANIUM_TOOL_MATERIALS = createTag("uranium_tool_materials");

    private static TagKey<Item> createTag (String name){
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(DestructiveOres.MOD_ID,name));
    }
}
