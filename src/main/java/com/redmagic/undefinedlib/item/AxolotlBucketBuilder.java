package com.redmagic.undefinedlib.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Axolotl;
import org.bukkit.inventory.meta.AxolotlBucketMeta;

import java.util.List;

public class AxolotlBucketBuilder extends ItemBuilder{
    public AxolotlBucketBuilder() {
        super(Material.AXOLOTL_BUCKET);
    }


    public AxolotlBucketBuilder setVariant(Axolotl.Variant variant){
        AxolotlBucketMeta meta = (AxolotlBucketMeta) stack.getItemMeta();
        meta.setVariant(variant);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public AxolotlBucketBuilder setName(String name) {
        super.setName(name);
        return this;
    }


    @Override
    public AxolotlBucketBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public AxolotlBucketBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public AxolotlBucketBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public AxolotlBucketBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public AxolotlBucketBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public AxolotlBucketBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public AxolotlBucketBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public AxolotlBucketBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
