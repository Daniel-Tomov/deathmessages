package me.cageydinosaur.deathmessages;

import org.bukkit.plugin.java.JavaPlugin;

import me.cageydinosaur.deathmessages.listeners.PlayerDeathListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new PlayerDeathListener(this);
	}
}
