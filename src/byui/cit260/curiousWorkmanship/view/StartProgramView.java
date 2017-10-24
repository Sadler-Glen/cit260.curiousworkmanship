/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

import byui.cit260.curiousWorkmanship.control.GameControl;
import byui.cit260.curiousWorkmanship.model.Player;
import java.util.Scanner;

/**
 *
 * @author sadss
 */
public class StartProgramView {
    
    /**
     * displays the start program view
     */

    public void displayStartProgramView() {
        /*
        do
            prompt for and get playersName
            If playersName == 'Q' then
                return
            do requested action and display next view
        while the view is not done
        */
        boolean done = false; // set glag as not done;
        do{
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q")) // user wants to quit
                return; // exit game
            
            // do the requested action and dispaly the next view
            done = this.doAction(playersName);
        } while (!done);
    }
    
    private String promptMessage;
    
    public StartProgramView(){
        // promptMessage = "Please enter your name
        this.promptMessage = "\nPlease enter your name: ";
        // display banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        
        System.out.println(""
                + "\n*********************************************"
                + "\n*                                           *"
                + "\n* This is the game of Curious Workmaship    *"
                + "\n* In this game you will help Nephi build a  *"
                + "\n* ship of curious workmanship to travel to  *"
                + "\n* the promised land.                        *"
                + "\n*                                           *"
                + "\n* You and your family will need to first    *"
                + "\n* plan for your trip determining and        *"
                + "\n* estimating the amount of resources        *"
                + "\n* needed for the trip. Then you will have   *"
                + "\n* to go out and search for and harvest      *"
                + "\n* the needed resources and deliver them     *"
                + "\n* to the warehouse where they will store    *"
                + "\n* them until the ship is completed. Then    *"
                + "\n* you will also need to build a ship,       *"
                + "\n* load the ship, and then set sail for      *"
                + "\n* the promised land. You will first need    *"
                + "\n* to find the resources and manufacture     *"
                + "\n* the tools needed to build the ship.       *"
                + "\n*                                           *"
                + "\n* Good luck and have fun in this adventure  *"
                + "\n*                                           *"
                + "\n*********************************************"
                );
    }

    private String getPlayersName() {
        /*
        WHILE valid value has not been entered
            DISPLAY promptMessage
            GET the value entered from the keyboard
            Trim front and trailing blanks off the name
        
            IF The length of the value is blank THEN
                DISPLAY "Invalid value: The value cannot be blank"
                CONTINUE
            ENDIF
        
            BREAK
        
        ENDWHILE
        RETURN name
        */
        Scanner keyboard = new Scanner(System.in); // get infile fro keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while(!valid){ // loop while an invalid vale is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if(value.length() < 1){ // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; // end the loop
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        
        /*  If the length of the playersName < 2 THEN
                DISPLAY "Invalid name: The name must be > 1 character"
                    return false
            Create player with specufied name
            if unsuccessful THEN
                DISPLAY "Invalid name: The name is too short"
                    return false
            DISPLAY customize welcome message
            display mainMenuView
            return true
        */ 
        if(playersName.length() < 2){
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
    
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if(player == null){ // if unsucessful
            System.out.println("\nError creating the player,");
            return false;    
        }
        // display next view
        this.displayNextView(player);
        return true; // success!
    }

    private void displayNextView(Player player) {
        // display a custom welcome messge
        System.out.println  ("\n============================================="
                            +"\n Welcome to the game " + player.getName()
                            +"\n We hope you have a lot of fun!"
                            +"\n============================================="
                            );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
}
