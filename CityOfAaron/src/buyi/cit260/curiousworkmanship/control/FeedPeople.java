
package buyi.cit260.curiousworkmanship.control;

import byui.cit260.curiousWorkmanship.model.CropData;
/**
 *
 * @author Nefi Nuñez
 */
public class FeedPeople {
//The feedPeople method
//Purpose: feed people 
// Parameters: bushels of grain, wheat in storage 
// reference to wheat reserved object 
// Returns: the number of wheat reserved to give to people 
// Pre-conditions: wheat to give should be positive 
// and <= the number of wheat in storage 



public static int feedPeople(int peopleFed, CropData cropData)
 { 

       // peopleFed < 0, return -1
        if(peopleFed < 0)
              return -1;

        // bushelsForPeople  < peopleFed,  return -1
        int owned = cropData.getWheatForPeople();
        if(owned < peopleFed)
             return -1;
        
        // wheatInStore < (peopleFed *4), -1
        int store = cropData.getWheatInStore();
        if(store <= (peopleFed *4))
             return -1;
        
        // Calculate the number of bushels required to plant the crops
        int bushelsByAcre = (int)(peopleFed * 2);
        store -= bushelsByAcre;
        
        // Updating game state
        cropData.setWheatInStore(store);
        cropData.setAcresPlanted(peopleFed);

        // return wheatInStore -= (peopleFed * bushelsByAcre)
        return store;

 }
}