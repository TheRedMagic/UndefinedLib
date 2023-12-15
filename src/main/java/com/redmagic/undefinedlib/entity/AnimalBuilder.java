package com.redmagic.undefinedlib.entity;

import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import java.util.List;
import java.util.UUID;

public class AnimalBuilder extends AgeableEntityBuilder{

    public AnimalBuilder(EntityType entityType) {
        super(entityType);
        if (!entityType.getEntityClass().isAssignableFrom(Animals.class)){
            throw new RuntimeException("Entity : " + entityType.getName() + " is not a animal");
        }
    }

    public AnimalBuilder setBreedCause(UUID uuid){
        cause = uuid;
        return this;
    }

    public AnimalBuilder setLoveModeTicks(int ticks){
        loveModeTicks = ticks;
        return this;
    }

    @Override
    public AnimalBuilder setAbsorptionAmount(double amount) {
        super.setAbsorptionAmount(amount);
        return this;
    }

    @Override
    public AnimalBuilder setHealth(double amount) {
        super.setHealth(amount);
        return this;
    }

    @Override
    public AnimalBuilder setMaxHeath(double amount) {
        super.setMaxHeath(amount);
        return this;
    }

    @Override
    public AnimalBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public AnimalBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public AnimalBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public AnimalBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public AnimalBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public AnimalBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public AnimalBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public AnimalBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public AnimalBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public AnimalBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public AnimalBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public AnimalBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public AnimalBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public AnimalBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public AnimalBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public AnimalBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
