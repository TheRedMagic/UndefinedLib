package com.redmagic.undefinedlib.entity;

import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

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
