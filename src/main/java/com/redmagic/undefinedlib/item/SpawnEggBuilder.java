package com.redmagic.undefinedlib.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntitySnapshot;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.meta.SpawnEggMeta;

import java.util.List;

public class SpawnEggBuilder extends ItemBuilder{
    public SpawnEggBuilder() {
        super(Material.PIG_SPAWN_EGG);
    }

    public SpawnEggBuilder setSpawnedEntity(EntitySnapshot entity){
        SpawnEggMeta meta = (SpawnEggMeta) stack.getItemMeta();
        meta.setSpawnedEntity(entity);
        stack.setItemMeta(meta);
        return this;
    }

    public SpawnEggBuilder setSpawnType(EntityType entityType){
        SpawnEggMeta meta = (SpawnEggMeta) stack.getItemMeta();
        meta.setSpawnedType(entityType);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public SpawnEggBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public SpawnEggBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public SpawnEggBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public SpawnEggBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public SpawnEggBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public SpawnEggBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public SpawnEggBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public SpawnEggBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public SpawnEggBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
