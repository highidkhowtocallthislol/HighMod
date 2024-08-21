package net.highskyguy.highmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(10).saturationModifier(100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 999999999, 100000),100f)
            .meat()
            .build() ;
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(10).saturationModifier(100f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 99999, 100000),100f)
            .meat()
            .build() ;

}
