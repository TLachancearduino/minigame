package zero.zero.handler//the package for this project


import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import zero.zero.Zero


class Laucher (plugin: Zero?) : Listener {
    // the implements for the listener
    init { //the constructor of this handler
        Bukkit.getPluginManager().registerEvents(this, plugin!!)

    }


    @EventHandler
    fun buttonHandler(ev: PlayerInteractEvent) { //describes what the event is
        print("bob")
        if (ev.action == Action.RIGHT_CLICK_BLOCK) { //check if the action is physical
          val p = ev.player
        if (ev.clickedBlock!!.type == Material.WHITE_TERRACOTTA) { //compare what the player sept on to a stone pressure plate and is required a non-nullable
           if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandPvp")//dispatchCommand for pvp
                }
            }
           if(ev.clickedBlock!!.type == Material.ORANGE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
               Bukkit.dispatchCommand(p, "onCommandPvpSumo")//dispatchCommand for pvp sumo
                }
           }
           if(ev.clickedBlock!!.type == Material.MAGENTA_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandPvpBow")//dispatchCommand pvp bow
                }
           }
           if(ev.clickedBlock!!.type == Material.LIGHT_BLUE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                 Bukkit.dispatchCommand(p, "onCommandPvpLoot")//dispatchCommand for pvp loot
               }
           }
           if(ev.clickedBlock!!.type == Material.YELLOW_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandBridge")//dispatchCommand for bridge race
               }
           }
           if(ev.clickedBlock!!.type == Material.LIME_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandParkour")//dispatchCommand for parkour race
               }
           }
           if(ev.clickedBlock!!.type == Material.PINK_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandCaptureFlag")//dispatchCommand for capture flag
               }
           }
           if(ev.clickedBlock!!.type == Material.GRAY_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandDontDie")//dispatchCommand for dont die
               }
           }
           if(ev.clickedBlock!!.type == Material.LIGHT_GRAY_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandPvpKnockBack")//dispatch command for pvp knock back
               }
           }
           if(ev.clickedBlock!!.type == Material.CYAN_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandChaiseMusical")//dispatchCommand for chaise musical
               }
           }
           if(ev.clickedBlock!!.type == Material.PURPLE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandClimbFast")// dispatchCommand for climb fast
               }
           }
           if(ev.clickedBlock!!.type == Material.BLUE_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                 Bukkit.dispatchCommand(p, "onCommandCpsTest")//dispatchCommand for cps test
               }
           }
           if(ev.clickedBlock!!.type == Material.BROWN_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandDodgeBall")//dispatch command for dodge ball
               }
           }
           if(ev.clickedBlock!!.type == Material.GREEN_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandElytraRace")//dispatchCommand for elytra race
               }
           }
           if(ev.clickedBlock!!.type == Material.RED_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandFallTrap")//dispatchCommand for fall trap
               }
           }
           if(ev.clickedBlock!!.type == Material.BLACK_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandFindMe")//dispatchCommand for findme
               }
           }
           if(ev.clickedBlock!!.type == Material.TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandFireTrap")//dispatchCommand for fire trap
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandHideAndSeek")//dispatchCommand for hide and seek
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandHorseRace")//dispatchCommand for horse race
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandMlg")//dispatchCommand for mlg
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandRockPaperCisor")//dispatchCommand fro rock paper cisor
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandSkywars")//dispatchCommand for skywars
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                  Bukkit.dispatchCommand(p, "onCommandSwimFast")//dispatchCommand for swim fast
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandTag")//dispatchCommand for tag
               }
           }
           if(ev.clickedBlock!!.type == Material.X_TERRACOTTA){
               if(p.location.world.name.endsWith("lobby_server")){
                   Bukkit.dispatchCommand(p, "onCommandTnt")//dispatchCommand for tnt race
               }
           }
        }
    }
}










