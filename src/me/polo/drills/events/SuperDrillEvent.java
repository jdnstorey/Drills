package me.polo.drills.events;

import me.polo.drills.Main;
import me.polo.drills.drillinventories.SuperDrillInv;
import me.polo.drills.drillinventories.SuperDrillInv;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.Collection;

public class SuperDrillEvent implements Listener {
    
    private Plugin plugin;
    public SuperDrillEvent(Main plugin){
        this.plugin = plugin;
    }

    // 1  2  3  4  5
    // 6  7  8  9  10
    // 11 12 B  13 14
    // 15 16 17 18 19
    // 20 21 22 23 24

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        if(e.getPlayer().getItemInHand().hasItemMeta()) {
            if (e.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                if (e.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "" + ChatColor.BOLD +
                        "Super Drill")) {
                    e.setDropItems(false);
                    e.setExpToDrop(0);

                    if(!(e.getPlayer().isSneaking())){
                        
                        Block b1 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 2,
                                e.getBlock().getY() + 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b1drop = b1.getDrops();
                        b1.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b1drop.toArray(new ItemStack[b1drop.size()]));

                        Block b2 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                e.getBlock().getY() + 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b2d = b2.getDrops();
                        b2.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b2d.toArray(new ItemStack[b2d.size()]));

                        Block b3 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX(),
                                e.getBlock().getY() + 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b3d = b3.getDrops();
                        b3.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b3d.toArray(new ItemStack[b3d.size()]));

                        Block b4 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                e.getBlock().getY() + 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b4d = b4.getDrops();
                        b4.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b4d.toArray(new ItemStack[b4d.size()]));

                        Block b5 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 2,
                                e.getBlock().getY() + 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b5d = b5.getDrops();
                        b5.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b5d.toArray(new ItemStack[b5d.size()]));

                        
                        
                        Block b6 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 2,
                                e.getBlock().getY() + 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b6d = b6.getDrops();
                        b6.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b6d.toArray(new ItemStack[b6d.size()]));

                        Block b7 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                e.getBlock().getY() + 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b7d = b7.getDrops();
                        b7.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b7d.toArray(new ItemStack[b7d.size()]));

                        Block b8 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX(),
                                e.getBlock().getY() + 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b8d = b8.getDrops();
                        b8.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b8d.toArray(new ItemStack[b8d.size()]));
                        
                        Block b9 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                e.getBlock().getY() + 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b9d = b9.getDrops();
                        b9.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b9d.toArray(new ItemStack[b9d.size()]));

                        Block b10 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 2,
                                e.getBlock().getY() + 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b10d = b10.getDrops();
                        b10.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b10d.toArray(new ItemStack[b10d.size()]));

                        

                        Block b11 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 2,
                                e.getBlock().getY(),
                                e.getBlock().getZ());
                        Collection<ItemStack> b11d = b11.getDrops();
                        b11.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b11d.toArray(new ItemStack[b11d.size()]));

                        Block b12 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                e.getBlock().getY(),
                                e.getBlock().getZ());
                        Collection<ItemStack> b12d = b12.getDrops();
                        b12.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b12d.toArray(new ItemStack[b12d.size()]));
                        
                        Block b13 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                e.getBlock().getY(),
                                e.getBlock().getZ());
                        Collection<ItemStack> b13d = b13.getDrops();
                        b13.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b13d.toArray(new ItemStack[b13d.size()]));

                        Block b14 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 2,
                                e.getBlock().getY(),
                                e.getBlock().getZ());
                        Collection<ItemStack> b14d = b14.getDrops();
                        b14.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b14d.toArray(new ItemStack[b14d.size()]));



                        Block b15 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 2,
                                e.getBlock().getY() - 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b15d = b15.getDrops();
                        b15.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b15d.toArray(new ItemStack[b15d.size()]));

                        Block b16 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                e.getBlock().getY() - 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b16d = b16.getDrops();
                        b16.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b16d.toArray(new ItemStack[b16d.size()]));

                        Block b17 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX(),
                                e.getBlock().getY() - 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b17d = b17.getDrops();
                        b17.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b17d.toArray(new ItemStack[b17d.size()]));

                        Block b18 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                e.getBlock().getY() - 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b18d = b18.getDrops();
                        b18.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b18d.toArray(new ItemStack[b18d.size()]));

                        Block b19 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 2,
                                e.getBlock().getY() - 1,
                                e.getBlock().getZ());
                        Collection<ItemStack> b19d = b19.getDrops();
                        b19.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b19d.toArray(new ItemStack[b19d.size()]));



                        Block b20 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 2,
                                e.getBlock().getY() - 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b20d = b20.getDrops();
                        b20.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b20d.toArray(new ItemStack[b20d.size()]));

                        Block b21 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() - 1,
                                e.getBlock().getY() - 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b21d = b21.getDrops();
                        b21.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b21d.toArray(new ItemStack[b21d.size()]));

                        Block b22 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX(),
                                e.getBlock().getY() - 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b22d = b22.getDrops();
                        b22.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b22d.toArray(new ItemStack[b22d.size()]));

                        Block b23 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 1,
                                e.getBlock().getY() - 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b23d = b23.getDrops();
                        b23.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b23d.toArray(new ItemStack[b23d.size()]));

                        Block b24 = e.getPlayer().getWorld().getBlockAt(e.getBlock().getX() + 2,
                                e.getBlock().getY() - 2,
                                e.getBlock().getZ());
                        Collection<ItemStack> b24d = b24.getDrops();
                        b24.setType(Material.AIR);
                        SuperDrillInv.inv.addItem(b24d.toArray(new ItemStack[b24d.size()]));
                    }

                    Collection<ItemStack> drop = e.getBlock().getDrops();
                    SuperDrillInv.inv.addItem(drop.toArray(new ItemStack[drop.size()]));
                }
            }
        }
    }

    @EventHandler
    public void onClick(PlayerInteractEvent f){
        if(f.getPlayer().getItemInHand().hasItemMeta()) {
            if (f.getPlayer().getItemInHand().getItemMeta().hasDisplayName()) {
                if(f.getPlayer().getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "" + ChatColor.BOLD +
                        "Super Drill")) {
                    if (f.getAction().equals(Action.RIGHT_CLICK_AIR)) {
                        f.getPlayer().openInventory(SuperDrillInv.inv);
                    } else if (f.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                        f.getPlayer().openInventory(SuperDrillInv.inv);
                    } else {}
                } else {}
            } else {}
        }
    }
}
