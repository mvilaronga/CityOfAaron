/*
* The main() class file for the cityOfAaron project
* CIT-260
* Spring 2018
*  Team members: Nefi Garcia and Marcus Vilaronga
*/
package cityofaaron;

import buyi.cit260.curiousworkmanship.view.MainMenuView;
import byui.cit260.curiousWorkmanship.model.Location;
import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CityOfAaron {
    
    

    // variable for keeping a reference to the Game object
    private static Game theGame = null;

    
    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }

    
     


       
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
        
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();       
        
            
        Player playerOne = new Player();
        Location locationOne = new Location();
        
        playerOne.setName("Fred Flintstone");
       
        
        System.out.println(playerOne.toString());
        
        locationOne.setDescription("Idaho");
        locationOne.setSymbol("ID");
        
        System.out.println(playerOne.toString());
        
        
        
    }
    
}
