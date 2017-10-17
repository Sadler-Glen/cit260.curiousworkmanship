/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sadss
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfBarrel method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfBarrel() {
       
        System.out.println("calcVolumeOfBarrel");

        /*********************************
         * Test case #1
         ********************************/

         System.out.println("\tTest case #1");
        
// Input values for test case 1
        double height = 24.0;
        double diameter = 12.0;
        double expResult = 1.5708; // expected output returned value
        
        // create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        // call function to run test
        double result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected retrun value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        /*********************************
         * Test case #2
         ********************************/

         System.out.println("\tTest case #2");
        // Input values for test case 2
        height = -1.0;
        diameter = 12.0;
        expResult = -1; // expected output returned value
        

        
        // call function to run test
        result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected retrun value with actual value returned
        assertEquals(expResult, result, 0.0001);      
        
        /*********************************
         * Test case #3
         ********************************/

         System.out.println("\tTest case #3");
        // Input values for test case 3
        height = 24.0;
        diameter = -1;
        expResult = -1; // expected output returned value
        

        
        // call function to run test
        result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected retrun value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /*********************************
         * Test case #4
         ********************************/

         System.out.println("\tTest case #4");
        // Input values for test case 4
        height = 24.0;
        diameter = 37.0;
        expResult = -1; // expected output returned value
        

        
        // call function to run test
        result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected retrun value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        /*********************************
         * Test case #5
         ********************************/

         System.out.println("\tTest case #5");
        // Input values for test case 5
        height = 0.0;
        diameter = 12.0;
        expResult = 0.0; // expected output returned value
        

        
        // call function to run test
        result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected retrun value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /*********************************
         * Test case #6
         ********************************/

         System.out.println("\tTest case #6");
        // Input values for test case 6
        height = 24.0;
        diameter = 0.0;
        expResult = 0; // expected output returned value
        

        
        // call function to run test
        result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected retrun value with actual value returned
        assertEquals(expResult, result, 0.0001); 
        
        /*********************************
         * Test case #7
         ********************************/

         System.out.println("\tTest case #7");
        // Input values for test case 1
        height = 24.0;
        diameter = 36.0;
        expResult = 14.1372; // expected output returned value
        

        
        // call function to run test
        result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected retrun value with actual value returned
        assertEquals(expResult, result, 0.0001); 
    }
    
}
