package me.cageydinosaur.deathmessages.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import me.cageydinosaur.deathmessages.Main;
import me.cageydinosaur.deathmessages.utils.Utils;

public class PlayerDeathListener implements Listener{
	
	private static Main plugin;
	
	public PlayerDeathListener (Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this,plugin);

	}
	
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent e) {
		if (e.getEntity().getKiller() instanceof Player) {
			Player killer = e.getEntity().getKiller();
			Player p = e.getEntity();
			
			killer.sendMessage(Utils.chat("&7You have killed &6" + p.getDisplayName()));
			p.sendMessage(Utils.chat("&7You have been killed by &c" + killer.getDisplayName()));
			return;
		}
	}	
}
