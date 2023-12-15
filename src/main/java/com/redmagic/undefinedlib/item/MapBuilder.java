package com.redmagic.undefinedlib.item;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

import java.util.List;

public class MapBuilder extends ItemBuilder{
    public MapBuilder() {
        super(Material.MAP);
    }

    public MapBuilder setColor(Color color){
        MapMeta meta = (MapMeta) stack.getItemMeta();
        meta.setColor(color);
        stack.setItemMeta(meta);
        return this;
    }

    public MapBuilder setMapView(MapView mapView){
        MapMeta meta = (MapMeta) stack.getItemMeta();
        meta.setMapView(mapView);
        stack.setItemMeta(meta);
        return this;
    }

    public MapBuilder setScaling(boolean scaling){
        MapMeta meta = (MapMeta) stack.getItemMeta();
        meta.setScaling(scaling);
        stack.setItemMeta(meta);
        return this;
    }


    @Override
    public MapBuilder setName(String name) {
        super.setName(name);
        return this;
    }


    @Override
    public MapBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public MapBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public MapBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public MapBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public MapBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public MapBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public MapBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public MapBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
