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
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }
    
    public static void main(String[] args) {
        
        try {
        CityOfAaron.inFile = new BufferedReader(new InputStreamReader(System.in));
        
        CityOfAaron.outFile = new PrintWriter(System.out, true);
    }
        catch(Throwable e) {
            // output error message
            System.out.println("Exception: " + e.toString() +
                               "\nCause:   " + e.getCause() +
                               "\nMessage: ") + e.getMessage());
            e.printStackTrace();;
        }
        finally
        {
            try {
                if (CityOfAaron.inFile != null)
                CityOfAaron.inFile.close();
                
                if (CityOfAaron.outFile != null)
                CityOfAaron.outFile.close();
            } catch (IOException ex) {
                Logger.getLogger(CityOfAaron.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // if(output != null) close the file
         }

    }
    
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
