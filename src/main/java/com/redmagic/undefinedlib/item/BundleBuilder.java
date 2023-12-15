package com.redmagic.undefinedlib.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BundleMeta;

import java.util.List;

public class BundleBuilder extends ItemBuilder{
    public BundleBuilder() {
        super(Material.BUNDLE);
    }

    public BundleBuilder addItem(ItemStack stack){
        BundleMeta meta = (BundleMeta) stack.getItemMeta();
        meta.addItem(stack);
        stack.setItemMeta(meta);
        return this;
    }

    public BundleBuilder setItems(List<ItemStack> items){
        BundleMeta meta = (BundleMeta) stack.getItemMeta();
        meta.setItems(items);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public BundleBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public BundleBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public BundleBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public BundleBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public BundleBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public BundleBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public BundleBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public BundleBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public BundleBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
