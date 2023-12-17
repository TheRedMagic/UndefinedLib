package com.redmagic.undefinedlib.entity;

import org.bukkit.Color;
import org.bukkit.entity.Display;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.util.Transformation;

import java.util.List;

public class DisplayEntityBuilder extends EntityBuilder{
    public DisplayEntityBuilder(EntityType entityType) {
        super(entityType);
        if (!entityType.getEntityClass().isAssignableFrom(Display.class)){
            throw new RuntimeException("Entity : " + entityType.getName() + " is not a display entity");
        }
    }

    public DisplayEntityBuilder setBillboard(Display.Billboard billboard){
        this.billboard = billboard;
        return this;
    }

    public DisplayEntityBuilder setBrightness(Display.Brightness brightness){
        this.brightness = brightness;
        return this;
    }

    public DisplayEntityBuilder setHeight(float height){
        this.height = height;
        return this;
    }

    public DisplayEntityBuilder setWidth(float width){
        this.width = width;
        return this;
    }

    public DisplayEntityBuilder setGlowColor(Color color){
        this.glowColor = color;
        return this;
    }

    public DisplayEntityBuilder setShadowRadius(float shadowRadius){
        this.shadowRadius = shadowRadius;
        return this;
    }
    public DisplayEntityBuilder setShadowStrength(float shadowStrength){
        this.shadowStrength = shadowStrength;
        return this;
    }

    @Deprecated
    public DisplayEntityBuilder setTransformation(Transformation transformation){
        this.transformation = transformation;
        return this;
    }

    public DisplayEntityBuilder setViewRange(float viewRange){
        this.viewRange = viewRange;
        return this;
    }

    public DisplayEntityBuilder setScale(double scale){
        this.scale = scale;
        return this;
    }

    @Override
    public DisplayEntityBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public DisplayEntityBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public DisplayEntityBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public DisplayEntityBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public DisplayEntityBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public DisplayEntityBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public DisplayEntityBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public DisplayEntityBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public DisplayEntityBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public DisplayEntityBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public DisplayEntityBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public DisplayEntityBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public DisplayEntityBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public DisplayEntityBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public DisplayEntityBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public DisplayEntityBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
