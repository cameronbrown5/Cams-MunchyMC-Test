package me.thecamzone.problem5;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.util.UUID;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;

public class ChannelDuplexHandlerListener extends ChannelDuplexHandler {
	UUID playerUUID;

	public ChannelDuplexHandlerListener(UUID uuid) {
		this.playerUUID = uuid;
	}

	/*
	 * Read packets sent from client
	 * COLOR: RED or BLUE (Steer Packets)
	 */
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object packet) throws Exception {
		// Log packet name in red to console if it is from client
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "(" + Bukkit.getPlayer(this.playerUUID).getName() + " -> Server) " + ChatColor.RED + packet.toString());
		
		if (packet instanceof net.minecraft.server.v1_8_R3.PacketPlayInSteerVehicle) {
			// Log packet name in Blue to console if it is a steer vehicle packet.
			Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "(" + Bukkit.getPlayer(this.playerUUID).getName() + " -> Server) " + ChatColor.BLUE + packet.toString());
		}
			
		ctx.fireChannelRead(packet);
	}

	/*
	 * Read packets sent from server
	 * COLOR: Green
	 */
	@Override
	public void write(ChannelHandlerContext ctx, Object packet, ChannelPromise promise) throws Exception {
		// Log packet name in Green to console if it is from server
		Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "(Server -> " + Bukkit.getPlayer(this.playerUUID).getName() + ") " + ChatColor.GREEN + packet.toString());
		ctx.write(packet, promise);
	}
}
