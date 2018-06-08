
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
     * Test of feedPeople method, of class FeedPeople.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int wheatReserved;
        int expResult;
        
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
     
       // --- Test case 1 ---
        System.out.println("\tTest case 1");
        CropData thePeople = new CropData();
        thePeople.setWheatInStore(120);
        thePeople.setBushelsOwned(80);
        
        // define the input variables
        wheatReserved = 10;
        expResult = 20;
        
        // call the method
         int result = CropControl.feedPeople(wheatReserved, thePeople);
        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 2 ---
        System.out.println("\tTest case 2");
        thePeople.setWheatInStore(500);
        thePeople.setBushelsOwned(300);
        
        // define the input variables
        wheatReserved = -25;
        expResult = -1;
        
        // call the method
        result = CropControl.feedPeople(wheatReserved, thePeople);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        


        // --- Test case 3 ---
        System.out.println("\tTest case 3");
        thePeople.setWheatInStore(500);
        thePeople.setBushelsOwned(150);
        
        // define the input variables
        wheatReserved = 40;
        expResult = -1;
        
        // call the method
        result = CropControl.feedPeople(wheatReserved, thePeople);

        
        // test to see if the result returned equals the expected result
        assertEquals(expResult, result);
        

        // --- Test case 4 ---
        System.out.println("\tTest case 4");
        thePeople.setWheatInStore(200);
        thePeople.setBushelsOwned(100);
        
        // define the input variables
        wheatReserved = 65;
        expResult = -1;
        
        // call the method
        result = CropControl.feedPeople(wheatReserved, thePeople);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);
        
        // --- Test case 5 ---
        System.out.println("\tTest case 5");
        thePeople.setWheatInStore(150);
        thePeople.setBushelsOwned(100);
        
        // define the input variables
        wheatReserved = 120;
        expResult = 60;
        
        // call the method
        result = CropControl.feedPeople(wheatReserved, thePeople);
        
        // test to see if the result returnet equals the expected result
        assertEquals(expResult, result);


     }
    
}