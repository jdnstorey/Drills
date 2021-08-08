package me.polo.drills.commands;

import me.polo.drills.drills.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DrillGiver implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
          Player player = (Player) sender;
          if(player.isOp()){
              if(cmd.getName().equalsIgnoreCase("drillgive")){
                  if(args.length == 1) {
                      if (args[0].equalsIgnoreCase("basic")) {
                          player.getInventory().addItem(new BasicDrill().Drill());
                      }
                      if (args[0].equalsIgnoreCase("upgraded")) {
                          player.getInventory().addItem(new UpgradedDrill().Drill());
                      }
                      if (args[0].equalsIgnoreCase("sharpened")) {
                          player.getInventory().addItem(new SharpenedDrill().Drill());
                      }
                      if (args[0].equalsIgnoreCase("swift")) {
                          player.getInventory().addItem(new SwiftDrill().Drill());
                      }
                      if (args[0].equalsIgnoreCase("super")) {
                          player.getInventory().addItem(new SuperDrill().Drill());
                      }
                  } else {
                      player.sendMessage("Please do /drillgive <type>");
                  }
              }
          }
        }

        return false;
    }

}
