/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import java.util.Scanner;

/**
 *
 * @author sadss
 */
public class HelpMenuView extends View {

    
    public HelpMenuView() {
        super (  "\n----------------------------------------------"
                +"\n| Help Menu                                  |"
                +"\n----------------------------------------------"
                +"\nG - What is the goal of the game?"
                +"\nM - How to move"
                +"\nE - Estimating the amount of resources"
                +"\nH - Harvesting resources"
                +"\nX - Exit"
                +"\n----------------------------------------------"
                ,"\nPlease enter your choice: " );     
    }

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); // covert choice to upper case
        
        switch (value){
            case "G": // create and start a new game
                System.out.println("\n========================================"
                                  +"\nWhat is the goal of the Game? "
                                  +"\n========================================");
                
                break;
            case "M": // how to move
                System.out.println("\n========================================"
                                  +"\nHow do I move? "
                                  +"\n========================================");
                break;
            case "E": // estimate resources
                System.out.println("\n========================================"
                                  +"\nEstimating the amount of resources "
                                  +"\n========================================");
                break;
            case "H": // Harvest resources
                System.out.println("\n========================================"
                                  +"\nHarvesting resources "
                                  +"\n========================================");
                break;
            case "D": // Delivering Resources
                System.out.println("\n========================================"
                                  +"\nDelivering resources "
                                  +"\n========================================");
                break;
            case "Q": // Return to Main Menu
                System.out.println("\n*** Return to Main Menu called***");
                // Create MainMenuView object
                //MainMenuView mainMenuView = new MainMenuView();

                // Display the main menu view
                //mainMenuView.displayMainMenuView();
                //return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
}
