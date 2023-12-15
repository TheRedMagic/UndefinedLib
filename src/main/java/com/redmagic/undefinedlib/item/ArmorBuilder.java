package com.redmagic.undefinedlib.item;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ArmorMeta;
import org.bukkit.inventory.meta.trim.ArmorTrim;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

import java.util.List;

public class ArmorBuilder extends ItemBuilder{

    public ArmorBuilder(ArmorMaterial armorMaterial) {
        super(armorMaterial.getMaterial());
    }

    public ArmorBuilder setTrim(ArmorTrim trim){
        ArmorMeta meta = (ArmorMeta) stack.getItemMeta();
        meta.setTrim(trim);
        stack.setItemMeta(meta);
        return this;
    }

    public ArmorBuilder setTrim(TrimMaterial trimMaterial, TrimPattern trimPattern){
        ArmorMeta meta = (ArmorMeta) stack.getItemMeta();
        meta.setTrim(new ArmorTrim(trimMaterial, trimPattern));
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public ArmorBuilder setName(String name) {
        super.setName(name);
        return this;
    }


    @Override
    public ArmorBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public ArmorBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public ArmorBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public ArmorBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public ArmorBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public ArmorBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public ArmorBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public ArmorBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }

    public enum ArmorMaterial {
        IRON_CHESTPLATE(Material.IRON_CHESTPLATE),
        IRON_BOOTS(Material.IRON_BOOTS),
        IRON_HELMET(Material.IRON_HELMET),
        IRON_LEGGINGS(Material.IRON_LEGGINGS),
        LEATHER_CHESTPLATE(Material.LEATHER_CHESTPLATE),
        LEATHER_BOOTS(Material.LEATHER_BOOTS),
        LEATHER_HELMET(Material.LEATHER_HELMET),
        LEATHER_LEGGINGS(Material.LEATHER_LEGGINGS),
        GOLDEN_CHESTPLATE(Material.GOLDEN_CHESTPLATE),
        GOLDEN_BOOTS(Material.GOLDEN_BOOTS),
        GOLDEN_HELMET(Material.GOLDEN_HELMET),
        GOLDEN_LEGGINGS(Material.GOLDEN_LEGGINGS),
        DIAMOND_CHESTPLATE(Material.DIAMOND_CHESTPLATE),
        DIAMOND_BOOTS(Material.DIAMOND_BOOTS),
        DIAMOND_HELMET(Material.DIAMOND_HELMET),
        DIAMOND_LEGGINGS(Material.DIAMOND_LEGGINGS),
        CHAINMAIL_CHESTPLATE(Material.CHAINMAIL_CHESTPLATE),
        CHAINMAIL_BOOTS(Material.CHAINMAIL_BOOTS),
        CHAINMAIL_HELMET(Material.CHAINMAIL_HELMET),
        CHAINMAIL_LEGGINGS(Material.CHAINMAIL_LEGGINGS),
        NETHERITE_CHESTPLATE(Material.NETHERITE_CHESTPLATE),
        NETHERITE_BOOTS(Material.NETHERITE_BOOTS),
        NETHERITE_LEGGINGS(Material.NETHERITE_LEGGINGS),
        NETHERITE_HELMET(Material.NETHERITE_HELMET);

        @Getter
        Material material;

        ArmorMaterial(Material material){
            this.material = material;
        }

    }
}
