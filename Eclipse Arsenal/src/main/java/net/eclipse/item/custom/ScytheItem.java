package net.eclipse.item.custom;

import java.util.List;


import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.component.type.ToolComponent.Rule;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier.Operation;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ScytheItem extends ToolItem {
   public ScytheItem(ToolMaterial toolMaterial, Item.Settings settings) {
      super(toolMaterial, settings.component(DataComponentTypes.TOOL, createToolComponent()));
   }
   
   
   private static final Identifier BASE_ATTACK_REACH_MODIFIER_ID = Identifier.ofVanilla("entity_interaction_range");
   private static final Identifier BLOCK_INTERACTION_MODIFIER_ID = Identifier.ofVanilla("block_interaction_range");
   private static ToolComponent createToolComponent() {
      return new ToolComponent(List.of(
         Rule.ofAlwaysDropping(List.of(Blocks.COBWEB), 15.0F),
         Rule.of(BlockTags.SWORD_EFFICIENT, 1.5F)
      ), 1.0F, 2);
   }

   public static AttributeModifiersComponent createAttributeModifiers(ToolMaterial material, int baseAttackDamage, float attackSpeed, float attackReach, float blockreach) {
      return AttributeModifiersComponent.builder()
         .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, (double)((float)baseAttackDamage + material.getAttackDamage()), Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
         .add(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(BASE_ATTACK_SPEED_MODIFIER_ID, (double)attackSpeed, Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
         .add(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, new EntityAttributeModifier(BASE_ATTACK_REACH_MODIFIER_ID, (double)attackReach, Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
         .add(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE, new EntityAttributeModifier(BLOCK_INTERACTION_MODIFIER_ID, (double)blockreach, Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
         .build();
   }

   @Override
   public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
      return !miner.isCreative();
   }

   @Override
   public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
      return true;
   }

   @Override
   public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
      stack.damage(1, attacker, EquipmentSlot.MAINHAND);
   }

   @Override
   public boolean isEnchantable(ItemStack stack) {
      return true;
   }

   @Override
   public int getEnchantability() {
      return 15; // Similar to swords
   }
   
   
}
