package com.github.moony564.untitled1;

import io.papermc.paper.event.packet.PlayerChunkLoadEvent;
import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Event implements Listener {
    @EventHandler
    public void onChunkMove(PlayerMoveEvent e){
        Chunk formChunk = e.getFrom().getChunk();
        Chunk toChunk = e.getTo().getChunk();
        Player p = e.getPlayer();

        if(!formChunk.equals(toChunk)){
            if (e.getPlayer().hasPermission("myplugin.bypass.chunkblock")) {
                return; // 이동 허용
            }
            e.setCancelled(true);
            p.damage(2.0f);
            p.sendMessage(ChatColor.DARK_RED + "넘어갈수없음");
        }
    }
}
