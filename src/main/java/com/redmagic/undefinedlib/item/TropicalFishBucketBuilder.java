package com.redmagic.undefinedlib.item;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.TropicalFish;
import org.bukkit.inventory.meta.TropicalFishBucketMeta;

import java.util.List;

public class TropicalFishBucketBuilder extends ItemBuilder{
    public TropicalFishBucketBuilder() {
        super(Material.TROPICAL_FISH_BUCKET);
    }

    public TropicalFishBucketBuilder setBodyColor(DyeColor color){
        TropicalFishBucketMeta meta = (TropicalFishBucketMeta) stack.getItemMeta();
        meta.setBodyColor(color);
        stack.setItemMeta(meta);
        return this;
    }
    public TropicalFishBucketBuilder setPattern(TropicalFish.Pattern pattern){
        TropicalFishBucketMeta meta = (TropicalFishBucketMeta) stack.getItemMeta();
        meta.setPattern(pattern);
        stack.setItemMeta(meta);
        return this;
    }

    public TropicalFishBucketBuilder setPatternColor(DyeColor color){
        TropicalFishBucketMeta meta = (TropicalFishBucketMeta) stack.getItemMeta();
        meta.setPatternColor(color);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public TropicalFishBucketBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
