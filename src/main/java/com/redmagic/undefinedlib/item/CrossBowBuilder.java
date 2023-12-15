package com.redmagic.undefinedlib.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.CrossbowMeta;

import java.util.List;

public class CrossBowBuilder extends ItemBuilder{
    public CrossBowBuilder() {
        super(Material.CROSSBOW);
    }


    public CrossBowBuilder addChargedProjectile(ItemStack stack){
        CrossbowMeta meta = (CrossbowMeta) stack.getItemMeta();
        meta.addChargedProjectile(stack);
        stack.setItemMeta(meta);
        return this;
    }

    public CrossBowBuilder setChargedProjectiles(List<ItemStack> stacks){
        CrossbowMeta meta = (CrossbowMeta) stack.getItemMeta();
        meta.setChargedProjectiles(stacks);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public CrossBowBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public CrossBowBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public CrossBowBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public CrossBowBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public CrossBowBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public CrossBowBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public CrossBowBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public CrossBowBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public CrossBowBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
