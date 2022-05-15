package me.thecamzone.problem5;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Problem5 extends JavaPlugin implements Listener {
  private PlayerJoinListener playerJoinListener = new PlayerJoinListener();
  
  public void onEnable() {
    getServer().getPluginManager().registerEvents(this.playerJoinListener, (Plugin)this);
  }
  
  public PlayerJoinListener getPlayerJoinListener() {
    return this.playerJoinListener;
  }
}
