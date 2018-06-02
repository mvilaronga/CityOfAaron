// The PlantCrops class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Marcus Vilaronga
// Date last modified: June 1, 2018
//-------------------------------------------------------------

    
package buyi.cit260.curiousworkmanship.control;

import byui.cit260.curiousWorkmanship.model.CropData;


public class PlantCrops {
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
        
        // wheatInStore > (acresToPlant * 2), -1
        int store = cropData.getWheatInStore();
        int bushelsByAcre = (acresToPlant * 2);
        if(store < bushelsByAcre)
             return -1;
        
        // return wheatInStore -= (acresToPlant * bushelsByAcre)
        return (store -= bushelsByAcre);
        
}
}
