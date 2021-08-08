package me.polo.drills.drills;

import me.polo.drills.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class SharpenedDrill {

    private Plugin plugin = Main.getPlugin(Main.class);

    public ItemStack Drill() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Sharpened Drill");
        meta.setUnbreakable(true);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 3, true);

        item.setItemMeta(meta);

        ShapedRecipe SharpenedDrill = new ShapedRecipe(item);
        SharpenedDrill.shape("AAA", "ABA", "ACA");
        SharpenedDrill.setIngredient('A', Material.REDSTONE_BLOCK);
        SharpenedDrill.setIngredient('B', Material.IRON_PICKAXE);
        SharpenedDrill.setIngredient('C', Material.CHEST);
        plugin.getServer().addRecipe(SharpenedDrill);

        return item;
    }
}
