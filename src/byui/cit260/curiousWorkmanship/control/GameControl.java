/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.control;

import byui.cit260.curiousWorkmanship.model.Player;
import curiousworkmanship.CuriousWorkmanship;

/**
 *
 * @author sadss
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if(name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        CuriousWorkmanship.setPlayer(player); // save the player
        return player;
    }
    
}
