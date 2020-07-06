package space.nicholasblackburn.waterspigot;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import space.nicholasblackburn.waterspigot.Events.OnPlayerJoin;

public class Waterspigot extends JavaPlugin {

    
    // Runs on Plugin ENabled / Server Starting 
    @Override
    public void onEnable() {
        
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            /*
             * We register the EventListeneres here, when PlaceholderAPI is installed.
             * Since all events are in the main class (this class), we simply use "this"
             */

             
            getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        } else {
            throw new RuntimeException("Could not find PlaceholderAPI!! Plugin can not work without it!");
        }
    
    }

    // Runs on Server Disabled is Called
    @Override
    public void onDisable(){

    }


}