package com.redmagic.undefinedlib.entity;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Display;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Transformation;

import java.util.List;

public class ItemDisplayBuilder extends DisplayEntityBuilder{
    public ItemDisplayBuilder() {
        super(EntityType.ITEM_DISPLAY);
    }

    public ItemDisplayBuilder setItem(ItemStack stack){
        itemStack = stack;
        return this;
    }
    public ItemDisplayBuilder setItem(Material material){
        itemStack = new ItemStack(material);
        return this;
    }

    public ItemDisplayBuilder setItemDisplayTransform(ItemDisplay.ItemDisplayTransform transform){
        itemDisplayTransform = transform;
        return this;
    }


    @Override @Deprecated
    public ItemDisplayBuilder setBillboard(Display.Billboard billboard) {
        super.setBillboard(billboard);
        return this;
    }

    @Override
    public ItemDisplayBuilder setBrightness(Display.Brightness brightness) {
        super.setBrightness(brightness);
        return this;
    }

    @Override
    public ItemDisplayBuilder setHeight(float height) {
        super.setHeight(height);
        return this;
    }

    @Override
    public ItemDisplayBuilder setWidth(float width) {
        super.setWidth(width);
        return this;
    }

    @Override
    public ItemDisplayBuilder setGlowColor(Color color) {
        super.setGlowColor(color);
        return this;
    }

    @Override
    public ItemDisplayBuilder setShadowRadius(float shadowRadius) {
        super.setShadowRadius(shadowRadius);
        return this;
    }

    @Override
    public ItemDisplayBuilder setShadowStrength(float shadowStrength) {
        super.setShadowStrength(shadowStrength);
        return this;
    }

    @Override @Deprecated
    public ItemDisplayBuilder setTransformation(Transformation transformation) {
        super.setTransformation(transformation);
        return this;
    }

    @Override
    public ItemDisplayBuilder setViewRange(float viewRange) {
        super.setViewRange(viewRange);
        return this;
    }

    @Override
    public ItemDisplayBuilder setScale(double scale) {
        super.setScale(scale);
        return this;
    }

    @Override
    public ItemDisplayBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public ItemDisplayBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public ItemDisplayBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public ItemDisplayBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public ItemDisplayBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public ItemDisplayBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public ItemDisplayBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public ItemDisplayBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public ItemDisplayBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public ItemDisplayBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public ItemDisplayBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public ItemDisplayBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public ItemDisplayBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public ItemDisplayBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public ItemDisplayBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public ItemDisplayBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
