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

/**
 *
 * @author MARCUS VILARONGA
 */
public class CropView {
    
    private static Scanner keyboard = new Scanner(System.in);   
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCropData();

public static void buyLandView( ) {
        
    int price = CropControl.calcLandCost();
    System.out.format("Land is selling for %d bushels per acre.%n" + price);
    int toBuy;
    boolean paramsNotOkay;
    do
    {
       paramsNotOkay = false;
       System.out.print("\nHow many acres of land do you wish to buy? ");  
       toBuy = keyboard.nextInt();
       try
       {
            CropControl.buyLand(theCrop, toBuy, price);
        }
        catch(CropException e)
        {
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             paramsNotOkay = true;
        }
        } while(paramsNotOkay);
}

    // The runCropsView method()
    // Purpose: runs the Hamurabi game
    // Parameters: none
    // Returns: none
    public static void runCropsView()
    {

    }

    
}
