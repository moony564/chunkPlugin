package com.github.moony564.untitled1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Untitled1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Event(), this);
        getLogger().info("플러그인이 활성화 되었습니다.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("플러그인이 비활성화 되었습니다.");
    }
}
