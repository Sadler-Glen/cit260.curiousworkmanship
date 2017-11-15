/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sadss
 */
public class GettingPlayerNames {
    private static List<Player> players = new ArrayList<>();
    public static void main(String [] args){
        getPlayerNamesFromUser();
        printPlayers();
    }

    private static void getPlayerNamesFromUser() {
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0;  i < 5; i++){
            System.out.println("Please enter actor " + (i + 1) + ": ");
            String playerName = keyboard.nextLine();
            Player playerOne = new Player();
            playerOne.setName(playerName);
            players.add(playerOne);
        }
    }

    private static void printPlayers() {
        for(Player player: players){
            System.out.println(player);
        }
    }
}
 
