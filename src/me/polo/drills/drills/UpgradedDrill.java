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

public class UpgradedDrill {

    private Plugin plugin = Main.getPlugin(Main.class);

    public ItemStack Drill() {
        ItemStack item = new ItemStack(Material.STONE_PICKAXE);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Upgraded Drill");
        meta.setUnbreakable(true);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addEnchant(Enchantment.DURABILITY, 5, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 2, true);

        item.setItemMeta(meta);

        ShapedRecipe UpgradedDrill = new ShapedRecipe(item);
        UpgradedDrill.shape("AAA", "ABA", "ACA");
        UpgradedDrill.setIngredient('A', Material.REDSTONE);
        UpgradedDrill.setIngredient('B', Material.STONE_PICKAXE);
        UpgradedDrill.setIngredient('C', Material.CHEST);
        plugin.getServer().addRecipe(UpgradedDrill);

        return item;
    }

}
