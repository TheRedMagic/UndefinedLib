package com.redmagic.undefinedlib.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.BookMeta;

import java.util.List;

public class BookBuilder extends ItemBuilder{
    public BookBuilder() {
        super(Material.BOOK);
    }

    public BookBuilder setAuthor(String author){
        BookMeta meta = (BookMeta) stack.getItemMeta();
        meta.setAuthor(author);
        stack.setItemMeta(meta);
        return this;
    }

    public BookBuilder setPage(int i, String data){
        BookMeta meta = (BookMeta) stack.getItemMeta();
        meta.setPage(i, data);
        stack.setItemMeta(meta);
        return this;
    }

    public BookBuilder setPages(String... pages){
        BookMeta meta = (BookMeta) stack.getItemMeta();
        meta.setPages(pages);
        stack.setItemMeta(meta);
        return this;
    }

    public BookBuilder setPages(List<String> pages){
        BookMeta meta = (BookMeta) stack.getItemMeta();
        meta.setPages(pages);
        stack.setItemMeta(meta);
        return this;
    }

    public BookBuilder setGeneration(BookMeta.Generation generation){
        BookMeta meta = (BookMeta) stack.getItemMeta();
        meta.setGeneration(generation);
        stack.setItemMeta(meta);
        return this;
    }

    public BookBuilder setTitle(String title){
        BookMeta meta = (BookMeta) stack.getItemMeta();
        meta.setTitle(title);
        stack.setItemMeta(meta);
        return this;
    }

    @Override
    public BookBuilder setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public BookBuilder setLore(String lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public BookBuilder setLore(List<String> lore) {
        super.setLore(lore);
        return this;
    }

    @Override
    public BookBuilder setCustomModelData(int customModelData) {
        super.setCustomModelData(customModelData);
        return this;
    }

    @Override
    public BookBuilder setUnbreakable(boolean unbreakable) {
        super.setUnbreakable(unbreakable);
        return this;
    }

    @Override
    public BookBuilder setAmount(int amount) {
        super.setAmount(amount);
        return this;
    }

    @Override
    public BookBuilder setLocalizedName(String locName) {
        super.setLocalizedName(locName);
        return this;
    }

    @Override
    public BookBuilder setDurability(short durability) {
        super.setDurability(durability);
        return this;
    }

    @Override
    public BookBuilder addEnchantment(Enchantment enchantment, int level) {
        super.addEnchantment(enchantment, level);
        return this;
    }
}
