
package buyi.cit260.curiousworkmanship.view;



import byui.cit260.curiousWorkmanship.model.CropData;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.Game;
import byui.cit260.curiousWorkmanship.model.CropData;


public class MainMenuView extends MenuView
 {
    
        Scanner keyboard = new Scanner(System.in);
        
        private String theMenu;
        private int max;
        CropData cropData = new CropData();



           
        // The MainMenuView constructor
        // Purpose: Initialize the menu data
        // Parameters: none
        // Returns: none
        // ===================================
        
        public MainMenuView()
        {
        super( "\n"+
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n", 
                5);
        }


    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //               selected action
    // Parameters: none
    // Returns: none
    // ========================================================= 
    public void displayMenuView()
    {
        int menuOption;
        do
        {


        // Display the menu
        System.out.println(theMenu);
    
        // Prompt the user and get the user’s input
        menuOption = getMenuOption();

        // Perform the desired action
        doAction(menuOption);

        // Determine and display the next view
    } while (menuOption != max);
    }
        
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    
        // The doAction method
        // Purpose: performs the selected action
        // Parameters: none
        // Returns: none
        // ===================================
        @Override public void doAction(int option)
        {
            switch(option)
            {
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
            }
        }
        

        
        // The startSavedGame method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================     
        public void startSavedGame()
        {
            System.out.println("\nStart save game option selected.");
        }
        
        // The displayHelpMenuView method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================     
        public void displayHelpMenuView()
        {
            System.out.println("\nDisplay help menu option selected.");
        }

        // The displaySaveGameView method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================     
        public void displaySaveGameView()
        {
            System.out.println("\nDisplay save game menu option selected.");
        }        
        
        
        // The startNewGame method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        // ===================================
        public void startNewGame()
        {
        //Create a new Game object.
        Game theGame = new Game();

        // Save a reference to it in the GameProject class.
        CityOfAaron.setTheGame(theGame);
        
        // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron.");
        
        // Create a new Player object
        Player thePlayer = new Player();

        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();

        // Save the user’s name in the Player object
        thePlayer.setName(name);

        // Save a reference to the player object in the Game object
        theGame.setPlayer(thePlayer);

        // Display a welcome message
        System.out.println("\nWelcome “ + name + “ have fun.");

        // Display the Game menu

        // initialize it
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000); 

        // save a reference to it in the Game 
        theGame.setCrop(cropData);

        
        }    


    
    }

