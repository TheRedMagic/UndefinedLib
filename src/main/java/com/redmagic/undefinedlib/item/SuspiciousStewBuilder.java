package com.redmagic.undefinedlib.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.SuspiciousStewMeta;
import org.bukkit.potion.PotionEffect;

import java.util.List;

public class SuspiciousStewBuilder extends ItemBuilder{
    public SuspiciousStewBuilder() {
        super(Material.SUSPICIOUS_STEW);
    }

    public SuspiciousStewBuilder addCustomEffect(PotionEffect effect, boolean overwrite){
        SuspiciousStewMeta meta = (SuspiciousStewMeta) stack.getItemMeta();
        meta.addCustomEffect(effect, overwrite);
        stack.setItemMeta(meta);
        return this;
    }
    public SuspiciousStewBuilder addCustomEffect(PotionEffect effect){
        SuspiciousStewMeta meta = (SuspiciousStewMeta) stack.getItemMeta();
        meta.addCustomEffect(effect, true);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public SuspiciousStewBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public SuspiciousStewBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
