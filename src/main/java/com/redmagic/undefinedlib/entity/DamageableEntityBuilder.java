package com.redmagic.undefinedlib.entity;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.List;

public class DamageableEntityBuilder extends LivingEntityBuilder{
    public DamageableEntityBuilder(EntityType entityType) {
        super(entityType);
        if (!entityType.getEntityClass().isAssignableFrom(Damageable.class)) {
            throw new RuntimeException("Entity : " + entityType.getName() + " is not damageable");
        }
    }

    public DamageableEntityBuilder setAbsorptionAmount(double amount){
        this.absorptionAmount = amount;
        return this;
    }

    public DamageableEntityBuilder setHealth(double amount){
        this.health = amount;
        return this;
    }

    public DamageableEntityBuilder setMaxHeath(double amount){
        this.maxHealth = amount;
        return this;
    }

    @Override
    public DamageableEntityBuilder addPotionEffect(PotionEffect effect) {
        super.addPotionEffect(effect);
        return this;
    }

    @Override
    public DamageableEntityBuilder addPotionEffect(PotionEffectType type, int ticks, int amp) {
        super.addPotionEffect(type, ticks, amp);
        return this;
    }

    @Override
    public LivingEntityBuilder setPotionEffects(Collection<PotionEffect> effects) {
        super.setPotionEffects(effects);
        return this;
    }

    @Override
    public LivingEntityBuilder setAi(boolean ai) {
        return super.setAi(ai);
    }

    @Override
    public LivingEntityBuilder canPickUpItems(boolean pickItems) {
        return super.canPickUpItems(pickItems);
    }

    @Override
    public LivingEntityBuilder setCollectable(boolean collectable) {
        return super.setCollectable(collectable);
    }

    @Override
    public LivingEntityBuilder setGliding(boolean gliding) {
        return super.setGliding(gliding);
    }

    @Override
    public LivingEntityBuilder setInvisible(boolean invisible) {
        return super.setInvisible(invisible);
    }

    @Override
    public LivingEntityBuilder setLeashHolder(Entity entity) {
        return super.setLeashHolder(entity);
    }

    @Override
    public LivingEntityBuilder setSwimming(boolean swimming) {
        return super.setSwimming(swimming);
    }

    @Override
    public DamageableEntityBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public DamageableEntityBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public DamageableEntityBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public DamageableEntityBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public DamageableEntityBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public DamageableEntityBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public DamageableEntityBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public DamageableEntityBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public DamageableEntityBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public DamageableEntityBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public DamageableEntityBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public DamageableEntityBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public DamageableEntityBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public DamageableEntityBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public DamageableEntityBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public DamageableEntityBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
