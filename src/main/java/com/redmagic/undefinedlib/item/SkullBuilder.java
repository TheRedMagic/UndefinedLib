package com.redmagic.undefinedlib.item;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerProfile;

import java.util.List;
import java.util.UUID;

public class SkullBuilder extends ItemBuilder{
    public SkullBuilder() {
        super(Material.PLAYER_HEAD);
    }

    @Deprecated
    public SkullBuilder setOwner(String owner){
        SkullMeta meta = (SkullMeta) stack.getItemMeta();
        meta.setOwner(owner);
        stack.setItemMeta(meta);
        return this;
    }

    public SkullBuilder setOwner(UUID uuid){
        SkullMeta meta = (SkullMeta) stack.getItemMeta();
        meta.setOwningPlayer(Bukkit.getOfflinePlayer(uuid));
        stack.setItemMeta(meta);
        return this;
    }

    public SkullBuilder setOwner(PlayerProfile profile){
        SkullMeta meta = (SkullMeta) stack.getItemMeta();
        meta.setOwnerProfile(profile);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public SkullBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public SkullBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public SkullBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public SkullBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public SkullBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public SkullBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public SkullBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public SkullBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public SkullBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
