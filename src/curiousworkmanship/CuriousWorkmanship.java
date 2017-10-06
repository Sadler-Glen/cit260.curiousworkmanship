/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curiousworkmanship;

import byui.cit260.curiousWorkmanship.model.Actor;
import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author sadss
 */
public class CuriousWorkmanship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player();
        System.out.println(playerOne);
        
        Game gameOne = new Game();
        System.out.println(gameOne);
        
        //Actor actorOne = new Actor();
        //System.out.println(actorOne);
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getBestTime();
        
        System.out.println("Name = " + playerOneName + ", time = " + playerOneTime);
    }
    
}
