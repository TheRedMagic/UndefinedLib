package com.redmagic.undefinedlib.item;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.CompassMeta;

import java.util.List;

public class CompassBuilder extends ItemBuilder{
    public CompassBuilder() {
        super(Material.COMPASS);
    }

    public CompassBuilder setLodstone(Location lodstone){
        CompassMeta meta = (CompassMeta) stack.getItemMeta();
        meta.setLodestone(lodstone);
        stack.setItemMeta(meta);
        return this;
    }

    public CompassBuilder setLodstoneTracked(boolean tracked){
        CompassMeta meta = (CompassMeta) stack.getItemMeta();
        meta.setLodestoneTracked(tracked);
        stack.setItemMeta(meta);
        return this;
    }


    @Override
    public CompassBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public CompassBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public CompassBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public CompassBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public CompassBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public CompassBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public CompassBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public CompassBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public CompassBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
