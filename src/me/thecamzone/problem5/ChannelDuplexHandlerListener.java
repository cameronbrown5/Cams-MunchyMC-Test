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
  
  public void channelRead(ChannelHandlerContext ctx, Object packet) throws Exception {
    Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "(" + Bukkit.getPlayer(this.playerUUID).getName() + " -> Server) " + ChatColor.RED + packet.toString());
    if (packet instanceof net.minecraft.server.v1_8_R3.PacketPlayInSteerVehicle)
      Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "(" + Bukkit.getPlayer(this.playerUUID).getName() + " -> Server) " + ChatColor.BLUE + packet.toString()); 
    ctx.fireChannelRead(packet);
  }
  
  public void write(ChannelHandlerContext ctx, Object packet, ChannelPromise promise) throws Exception {
    Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "(Server -> " + Bukkit.getPlayer(this.playerUUID).getName() + ") " + ChatColor.GREEN + packet.toString());
    ctx.write(packet, promise);
  }
}
