/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.control;

import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.InventoryItem;
import byui.cit260.curiousWorkmanship.model.Player;
import curiousworkmanship.CuriousWorkmanship;

/**
 *
 * @author jacksonrkj
 */
public class ProgramControl {
      
    private final static int INVENTORY_COUNT = 10;
    
    
    public static Player createPlayer(String name) {
        
        Player player = new Player();
        player.setName(name);
        
        CuriousWorkmanship.setPlayer(player); // save the player
        
        return player;
    }

    public static void saveGame(Game game, String filepath) {
       // TODO
        System.out.println("\n**** saveGame stub ****");
    }
    
}
