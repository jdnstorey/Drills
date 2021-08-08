package me.polo.drills.events;

import me.polo.drills.Main;
import me.polo.drills.drillinventories.BasicDrillInv;
import me.polo.drills.drillinventories.SharpenedDrillInv;
import me.polo.drills.drillinventories.UpgradedDrillInv;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.Collection;
import java.util.Objects;

public class SharpenedDrillEvent implements Listener {

    private Plugin plugin;
    public SharpenedDrillEvent(Main plugin){
        this.plugin = plugin;
    }


    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        if(e.getPlayer().getItemInHand().hasItemMeta()) {
            if (e.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD +
                        "Sharpened Drill")) {
                    e.setDropItems(false);
                    e.setExpToDrop(0);

                    if(!(e.getPlayer().isSneaking())){
                        Block b1 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX(), e.getBlock().getY() - 1,
                            e.getBlock().getZ());
                        Collection<ItemStack> b1drop = b1.getDrops();
                        b1.setType(Material.AIR);
                        SharpenedDrillInv.inv.addItem(b1drop.toArray(new ItemStack[b1drop.size()]));
                    }

                    Collection<ItemStack> drop = e.getBlock().getDrops();
                    SharpenedDrillInv.inv.addItem(drop.toArray(new ItemStack[drop.size()]));
                }
            }
        }
    }

    @EventHandler
    public void onClick(PlayerInteractEvent f){
        if(f.getPlayer().getItemInHand().hasItemMeta()) {
            if (f.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                if(f.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD +
                        "Sharpened Drill")){
                    if (f.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                        f.getPlayer().openInventory(SharpenedDrillInv.inv);
                    } else if (f.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                        f.getPlayer().openInventory(SharpenedDrillInv.inv);
                    } else {}
                } else {}
            } else {}
        }
    }
}
