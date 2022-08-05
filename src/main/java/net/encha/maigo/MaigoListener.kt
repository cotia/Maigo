package net.encha.maigo

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class MaigoListener : Listener {

    @EventHandler
    fun onMaigo(event: PlayerInteractEvent) {
        val player = event.player

        if (event.action == Action.LEFT_CLICK_BLOCK) {
            val itemStack = player.inventory.itemInMainHand
            if (itemStack.type == Material.STICK) {
                val loc = event.clickedBlock!!.location
                Bukkit.broadcastMessage(ChatColor.YELLOW.toString() + "<" + player.name + "> " + loc.blockX + ", " + loc.blockY + ", " + loc.blockZ)
                player.addPotionEffect(PotionEffect(PotionEffectType.GLOWING, 20 * 10, 1, false, false, false), true)
            }
            return
        }

    }
}