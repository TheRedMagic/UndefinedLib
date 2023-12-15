package com.redmagic.undefinedlib.item;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.List;

public class BannerBuilder extends ItemBuilder{
    public BannerBuilder() {
        super(Material.WHITE_BANNER);
    }


    public BannerBuilder addPattern(Pattern pattern){
        BannerMeta meta = (BannerMeta) stack.getItemMeta();
        meta.addPattern(pattern);
        stack.setItemMeta(meta);
        return this;
    }

    public BannerBuilder setPattern(List<Pattern> patterns){
        BannerMeta meta = (BannerMeta) stack.getItemMeta();
        meta.setPatterns(patterns);
        stack.setItemMeta(meta);
        return this;
    }

    public BannerBuilder setBaseColor(DyeColor color){
        BannerMeta meta = (BannerMeta) stack.getItemMeta();
        meta.setBaseColor(color);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public BannerBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public BannerBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public BannerBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public BannerBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public BannerBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public BannerBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public BannerBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public BannerBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public BannerBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
