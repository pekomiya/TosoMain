/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tosogame.tosomain;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author ja731j
 */
public class Main extends JavaPlugin{
        @Override
    public void onEnable() {
        getLogger().info("The TosoMain plugin has been loaded");
    }

    @Override
    public void onDisable() {
        getLogger().info("The TosoMain plugin has been unloaded");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player)sender;
            player.sendMessage("Hello, "+player.getName()+"!");
        }else{
            sender.sendMessage("This command can only be run by players!");
        }
        return true;
    }
}
