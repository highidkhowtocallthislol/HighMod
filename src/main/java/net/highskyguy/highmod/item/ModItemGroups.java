package net.highskyguy.highmod.item;

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


                    }).build());
    public static final ItemGroup ILLEGAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HighMod.MOD_ID, "raw_ruby"),
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

