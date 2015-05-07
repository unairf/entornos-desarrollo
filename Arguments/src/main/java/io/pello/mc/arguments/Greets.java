
package io.pello.mc.arguments; 

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This plugins sends greets or messages repeteadly
 * showing how to get command arguments
 * @author Pello Altadill
 * @greetz any
 */
public class Greets extends JavaPlugin { 
  // we set this logger to show messages on console
  private static Logger log = Logger.getLogger("Minecraft");
  
  /**
   * This method is called when the plugin is loaded
   */
  public void onLoad() {
	    log.info("Greets Plugin> loaded");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onEnable() {
    log.info("Greets Plugin> enabled");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onDisable() {
	    log.info("Greets Plugin> disabled");
  }
  
  /**
   * onCommand event, whenever the player sends a command with /command
   * this method will be invoked
   */
  public boolean onCommand(CommandSender sender, Command command, 
		     String commandLabel, String[] args) {   
	// If the command is hello...
    if (commandLabel.equalsIgnoreCase("greets")) {
       	// Check if command was sent by a player
    	if (sender instanceof Player) {
    		// Cast or convert sender to Player
    		Player myPlayer = (Player) sender;
    		Location location = myPlayer.getLocation();

    		// Get the World through the location
    		World world = myPlayer.getWorld();
    		
    		// We move the location slightly
    		// X: east/west
    		// Y: up/down
    		// Z: north/south
    		location.setY(location.getY() + 1);
    		location.setZ(location.getZ() + 2);
    		
    		// Get the block in that location and set type
    		Block block = world.getBlockAt(location);
    		block.setType(Material.STONE);
    		
    	}		
    }
    return false;
  }
}

