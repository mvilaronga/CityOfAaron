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
 * @author Nefi Nuñez
 */
public class FeedPeopleTest {
    public FeedPeopleTest() {
}
      /**
     * Test of feedpeople method, of class Brushels.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedpeople");
        
        // --- Test case 1 ---
        System.out.println("\tTest case 1");
        CropData thePeople = new CropData();
        thePeople.setWheatInStore(120);
        thePeople.setTotalBrushels(80);
        
        // define the input variables
        int totalBrushels = 160;
        int expResult = 80;
        
        // call the method
        int result = FeedPeople.totalbrushels(wheatreserved, totalpeople);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        thePeople.setWheatInStore(500);
        thePeople.setTotalBrushels(300);
        
        // define the input variables
        totalBrushels = -25;
        expResult = -1;
        
        // call the method
        result = FeedPeople.feedPeople(totalBrushels, totalPeople);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        


        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        thePeople.setWheatInStore(500);
        thePeople.setTotalBrushels(150);
        
        // define the input variables
        totalBrushels = 40;
        expResult = -1;
        
        // call the method
        result = FeedPeople.feedPeople(totalBrushels, totalPeople);

        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        

        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        thePeople.setWheatInStore(100);
        thePeople.setTotalBrushels(300);
        
        // define the input variables
        totalBrushels = 65;
        expResult = -1;
        
        // call the method
        result = FeedPeople.feedPeople(totalBrushels, totalPeople);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        thePeople.setWheatInStore(160);
        thePeople.setTotalBrushels(95);
        
        // define the input variables
        totalBrushels = 120;
        expResult = 60;
        
        // call the method
        result = FeedPeople.feedPeople(totalBrushels, totalPeople);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);


  

    }
    
}
