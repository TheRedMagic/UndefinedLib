package com.redmagic.undefinedlib.item;

import lombok.Getter;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.trim.ArmorTrim;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

import java.util.List;

public class LeatherArmorBuilder extends ArmorBuilder{
    public LeatherArmorBuilder(LeatherArmorMaterial leatherArmorMaterial) {
        super(ArmorMaterial.valueOf(leatherArmorMaterial.getMaterial().name()));
    }

    public LeatherArmorBuilder setColor(Color color){
        LeatherArmorMeta meta = (LeatherArmorMeta) stack.getItemMeta();
        meta.setColor(color);
        stack.setItemMeta(meta);
        return this;
    }

    public LeatherArmorBuilder setColor(int b, int g, int r){
        LeatherArmorMeta meta = (LeatherArmorMeta) stack.getItemMeta();
        meta.setColor(Color.fromBGR(b, r, g));
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public LeatherArmorBuilder setTrim(ArmorTrim trim) {
        super.setTrim(trim);
        return this;
    }

    @Override
    public LeatherArmorBuilder setTrim(TrimMaterial trimMaterial, TrimPattern trimPattern) {
        super.setTrim(trimMaterial, trimPattern);
        return this;
    }

    @Override
    public LeatherArmorBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public LeatherArmorBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public LeatherArmorBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public LeatherArmorBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public LeatherArmorBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public LeatherArmorBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public LeatherArmorBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public LeatherArmorBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public LeatherArmorBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }

    public enum LeatherArmorMaterial{

        CHESTPLATE(Material.LEATHER_CHESTPLATE),
        HELMET(Material.LEATHER_HELMET),
        BOOTS(Material.LEATHER_BOOTS),
        LEGGINGS(Material.LEATHER_LEGGINGS);

        @Getter
        Material material;

        LeatherArmorMaterial(Material material){
            this.material = material;
        }

    }
}
