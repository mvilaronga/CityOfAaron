/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.curiousworkmanship.control;

import byui.cit260.curiousWorkmanship.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MARCUS VILARONGA
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(100);
        theCrops.setAcresOwned(500);
        
        // define the input variables
        int acresToSell = 50;
        int landPrice = 25;
        
        int expResult = 450; // define the expected output variable
        
        // call the method
        int result = CropControl.sellLand(landPrice, acresToSell, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
       
 
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        theCrops.setWheatInStore(100);
        theCrops.setAcresOwned(500);
        
        // define the input variables
        acresToSell = -13;
        landPrice = 35;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = CropControl.sellLand(landPrice, acresToSell, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        theCrops.setWheatInStore(100);
        theCrops.setAcresOwned(500);
        
        // define the input variables
        acresToSell = 600;
        landPrice = 30;
        
        expResult = -1; // define the expected output variable
        
        // call the method
        result = CropControl.sellLand(landPrice, acresToSell, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        theCrops.setWheatInStore(100);
        theCrops.setAcresOwned(400);
        
        // define the input variables
        acresToSell = 400;
        landPrice = 30;
        
        expResult = 0; // define the expected output variable
        
        // call the method
        result = CropControl.sellLand(landPrice, acresToSell, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);    
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        theCrops.setWheatInStore(100);
        theCrops.setAcresOwned(200);
        
        // define the input variables
        acresToSell = 0;
        landPrice = 33;
        
        expResult = 200; // define the expected output variable
        
        // call the method
        result = CropControl.sellLand(landPrice, acresToSell, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result); 
        
    }
    
}
