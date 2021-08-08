package me.polo.drills.events;

import me.polo.drills.Main;
import me.polo.drills.drillinventories.BasicDrillInv;
import me.polo.drills.drillinventories.UpgradedDrillInv;
import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.Collection;
import java.util.Objects;

public class UpgradedDrillEvent implements Listener {

    private Plugin plugin;
    public UpgradedDrillEvent(Main plugin){
        this.plugin = plugin;
    }


    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        if(e.getPlayer().getItemInHand().hasItemMeta()) {
            if (e.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_AQUA + "" + ChatColor.BOLD +
                        "Upgraded Drill")) {
                    e.setDropItems(false);
                    e.setExpToDrop(0);

                    Collection<ItemStack> drop = e.getBlock().getDrops();
                    UpgradedDrillInv.inv.addItem(drop.toArray(new ItemStack[drop.size()]));
                }
            }
        }
    }

    @EventHandler
    public void onClick(PlayerInteractEvent f){
        if(f.getPlayer().getItemInHand().hasItemMeta()) {
            if (f.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                if(f.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_AQUA + "" + ChatColor.BOLD +
                        "Upgraded Drill")){
                    if (f.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                        f.getPlayer().openInventory(UpgradedDrillInv.inv);
                    } else if (f.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                        f.getPlayer().openInventory(UpgradedDrillInv.inv);
                    } else {}
                } else {}
            } else {}
        }
    }

}
