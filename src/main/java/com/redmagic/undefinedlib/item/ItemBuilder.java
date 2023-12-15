package com.redmagic.undefinedlib.item;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class ItemBuilder {

    protected ItemStack stack;

    public ItemBuilder(Material material){
        stack = new ItemStack(material);
    }

    public ItemBuilder(ItemStack stack){
        this.stack = stack;
    }

    public ItemBuilder setName(String name){
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(name);
        stack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(String lore){
        ItemMeta meta = stack.getItemMeta();
        meta.setLore(Collections.singletonList(lore));
        stack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setLore(List<String> lore){
        ItemMeta meta = stack.getItemMeta();
        meta.setLore(lore);
        stack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setCustomModelData(int customModelData){
        ItemMeta meta = stack.getItemMeta();
        meta.setCustomModelData(customModelData);
        stack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable){
        ItemMeta meta = stack.getItemMeta();
        meta.setUnbreakable(unbreakable);
        stack.setItemMeta(meta);
        return this;
    }



    public ItemBuilder setAmount(int amount){
        stack.setAmount(amount);
        return this;
    }

    public ItemBuilder setLocalizedName(String locName){
        ItemMeta meta = stack.getItemMeta();
        meta.setLocalizedName(locName);
        stack.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setDurability(short durability){
        stack.setDurability(durability);
        return this;
    }

    public ItemBuilder addEnchantment(Enchantment enchantment, int level){
        stack.addEnchantment(enchantment, level);
        return this;
    }

    public ItemStack build() {return stack;}


}
