package me.polo.drills.drillinventories;

import me.polo.drills.Main;
import me.polo.drills.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SuperDrillInv {

    private Main plugin;
    public SuperDrillInv(Main plugin){
        this.plugin = plugin;
    }

    public static Inventory inv;
    public static String inventory_name;
    public static int rows = 5;
    public static int inv_rows = rows * 9;

    public static void initialize(){
        inventory_name = Utils.chat("&l&7SuperDrill Drill");
        inv = Bukkit.createInventory(null, inv_rows);
    }

    public static Inventory SuperDrillInv(Player p) {
        Inventory toReturn = Bukkit.createInventory(p, inv_rows, inventory_name);
        //Inventory inv, (Material material || ItemStack itemStack), int amount, int invSlot, String displayName, String... loreString

        //get event, get block type, add here

        return toReturn;
    }

    public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv){}
}
