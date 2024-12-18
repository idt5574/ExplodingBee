package org.dk5574.explodingBee;

import org.bukkit.plugin.java.JavaPlugin;
import org.dk5574.explodingBee.EntityListener;

public final class ExplodingBee extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Exploding Bee has been enabled!");
        getServer().getPluginManager().registerEvents(new EntityListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Exploding Bee has been disabled!");
    }
}
