package net.encha.maigo

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class MaigoCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (command.name.equals("maigo"))
        {
            val player = sender as Player
            val loc = player.location
            Bukkit.broadcastMessage(ChatColor.YELLOW.toString() + "<" + player.name + "> " + loc.blockX + ", " + loc.blockY + ", " + loc.blockZ)
            player.addPotionEffect(PotionEffect(PotionEffectType.GLOWING, 20 * 10, 1, false, false, false), true)
            return true
        }
        return false
    }
}