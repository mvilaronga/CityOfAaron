/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.curiousworkmanship.view;

import buyi.cit260.curiousworkmanship.model;
import buyi.cit260.curiousworkmanship.control;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author MARCUS VILARONGA
 */
public class CropView {
    
    private static Scanner keyboard = new Scanner(System.in);   
    private static Game theGame = CityOfAaron.getCurrentGame();
    private static CropData cropData = theGame.getCropData();

    // The runCropsView method()
    // Purpose: runs the Hamurabi game
    // Parameters: none
    // Returns: none
    public static void runCropsView()
    {
    // call the buyLandView( ) method
    buyLandView( );
    // add calls to the other crop view methods
    // as they are written
    }


    


    
}
