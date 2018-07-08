 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.curiousworkmanship.view;

import buyi.cit260.curiousworkmanship.control.CropControl;
import byui.cit260.curiousWorkmanship.model.CropData;
import byui.cit260.curiousWorkmanship.model.Game;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import exceptions.CropException;

/**
 *
 * @author Marcus Vilaronga and Nefi Nuñez
 */
public class CropView {
    
    private static Scanner keyboard = new Scanner(System.in);
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCropData();
    
   
    public static void runCropsView() {
        
        buyLandView();

        
        
        
    }
    

    public static void buyLandView() {
        
        int price = CropControl.calcLandPrice();
       
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        
        int toBuy = 0;
        boolean paramsNotOkay; 
        do {
            try {
                paramsNotOkay = false;
                System.out.print("How many acres of land do you wish to buy?");
                toBuy = keyboard.nextInt();            
                CropControl.buyLand(price, toBuy, cropData);
                if (toBuy == 50) {
                    throw new CropException("Please select more acres");
                }
            }
            catch (CropException e) {
                System.out.println("I am sorry master, I cannot do this."); 
                System.out.println(e.getMessage());
                paramsNotOkay = true; 
            }
       
        } while(paramsNotOkay); 
          CropControl.buyLand(price, toBuy, cropData);
    }
    
    public static void sellLandView() {
        
       
        int price = CropControl.calcLandPrice();
    
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("How many acres of land do you wish to sell?");
        int toSell;
        toSell = keyboard.nextInt();
        CropControl.sellLand(price, toSell, cropData);
    }
    
    public static void feedPeopleView() throws CropException{
        
      
        int wheat = cropData.getWheatInStore();
        System.out.format("There are %d bushels of wheat in store.%n", wheat); 
        System.out.print("How much wheat would you like to give to the people?");
        int wheatForPeople = keyboard.nextInt(); 
        CropControl.feedPeople(wheatForPeople, cropData); 
        
    }
    
    public static void plantCropsView() throws CropException {
        
        int price = CropControl.calcLandPrice();
       
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        
        int acresToPlant = 0;
        boolean paramsNotOkay; 
        do {
            try {
                paramsNotOkay = false;
                System.out.print("How many acres of land do you want to plant?");
                acresToPlant = keyboard.nextInt();            
                CropControl.plantCrops(acresToPlant, cropData);
                if (acresToPlant == 0) {
                    throw new CropException("Please select more acres");
                }
            }
            catch (CropException e) {
                System.out.println("I am sorry master, I cannot do this."); 
                System.out.println(e.getMessage());
                paramsNotOkay = true; 
            }
       
        } while(paramsNotOkay); 
          CropControl.plantCrops( acresToPlant, cropData);
    }
}