package com.redmagic.undefinedlib.item;

import org.bukkit.Material;
import org.bukkit.MusicInstrument;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.MusicInstrumentMeta;

import java.util.List;

public class GoatHornBuilder extends ItemBuilder{
    public GoatHornBuilder() {
        super(Material.GOAT_HORN);
    }

    public GoatHornBuilder setSound(MusicInstrument instrument){
        MusicInstrumentMeta meta = (MusicInstrumentMeta) stack.getItemMeta();
        meta.setInstrument(instrument);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public GoatHornBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public GoatHornBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public GoatHornBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public GoatHornBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public GoatHornBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public GoatHornBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public GoatHornBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public GoatHornBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public GoatHornBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
