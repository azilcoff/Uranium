package net.azilcoff.dores.datagen;

import net.azilcoff.dores.block.ModBlocks;
import net.azilcoff.dores.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.URANIUM_ORE, oreDrops(ModBlocks.URANIUM_ORE, ModItems.URANIUM));
        addDrop(ModBlocks.DEEPSLATE_URANIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_URANIUM_ORE, ModItems.URANIUM));
    }
}
