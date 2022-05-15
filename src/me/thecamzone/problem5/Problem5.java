package me.thecamzone.problem5;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Problem5 extends JavaPlugin implements Listener {
	private PlayerJoinListener playerJoinListener = new PlayerJoinListener();

	public void onEnable() {
		// Register join/leave events
		getServer().getPluginManager().registerEvents(playerJoinListener, this);
	}

	public PlayerJoinListener getPlayerJoinListener() {
		return this.playerJoinListener;
	}
}
