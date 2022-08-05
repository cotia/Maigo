package net.encha.maigo

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class MaigoPlugin : JavaPlugin() {

    override fun onEnable() {
        logger.info("Maigo Plugin Enabled!")
        val plugin = this
        getCommand("maigo")!!.setExecutor(MaigoCommand())
        Bukkit.getServer().pluginManager.registerEvents(MaigoListener(), this)
    }

    override fun onDisable() {

    }
}