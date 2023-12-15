package com.redmagic.undefinedlib.item;

import net.md_5.bungee.api.chat.hover.content.Item;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.FireworkMeta;

import java.util.List;

public class FireworkItemBuilder extends ItemBuilder {
    public FireworkItemBuilder() {
        super(Material.FIREWORK_ROCKET);
    }

    public FireworkItemBuilder addEffect(FireworkEffect effect){
        FireworkMeta meta = (FireworkMeta) stack.getItemMeta();
        meta.addEffect(effect);
        stack.setItemMeta(meta);
        return this;
    }

    public FireworkItemBuilder addEffects(FireworkEffect... effects){
        FireworkMeta meta = (FireworkMeta) stack.getItemMeta();
        meta.addEffects(effects);
        stack.setItemMeta(meta);
        return this;
    }

    public FireworkItemBuilder addEffects(List<FireworkEffect> effects){
        FireworkMeta meta = (FireworkMeta) stack.getItemMeta();
        meta.addEffects(effects);
        stack.setItemMeta(meta);
        return this;
    }

    public FireworkItemBuilder setPower(int power){
        FireworkMeta meta = (FireworkMeta) stack.getItemMeta();
        meta.setPower(power);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public FireworkItemBuilder setName(String name) {
        super.setName(name);
        return this;
    }


    @Override
    public FireworkItemBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public FireworkItemBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public FireworkItemBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public FireworkItemBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public FireworkItemBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public FireworkItemBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public FireworkItemBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public FireworkItemBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
