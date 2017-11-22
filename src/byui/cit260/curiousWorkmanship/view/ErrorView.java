/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.view;

/**
 *
 * @author sadss
 */
public class ErrorView  {

    public static void display(String errorMessage) {
        System.out.println("\n--- ERROR ------------------------------------------------------------------");
        System.out.println("\t" + errorMessage);
        System.out.println("----------------------------------------------------------------------------\n\n");
    }
    
}
