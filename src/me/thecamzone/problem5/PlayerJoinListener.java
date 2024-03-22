package me.thecamzone.problem5;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinListener implements Listener {
	
	/*
	 * Overwrite ChannelDuplexHandler with custom class
	 * Inject player into pipeline
	 */
	@EventHandler
	public void onPlayerConnect(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		((CraftPlayer) player)
			.getHandle()
			.playerConnection
			.networkManager
			.channel
			.pipeline()
			.addBefore("packet_handler", player.getName(), new ChannelDuplexHandlerListener(player.getUniqueId()));
	}

	/*
	 * Remove custom ChannelDuplexHandler and player from pipeline
	 */
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent e) {
		Player player = e.getPlayer();
		((CraftPlayer) player)
			.getHandle()
			.playerConnection
			.networkManager
			.channel
			.pipeline()
			.remove(player.getName());
	}
}
