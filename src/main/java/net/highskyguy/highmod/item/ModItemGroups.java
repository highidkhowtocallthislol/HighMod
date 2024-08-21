package net.highskyguy.highmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.highskyguy.highmod.HighMod;
import net.highskyguy.highmod.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HighMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        // If you are reading the source, sound block is inherited from the bedrock mining profile which is impossible to mine.
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.MY_GYATT);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_DOOR);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_SHIRT);
                        entries.add(ModItems.RUBY_PENIS_PROTECTOR);
                        entries.add(ModItems.RUBY_FEET_PICTURE_POSTER);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.CORN);
                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);
                        entries.add(ModBlocks.GEM_POLISHING_STATION);
                    }).build());
    public static final ItemGroup ILLEGAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HighMod.MOD_ID, "metal_detector"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.illegal"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                       entries.add(Items.COMMAND_BLOCK);
                       entries.add(Items.CHAIN_COMMAND_BLOCK);
                       entries.add(Items.REPEATING_COMMAND_BLOCK);
                       entries.add(Items.SPAWNER);
                       entries.add(Items.END_PORTAL_FRAME);





                    }).build());

    public static void registerItemGroups() {
        HighMod.LOGGER.info("Registering Item Groups for " + HighMod.MOD_ID);
    }
}

