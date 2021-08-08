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

public class SwiftDrill {

    private Plugin plugin = Main.getPlugin(Main.class);

    public ItemStack Drill() {
        ItemStack item = new ItemStack(Material.GOLDEN_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Swift Drill");
        meta.setUnbreakable(true);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 5, true);

        item.setItemMeta(meta);

        ShapedRecipe SwiftDrill = new ShapedRecipe(item);
        SwiftDrill.shape("AAA", "ABA", "ACA");
        SwiftDrill.setIngredient('A', Material.REDSTONE_BLOCK);
        SwiftDrill.setIngredient('B', Material.GOLDEN_PICKAXE);
        SwiftDrill.setIngredient('C', Material.CHEST);
        plugin.getServer().addRecipe(SwiftDrill);

        return item;
    }
}

