package com.redmagic.undefinedlib.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.List;

public class MobBuilder extends DamageableEntityBuilder{
    public MobBuilder(EntityType entityType) {
        super(entityType);
        if (!entityType.getEntityClass().isAssignableFrom(Mob.class)){
            throw new RuntimeException("Entity : " + entityType.getName() +" is not a mob.");
        }
    }

    public MobBuilder setAware(boolean aware){
        this.aware = aware;
        return this;
    }

    public MobBuilder setTarget(LivingEntity livingEntity){
        this.target = livingEntity;
        return this;
    }


    @Override
    public MobBuilder addPotionEffect(PotionEffect effect) {
        super.addPotionEffect(effect);
        return this;
    }

    @Override
    public MobBuilder addPotionEffect(PotionEffectType type, int ticks, int amp) {
        super.addPotionEffect(type, ticks, amp);
        return this;
    }

    @Override
    public MobBuilder setPotionEffects(Collection<PotionEffect> effects) {
        super.setPotionEffects(effects);
        return this;
    }

    @Override
    public MobBuilder setAi(boolean ai) {
        super.setAi(ai);
        return this;
    }

    @Override
    public MobBuilder canPickUpItems(boolean pickItems) {
        super.canPickUpItems(pickItems);
        return this;
    }

    @Override
    public MobBuilder setCollectable(boolean collectable) {
        super.setCollectable(collectable);
        return this;
    }

    @Override
    public MobBuilder setGliding(boolean gliding) {
        super.setGliding(gliding);
        return this;
    }

    @Override
    public MobBuilder setInvisible(boolean invisible) {
        super.setInvisible(invisible);
        return this;
    }

    @Override
    public MobBuilder setLeashHolder(Entity entity) {
        super.setLeashHolder(entity);
        return this;
    }

    @Override
    public MobBuilder setSwimming(boolean swimming) {
        super.setSwimming(swimming);
        return this;
    }

    @Override
    public MobBuilder setAbsorptionAmount(double amount) {
        super.setAbsorptionAmount(amount);
        return this;
    }

    @Override
    public MobBuilder setHealth(double amount) {
        super.setHealth(amount);
        return this;
    }

    @Override
    public MobBuilder setMaxHeath(double amount) {
        super.setMaxHeath(amount);
        return this;
    }

    @Override
    public MobBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public MobBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public MobBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public MobBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public MobBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public MobBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public MobBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public MobBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public MobBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public MobBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public MobBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public MobBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public MobBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public MobBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public MobBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public MobBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
