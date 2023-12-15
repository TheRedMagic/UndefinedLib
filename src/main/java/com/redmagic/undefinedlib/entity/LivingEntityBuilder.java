package com.redmagic.undefinedlib.entity;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.List;

public class LivingEntityBuilder extends EntityBuilder{

    public LivingEntityBuilder(EntityType entityType) {
        super(entityType);
        if (!entityType.getEntityClass().isAssignableFrom(LivingEntity.class)){
            throw new RuntimeException("Entity : " + entityType.getName() + " is not a living entity");
        }
    }

    public LivingEntityBuilder addPotionEffect(PotionEffect effect){
        potionEffects.add(effect);
        return this;
    }

    public LivingEntityBuilder addPotionEffect(PotionEffectType type, int ticks, int amp){
        potionEffects.add(new PotionEffect(type, ticks, amp));
        return this;
    }
    public LivingEntityBuilder setPotionEffects(Collection<PotionEffect> effects){
        potionEffects = effects;
        return this;
    }

    public LivingEntityBuilder setAi(boolean ai){
        this.ai = ai;
        return this;
    }
    public LivingEntityBuilder canPickUpItems(boolean pickItems){
        canPickUpItems = pickItems;
        return this;
    }
    public LivingEntityBuilder setCollectable(boolean collectable){
        this.isCollectable = collectable;
        return this;
    }
    public LivingEntityBuilder setGliding(boolean gliding){
        isGliding = gliding;
        return this;
    }
    public LivingEntityBuilder setInvisible(boolean invisible){
        isInvisible = invisible;
        return this;
    }

    public LivingEntityBuilder setLeashHolder(Entity entity){
        setLeashHolder = entity;
        return this;
    }

    public LivingEntityBuilder setSwimming(boolean swimming){
        isSwimming = swimming;
        return this;
    }

    @Override
    public LivingEntityBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public LivingEntityBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public LivingEntityBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public LivingEntityBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public LivingEntityBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public LivingEntityBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public LivingEntityBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public LivingEntityBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public LivingEntityBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public LivingEntityBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public LivingEntityBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public LivingEntityBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public LivingEntityBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public LivingEntityBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public LivingEntityBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public LivingEntityBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
