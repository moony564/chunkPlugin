package com.github.moony564.untitled1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Untitled1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
