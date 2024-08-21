package net.highskyguy.highmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.highskyguy.highmod.item.ModItems;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerVillagerTrades(){
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,1,
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.TOMATO,16),
                    100000000, 5, 0.05f
            ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.CORN,20),
                            100000000, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 100),
                            new ItemStack(ModItems.TOMATO_SEEDS,64),
                            100000000, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.CORN_SEEDS,64),
                            100000000, 5, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 26),
                            new ItemStack(ModItems.RUBY_SWORD,1),
                            100000000, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.RUBY_PICKAXE,1),
                            100000000, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.FORTUNE, 255)),
                            3, 12, 0.075f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS, 255)),
                            3, 3567, 0.075f));

                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            10000000, 12, 0.0000001f));

                });
    }
}
