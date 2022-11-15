package me.tansan.squareset;




import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class SquareSet extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "플러그인이 활성화 되었습니다.");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "플러그인이 비활성화 되었습니다.");
    }

    @EventHandler
    public  void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(ChatColor.GOLD +e.getPlayer().getDisplayName()+"connected User");
    }
    @EventHandler
    public  void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage(ChatColor.BLUE +e.getPlayer().getDisplayName()+"timeout error");
    }

}
