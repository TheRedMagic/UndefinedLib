package com.redmagic.undefinedlib.entity;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Display;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.util.Transformation;

import java.util.List;

public class BlockDisplayBuilder extends DisplayEntityBuilder{
    public BlockDisplayBuilder() {
        super(EntityType.BLOCK_DISPLAY);
    }

    public BlockDisplayBuilder setBlock(BlockData blockData){
        this.blockData = blockData;
        return this;
    }
    public BlockDisplayBuilder setBlock(Material material){
        this.blockData = material.createBlockData();
        return this;
    }

    @Override
    public BlockDisplayBuilder setBillboard(Display.Billboard billboard) {
        super.setBillboard(billboard);
        return this;
    }

    @Override
    public BlockDisplayBuilder setBrightness(Display.Brightness brightness) {
        super.setBrightness(brightness);
        return this;
    }

    @Override
    public BlockDisplayBuilder setHeight(float height) {
        super.setHeight(height);
        return this;
    }

    @Override
    public BlockDisplayBuilder setWidth(float width) {
        super.setWidth(width);
        return this;
    }

    @Override
    public BlockDisplayBuilder setGlowColor(Color color) {
        super.setGlowColor(color);
        return this;
    }

    @Override
    public BlockDisplayBuilder setShadowRadius(float shadowRadius) {
        super.setShadowRadius(shadowRadius);
        return this;
    }

    @Override
    public BlockDisplayBuilder setShadowStrength(float shadowStrength) {
        super.setShadowStrength(shadowStrength);
        return this;
    }

    @Override @Deprecated
    public BlockDisplayBuilder setTransformation(Transformation transformation) {
        super.setTransformation(transformation);
        return this;
    }

    @Override
    public BlockDisplayBuilder setViewRange(float viewRange) {
        super.setViewRange(viewRange);
        return this;
    }

    @Override
    public BlockDisplayBuilder setScale(double scale) {
        super.setScale(scale);
        return this;
    }

    @Override
    public BlockDisplayBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public BlockDisplayBuilder addScoreboardTag(String tag) {
        super.addScoreboardTag(tag);
        return this;
    }

    @Override
    public BlockDisplayBuilder setScoreboardTags(List<String> tags) {
        super.setScoreboardTags(tags);
        return this;
    }

    @Override
    public BlockDisplayBuilder setPassenger(Entity entity) {
        super.setPassenger(entity);
        return this;
    }

    @Override
    public BlockDisplayBuilder setShowCustomName(boolean showCustomName) {
        super.setShowCustomName(showCustomName);
        return this;
    }

    @Override
    public BlockDisplayBuilder setGlowing(boolean glowing) {
        super.setGlowing(glowing);
        return this;
    }

    @Override
    public BlockDisplayBuilder setGravity(boolean gravity) {
        super.setGravity(gravity);
        return this;
    }

    @Override
    public BlockDisplayBuilder setFallDistance(float distance) {
        super.setFallDistance(distance);
        return this;
    }

    @Override
    public BlockDisplayBuilder setFireTicks(int ticks) {
        super.setFireTicks(ticks);
        return this;
    }

    @Override
    public BlockDisplayBuilder setFreezeTicks(int ticks) {
        super.setFreezeTicks(ticks);
        return this;
    }

    @Override
    public BlockDisplayBuilder setInvulnerable(boolean invulnerable) {
        super.setInvulnerable(invulnerable);
        return this;
    }

    @Override
    public BlockDisplayBuilder setPortalCooldown(int cooldown) {
        super.setPortalCooldown(cooldown);
        return this;
    }

    @Override
    public BlockDisplayBuilder setPersistent(boolean persistent) {
        super.setPersistent(persistent);
        return this;
    }

    @Override
    public BlockDisplayBuilder setRotation(float yaw, float pitch) {
        super.setRotation(yaw, pitch);
        return this;
    }

    @Override
    public BlockDisplayBuilder setSilent(boolean silent) {
        super.setSilent(silent);
        return this;
    }

    @Override
    public BlockDisplayBuilder setVisibleByDefault(boolean visibleByDefault) {
        super.setVisibleByDefault(visibleByDefault);
        return this;
    }
}
