package me.polo.drills;

import me.polo.drills.commands.DrillGiver;
import me.polo.drills.drillinventories.*;
import me.polo.drills.drills.*;
import me.polo.drills.events.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {

        getServer().getPluginCommand("drillgive").setExecutor(new DrillGiver());

        //basic drill
        BasicDrillInv.initialize();
        new BasicDrill().Drill();
        new BasicDrillEvent(this);
        getServer().getPluginManager().registerEvents(new BasicDrillEvent(this), this);

        //upgraded drill
        UpgradedDrillInv.initialize();
        new UpgradedDrill().Drill();
        new UpgradedDrillEvent(this);
        getServer().getPluginManager().registerEvents(new UpgradedDrillEvent(this), this);

        //sharpened drill
        SharpenedDrillInv.initialize();
        new SharpenedDrill().Drill();
        new SharpenedDrillEvent(this);
        getServer().getPluginManager().registerEvents(new SharpenedDrillEvent(this), this);

        //swift drill
        SwiftDrillInv.initialize();
        new SwiftDrill().Drill();
        new SwiftDrillEvent(this);
        getServer().getPluginManager().registerEvents(new SwiftDrillEvent(this), this);

        //super drill
        SuperDrillInv.initialize();
        new SuperDrill().Drill();
        new SwiftDrillEvent(this);
        getServer().getPluginManager().registerEvents(new SuperDrillEvent(this), this);
    }
    public void onDisable() {

    }

}
