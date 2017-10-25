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
public class HelpMenuView {

    private String menu;
    private String promptMessage;
    
    public HelpMenuView() {
        this.menu =  "\n----------------------------------------------"
                    +"\n| Help Menu                                  |"
                    +"\n----------------------------------------------"
                    +"\nG - What is the goal of the game?"
                    +"\nM - How to move"
                    +"\nE - Estiating the amount of resources"
                    +"\nH - Harvesting resources"
                    +"\nQ - Quit"
                    +"\n----------------------------------------------";
                                
        this.promptMessage = "\nPlease enter your choice: ";       
    }

    void displayHelpMenuView() {
                boolean done = false; // set flag to not done
        do{
            // prompt for and get menu option
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q"))// user wants to quit
                    return; // exit game
                            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        
        } while(!done);
    }
    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while(!valid) { // loop while an invalid value is entered
            System.out.println(this.menu);
            System.out.println(" " + this.promptMessage);
            
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if(value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end the loop
        }
        
        return value; // return the value entered
    }
    private boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase(); // covert choice to upper case
        
        switch (menuOption){
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
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        return false;
    }
    
}
