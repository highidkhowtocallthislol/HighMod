package net.highskyguy.highmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.highskyguy.highmod.HighMod;
import net.highskyguy.highmod.block.custom.CornCropBlock;
import net.highskyguy.highmod.block.custom.*;
import net.highskyguy.highmod.block.custom.SoundBlock;
import net.highskyguy.highmod.block.custom.TomatoCropBlock;
import net.highskyguy.highmod.sound.ModSounds;

import net.highskyguy.highmod.block.custom.GemPolishingStationBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0F, 20.5F)
                    .mapColor(MapColor.DULL_RED)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(5.0F, 10.0F)
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .sounds(BlockSoundGroup.ANCIENT_DEBRIS)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2.0F,10.0F), UniformIntProvider.create(10, 1000)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4.0F,10.0F), UniformIntProvider.create(10, 1000)));
    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.0F,10.0F), UniformIntProvider.create(10, 1000)));
    public static final Block END_RUBY_ORE = registerBlock("end_stone_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(2.0F,10.0F), UniformIntProvider.create(10, 1000)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(ModSounds.SOUND_BLOCK_SOUNDS)));
    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock( ModBlocks.RUBY_BLOCK.getDefaultState() ,FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock( FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.STONE, 10, true));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock( PressurePlateBlock.ActivationRule.EVERYTHING ,FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.STONE));
    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block RUBY_FENCE_GATE  = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE), WoodType.OAK));
    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK));
    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.STONE), BlockSetType.OAK));
    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(HighMod.MOD_ID,"tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block CORN_CROP = Registry.register(Registries.BLOCK, new Identifier(HighMod.MOD_ID, "corn_crop"),
            new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block GEM_POLISHING_STATION = registerBlock("gem_polishing_station",
            new GemPolishingStationBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_WOOD).nonOpaque()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(HighMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(HighMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        HighMod.LOGGER.info("Registering Mod Blocks: " + HighMod.MOD_ID);
    }
}
