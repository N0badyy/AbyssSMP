package net.eclipse.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.render.item.ItemRenderer;


import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;




@Debug(export = true)
@Environment(EnvType.CLIENT)
@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    
    // private static final Set<ItemStack> loggedStacks = new HashSet<>();
    // private static final boolean DEBUG_MODE = false;
    // @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    // public BakedModel useLightsaberModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
    //     if (stack.isOf(ModItems.SCYTHE_ITEM) && renderMode != ModelTransformationMode.GUI) {
    //         if(DEBUG_MODE){
    //         if (!loggedStacks.contains(stack)) {
    //             System.out.println("Using scythe_3d model for: " + stack);
    //             System.out.println("Model Identifier: " + ModelIdentifier.ofInventoryVariant(Identifier.of(LifestealCombat.MOD_ID, "scythe_in_hand")));
    //             System.out.println("Model Manager: " + ((ItemRendererAccessor) this).mccourse$getModels().getModelManager());

    //             loggedStacks.add(stack);
    //         }}
    //         return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(Identifier.of(LifestealCombat.MOD_ID), "scythe_in_hand#inventory"));
    //     }
    //     return value;
    // }
}
