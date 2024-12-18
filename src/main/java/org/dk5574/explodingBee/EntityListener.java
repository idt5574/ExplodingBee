package org.dk5574.explodingBee;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityListener implements Listener {

    @EventHandler
    public void onMadBeeHit(EntityDamageByEntityEvent event) {
        Entity damager = event.getDamager();

        if(damager.getType() == EntityType.BEE && event.getEntity() instanceof org.bukkit.entity.Player) {
            damager.getWorld().createExplosion(event.getEntity().getLocation(), 50F);
        }
    }
}
