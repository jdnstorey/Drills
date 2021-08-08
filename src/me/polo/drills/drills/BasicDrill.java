package me.polo.drills.drills;

import me.polo.drills.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class BasicDrill {
    private Plugin plugin = Main.getPlugin(Main.class);

    public ItemStack Drill() {
        ItemStack item = new ItemStack(Material.WOODEN_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Basic Drill");
        meta.setUnbreakable(true);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 2, true);

        item.setItemMeta(meta);

        ShapedRecipe BasicDrill = new ShapedRecipe(item);
        BasicDrill.shape("AAA", "ABA", "ACA");
        BasicDrill.setIngredient('A', Material.REDSTONE);
        BasicDrill.setIngredient('B', Material.WOODEN_PICKAXE);
        BasicDrill.setIngredient('C', Material.CHEST);
        plugin.getServer().addRecipe(BasicDrill);

        return item;
    }
}
