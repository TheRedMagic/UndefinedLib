package com.redmagic.undefinedlib.entity;

import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.List;

public class AgeableEntityBuilder extends MobBuilder {
    public AgeableEntityBuilder(EntityType entityType) {
        super(entityType);
        if (!entityType.getEntityClass().isAssignableFrom(Ageable.class)){
            throw new RuntimeException("Entity : " + entityType.getName() + " is not ageable");
        }
    }

    public AgeableEntityBuilder setAdult(boolean adult){
        this.adult = adult;
        return this;
    }

    public AgeableEntityBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public AgeableEntityBuilder setBreed(boolean breed){
        this.breed = breed;
        return this;
    }

    @Override
    public AgeableEntityBuilder addPotionEffect(PotionEffect effect) {
        super.addPotionEffect(effect);
        return this;
    }

    @Override
    public AgeableEntityBuilder addPotionEffect(PotionEffectType type, int ticks, int amp) {
        super.addPotionEffect(type, ticks, amp);
        return this;
    }

    @Override
    public AgeableEntityBuilder setPotionEffects(Collection<PotionEffect> effects) {
        super.setPotionEffects(effects);
        return this;
    }

    @Override
    public AgeableEntityBuilder setAi(boolean ai) {
        super.setAi(ai);
        return this;
    }

    @Override
    public AgeableEntityBuilder canPickUpItems(boolean pickItems) {
        super.canPickUpItems(pickItems);
        return this;
    }

    @Override
    public AgeableEntityBuilder setCollectable(boolean collectable) {
        super.setCollectable(collectable);
        return this;
    }

    @Override
    public AgeableEntityBuilder setGliding(boolean gliding) {
        super.setGliding(gliding);
        return this;
    }

    @Override
    public AgeableEntityBuilder setInvisible(boolean invisible) {
        super.setInvisible(invisible);
        return this;
    }

    @Override
    public AgeableEntityBuilder setLeashHolder(Entity entity) {
        super.setLeashHolder(entity);
        return this;
    }

    @Override
    public AgeableEntityBuilder setSwimming(boolean swimming) {
        super.setSwimming(swimming);
        return this;
    }

    @Override
    public AgeableEntityBuilder setAbsorptionAmount(double amount) {
        super.setAbsorptionAmount(amount);
        return this;
    }

    @Override
    public AgeableEntityBuilder setHealth(double amount) {
        super.setHealth(amount);
        return this;
    }

    @Override
    public AgeableEntityBuilder setMaxHeath(double amount) {
        super.setMaxHeath(amount);
        return this;
    }

    @Override
    public AgeableEntityBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public AgeableEntityBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public AgeableEntityBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public AgeableEntityBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public AgeableEntityBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public AgeableEntityBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public AgeableEntityBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public AgeableEntityBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public AgeableEntityBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public AgeableEntityBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public AgeableEntityBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public AgeableEntityBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public AgeableEntityBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public AgeableEntityBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public AgeableEntityBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public AgeableEntityBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
