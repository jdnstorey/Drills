package me.polo.drills.events;

import me.polo.drills.Main;
import me.polo.drills.drillinventories.SharpenedDrillInv;
import me.polo.drills.drillinventories.SwiftDrillInv;
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

public class SwiftDrillEvent implements Listener {

        private Plugin plugin;
        public SwiftDrillEvent(Main plugin){
            this.plugin = plugin;
        }

        // 1 2 3
        // 4 B 5
        // 6 7 8

        @EventHandler
        public void onBreak(BlockBreakEvent e) {
            if(e.getPlayer().getItemInHand().hasItemMeta()) {
                if (e.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                    if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD +
                            "Swift Drill")) {
                        e.setDropItems(false);
                        e.setExpToDrop(0);

                        if(!(e.getPlayer().isSneaking())){
                            Block b1 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                    e.getBlock().getY() + 1,
                                    e.getBlock().getZ());
                            Collection<ItemStack> b1drop = b1.getDrops();
                            b1.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b1drop.toArray(new ItemStack[b1drop.size()]));

                            Block b2 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX(),
                                    e.getBlock().getY() + 1,
                                    e.getBlock().getZ());
                            Collection<ItemStack> b2drop = b2.getDrops();
                            b2.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b2drop.toArray(new ItemStack[b2drop.size()]));

                            Block b3 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                    e.getBlock().getY() + 1,
                                    e.getBlock().getZ());
                            Collection<ItemStack> b3drop = b3.getDrops();
                            b3.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b3drop.toArray(new ItemStack[b3drop.size()]));

                            Block b4 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                    e.getBlock().getY(),
                                    e.getBlock().getZ());
                            Collection<ItemStack> b4drop = b4.getDrops();
                            b4.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b4drop.toArray(new ItemStack[b4drop.size()]));

                            Block b5 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                    e.getBlock().getY(),
                                    e.getBlock().getZ());
                            Collection<ItemStack> b5drop = b5.getDrops();
                            b5.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b5drop.toArray(new ItemStack[b5drop.size()]));

                            Block b6 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                    e.getBlock().getY() - 1,
                                    e.getBlock().getZ());
                            Collection<ItemStack> b6drop = b6.getDrops();
                            b6.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b6drop.toArray(new ItemStack[b6drop.size()]));

                            Block b7 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX(),
                                    e.getBlock().getY() - 1,
                                    e.getBlock().getZ());
                            Collection<ItemStack> b7drop = b7.getDrops();
                            b7.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b7drop.toArray(new ItemStack[b7drop.size()]));

                            Block b8 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                    e.getBlock().getY() - 1,
                                    e.getBlock().getZ());
                            Collection<ItemStack> b8drop = b8.getDrops();
                            b8.setType(Material.AIR);
                            SwiftDrillInv.inv.addItem(b8drop.toArray(new ItemStack[b8drop.size()]));
                        }

                        Collection<ItemStack> drop = e.getBlock().getDrops();
                        SwiftDrillInv.inv.addItem(drop.toArray(new ItemStack[drop.size()]));
                    }
                }
            }
        }

        @EventHandler
        public void onClick(PlayerInteractEvent f){
            if(f.getPlayer().getItemInHand().hasItemMeta()) {
                if (f.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                    if(f.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "" + ChatColor.BOLD +
                            "Swift Drill")) {
                        if (f.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                            f.getPlayer().openInventory(SwiftDrillInv.inv);
                        } else if (f.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                            f.getPlayer().openInventory(SwiftDrillInv.inv);
                        } else {}
                    } else {}
                } else {}
            }
        }
    }
