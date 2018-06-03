// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Nefi, Vinicius and Marcus
// Date last modified: May 2018
//-------------------------------------------------------------

package buyi.cit260.curiousworkmanship.control;

import byui.cit260.curiousWorkmanship.model.CropData;

/**
 *
 * @author MARCUS VILARONGA
 */
public class CropControl {
    // The sellLand method
    // Purpose: To sell land
    // Parameters: the price of land, the number of acres to sell, and
    //    a reference to a CropData object
    // Returns: the number of acres owned after the sale
    // Pre-conditions: acres to sell must be positive
    // and <= acresOwned

    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    {
        //if acresToSell < 0, return -1
        if(acresToSell < 0)
              return -1;

        //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if(acresToSell > owned)
             return -1;

        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);

        //wheatInStore = wheatInStore + acresToSell * landPrice
        int wheat = cropData.getWheatInStore();
        wheat+= (acresToSell * landPrice);
        cropData.setWheatInStore(wheat);

        //return acresOwned
        return owned;

    }

        // The plantCrops method
    // Purpose: To plant crops
    // Parameters: the number of acres want to plant, the number of acres owned, and
    //    the number of bushels of wheat stocked
    // Returns: the number of wheat in store minus the number of wheat planted
    // Pre-conditions: the number of wheat in store minus the number of acres that 
    //    you want plant times two (You can plant 2 acres with one bushel of wheat)    
    public static int plantCrops(int acresToPlant, CropData cropData) {
    
        // acresToPlant < 0, return -1
        if(acresToPlant < 0)
              return -1;

        // acresOwned  < acresToPlant,  return -1
        int owned = cropData.getAcresOwned();
        if(owned < acresToPlant)
             return -1;
        
        // wheatInStore < (acresToPlant / 2), -1
        int store = cropData.getWheatInStore();
        if(store <= (acresToPlant / 2))
             return -1;
        
        // Calculate the number of bushels required to plant the crops
        int bushelsByAcre = (int)(acresToPlant / 2);
        store -= bushelsByAcre;
        
        // Updating game state
        cropData.setWheatInStore(store);
        cropData.setAcresPlanted(acresToPlant);

        // return wheatInStore -= (acresToPlant * bushelsByAcre)
        return store;
        
}
        
}
