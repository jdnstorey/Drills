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

public class SuperDrill {

    private Plugin plugin = Main.getPlugin(Main.class);

    public ItemStack Drill() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "Super Drill");
        meta.setUnbreakable(true);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 8, true);

        item.setItemMeta(meta);

        ShapedRecipe SuperDrill = new ShapedRecipe(item);
        SuperDrill.shape("ADA", "ABA", "ACA");
        SuperDrill.setIngredient('A', Material.REDSTONE_BLOCK);
        SuperDrill.setIngredient('B', Material.DIAMOND_PICKAXE);
        SuperDrill.setIngredient('C', Material.CHEST);
        SuperDrill.setIngredient('D', Material.DIAMOND_BLOCK);
        plugin.getServer().addRecipe(SuperDrill);

        return item;
    }
}
