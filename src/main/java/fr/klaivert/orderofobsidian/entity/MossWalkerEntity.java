package fr.klaivert.orderofobsidian.entity;


import fr.klaivert.orderofobsidian.init.OrderOfObsidianModSounds;
import fr.klaivert.orderofobsidian.init.OrderofobsidianModEntities;
import fr.klaivert.orderofobsidian.init.OrderofobsidianModItems;
import net.minecraft.core.BlockPos;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;

import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.crafting.Ingredient;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;


import javax.annotation.Nullable;
import java.util.Objects;

public class MossWalkerEntity extends Animal {
     public MossWalkerEntity(EntityType<? extends Animal> type, Level level) {
        super(type, level);
         xpReward = 0;
         setNoAi(false);
    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.ATTACK_DAMAGE, 0.0f)
                .add(Attributes.ATTACK_SPEED, 0.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.3f)
                .add(Attributes.FOLLOW_RANGE, 100D)
                .build();
    }

        protected void registerGoals() {
        this.goalSelector.addGoal(0, new PanicGoal(this, 0.8D));
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(5, new RandomStrollGoal(this, 0.5D));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 0.7D));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 0.9D));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(2, new BreedGoal(this, 0.6D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 0.7D, Ingredient.of(OrderofobsidianModItems.MOSS_WHEAT.get()), false));
        }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob p_146744_) {
        return OrderofobsidianModEntities.MOSS_WALKER.get().create(serverLevel);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return Objects.equals(OrderofobsidianModItems.MOSS_WHEAT.get(), stack.getItem());
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.SAND_STEP, 0.15F, 1.0F);
    }
    protected SoundEvent getAmbientSound() {
        return OrderOfObsidianModSounds.MossWalkerIdle.get();
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return OrderOfObsidianModSounds.MossWalkerHurt.get();
    }

    protected SoundEvent getDeathSound() {
        return OrderOfObsidianModSounds.MossWalkerDeath.get();
    }

    protected float getSoundVolume() {
        return 5F;
    }
}