package space.nicholasblackburn.waterspigot.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.clip.placeholderapi.PlaceholderAPI;


/**
 * This Class Is used to Execute actions when a player Joins the Server!
 */

public class OnPlayerJoin implements Listener {
    static String prefix_Message = "[WaterSpigot] ->";
    static String join_Message = "Welcome Admin %player_name% to the Server!";
    static String info_Message = "Today The Current Server Ram Usage is ";
    static String use_Message = " To use is Plugin type /WaterSpigot help";
    static String max_ram = "%server_ram_max%M";
    static String used_ram = "%server_ram_used%M";

    // Runs exactly when the player logs on the the Server!
    @EventHandler
    public static void PlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        
        if (player.isOp()) {
            event.setJoinMessage(PlaceholderAPI.setPlaceholders(event.getPlayer(),ChatColor.YELLOW+prefix_Message+join_Message+ChatColor.GOLD+info_Message+ChatColor.GREEN+used_ram+ChatColor.AQUA+"/"+ChatColor.RED+max_ram));
        }
        
    }

}