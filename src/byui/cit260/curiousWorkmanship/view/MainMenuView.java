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
public class MainMenuView {

    private String menu;
    private String promptMessage;

    public MainMenuView() {
        this.menu =  "\n-------------------------------"
                    +"\n| Main Menu                   |"
                    +"\n-------------------------------"
                    +"\nN - Start new Game"
                    +"\nG - Get and start saved game"
                    +"\nH - Get help on how toplay the game"
                    +"\nS - Save game"
                    +"\nQ - Quit"
                    +"\n-------------------------------";
                // promptMessage = "Please enter your name
        //this.promptMessage = "\nPlease enter your choice: ";
    }
    
        /**
         * displays the start program view
         */
        public void displayMainMenuView(){  

        boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q"))// user wants to quit
                    return; // exit game
                            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        
        } while(!done);
    }

    private String getMenuOption() {
        System.out.println("\n*** getMenuOption() called ***");
        return "N";
    }
    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
}

