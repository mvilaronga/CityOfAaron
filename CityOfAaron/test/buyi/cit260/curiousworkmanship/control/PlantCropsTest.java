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
public class PlantCropsTest {
    
    public PlantCropsTest() {
    }

    /**
     * Test of plantCrops method, of class PlantCrops.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(300);
        
        // define the input variables
        int acresToPlant = 200;
        int expResult = 100;
        
        // call the method
        int result = PlantCrops.plantCrops(acresToPlant, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(300);
        
        // define the input variables
        acresToPlant = -50;
        expResult = -1;
        
        // call the method
        result = PlantCrops.plantCrops(acresToPlant, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        


        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(150);
        
        // define the input variables
        acresToPlant = 200;
        expResult = -1;
        
        // call the method
        result = PlantCrops.plantCrops(acresToPlant, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        

        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        theCrops.setWheatInStore(100);
        theCrops.setAcresOwned(300);
        
        // define the input variables
        acresToPlant = 200;
        expResult = -1;
        
        // call the method
        result = PlantCrops.plantCrops(acresToPlant, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(200);
        
        // define the input variables
        acresToPlant = 200;
        expResult = 100;
        
        // call the method
        result = PlantCrops.plantCrops(acresToPlant, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);


                // --- Test case 6 ---
        System.out.println("\tTest case 6");
        theCrops.setWheatInStore(0);
        theCrops.setAcresOwned(200);
        
        // define the input variables
        acresToPlant = 0;
        expResult = 0;
        
        // call the method
        result = PlantCrops.plantCrops(acresToPlant, theCrops);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);

    }
    
}
