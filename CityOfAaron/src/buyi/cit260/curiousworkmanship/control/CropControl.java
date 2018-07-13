// The CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Nefi, Vinicius and Marcus
// Date last modified: May 2018
//-------------------------------------------------------------

package buyi.cit260.curiousworkmanship.control;
import exceptions.CropException;
import byui.cit260.curiousWorkmanship.model.CropData;
import byui.cit260.curiousWorkmanship.model.Game;

import java.util.Random;

/**
 *
 * @author Marcus Vilaronga and Nefi Nuñez
 */
public class CropControl {
     // The sellLand method
    // Purpose: To sell land
    // Parameters: the price of land, the number of acres to sell, and
    //    a reference to a CropData object
    // Returns: the number of acres owned after the sale
    // Pre-conditions: acres to sell must be positive
    // and <= acresOwned
    
    // Variables
    
    private static Game theGame;
    private static CropData cropData;
      
    // Constructors

    public CropControl() {
    }
        
    public static int calcLandPrice(int min, int max) {
        
        // Random number generator
        Random random = new Random();
        // Generate random number using parameters
        int landPrice = random.nextInt(max) + min;
        // Return result
        return landPrice;
    }
    
    public static int calcLandPrice() {
  
        Random random = new Random(); 
         //constants
        int LAND_BASE = 17; 
        int LAND_RANGE = 10; 
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        
        return landPrice;
    }
    
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
        try {
            
            int totalPrice = acresToBuy * landPrice;
                
            // if acresToBuy < 0, ERROR
            if (acresToBuy < 0) { 
                throw new CropException("A negative value was input.");  
               }
        
            // if wheatInStore < totalPrice, ERROR
            if (cropData.getWheatInStore() < totalPrice) { 
                throw new CropException("There is insufficient wheat to buy this much land."); 
            }
        
            // if population <= (oldAcres + newAcres) / 10, ERROR
            if ((cropData.getPopulation() * 10) < (cropData.getAcresOwned() + acresToBuy)) { 
                throw new CropException("The population is not large enough to buy this much land.");  
            }
        
            if (acresToBuy == 0) { return cropData.getAcresOwned(); }
        
            else {
                // else, add number of acres purchased to acres owned
                cropData.setAcresOwned(cropData.getAcresOwned() + acresToBuy);
        
                // subtract price from WheatInStore
                cropData.setWheatInStore(cropData.getWheatInStore() - totalPrice);
        
                // return new acresOwned Value
                return cropData.getAcresOwned();
                //return cropData.getAcresOwned();
            }
        }
        // There needs to be a catch here
        catch (CropException e) {
            System.out.println("I am sorry master, I cannot do this.");
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static int sellLand(int landPrice, int acresToSell, CropData cropData) {
        
        // acresOwned Variable
        int acresOwned = cropData.getAcresOwned();
        
        // if acresToSell < 0, return -1
        if (acresToSell < 0)
            return -1; 
        
        // if acresToSell > acresOwned, return -1
        if (acresToSell > acresOwned)
            return -1;
        
        // acresOwned - acresToSell
        acresOwned -= acresToSell;
        
        // save the new acresOwned amount            
        cropData.setAcresOwned(acresOwned);
        
        // wheatInStore = wheatInStore + (acresToSell * landPrice)
        int wheatInStore = cropData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
       
        // save result to wheatInStore
        cropData.setWheatInStore(wheatInStore);
         
        // return acresOwned
        return cropData.getAcresOwned(); 
    }
    
 
    public static void feedPeople(int wheatForPeople, CropData cropData) throws CropException {
        
        int wheatInStore = cropData.getWheatInStore(); 
        
        if (wheatForPeople < 0) {
            throw new CropException("Input cannot be a negative number.");
        }
        
        if (wheatInStore < wheatForPeople) {
            throw new CropException("You cannot allocate more wheat than you own.");
        }     
        
        wheatInStore -= wheatForPeople; 
        cropData.setWheatInStore(wheatInStore);
        cropData.setWheatForPeople(wheatForPeople);

    }
    
        public static int plantCrops(int acresToPlant, CropData cropData) throws CropException
{
        
        int acresOwned = cropData.getAcresOwned(); 
        int wheatInStore = cropData.getWheatInStore();
        int bushelsByAcre = (int)(acresToPlant / 2);
    
        if (acresToPlant < 0) { 
            throw new CropException("A negative value was input, try ");
        }
        
        if (acresToPlant > acresOwned) { 
            throw new CropException("You own less acres than you want to plant"); 
        } 
        
        if ((acresToPlant / bushelsByAcre) <= wheatInStore) {
            int wheatRequired = bushelsByAcre; 
            wheatInStore -= wheatRequired;
            cropData.setWheatInStore(wheatInStore);
            
        }
        return cropData.getWheatInStore();
    }

    // getters and setters


    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CropControl.theGame = theGame;
    }

    public static CropData getCropData() {
        return cropData;
    }

    public static void setCropData(CropData cropData) {
        CropControl.cropData = cropData;
    }
    

    @Override
    public String toString() {
        return "CropControl{" + '}';
    }
    
    
}
