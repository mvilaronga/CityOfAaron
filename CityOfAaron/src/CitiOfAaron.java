/*
* The main() class file for the cityOfAaron project
* CIT-260
* Spring 2018
*  Team members: Nefi Garcia and Marcus Vilaronga
*/
package citiofaaron;

import byui.cit260.curiousWorkmanship.model.Location;
import byui.cit260.curiousWorkmanship.model.Player;
import View.*;


public class CitiOfAaron {
 
    // variable for keeping a reference to the Game object
    private static Game theGame = null;

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CitiOfAaron.theGame = theGame;
    }

    
     


       
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
        
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();       
        
            
        Player playerOne = new Player();
        Location locationOne = new Location();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setTime(7.00);
        
        System.out.println(playerOne.toString());
        
        locationOne.setDescription("Idaho");
        locationOne.setSymbol("ID");
        
        System.out.println(playerOne.toString());
        
        
        
    }
    
}
