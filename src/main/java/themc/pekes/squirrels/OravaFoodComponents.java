package themc.pekes.squirrels;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class OravaFoodComponents {
    
    public static final FoodComponent PAISTETTU_ORAVA = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.6F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,600, 0), 0.2F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,600, 2), 0.4F).snack().build();
    

}
