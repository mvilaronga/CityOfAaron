

package buyi.cit260.curiousworkmanship.view;



import byui.cit260.curiousWorkmanship.model.CropData;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import byui.cit260.curiousWorkmanship.model.Player;
import buyi.cit260.curiousworkmanship.control.GameControl;
import byui.cit260.curiousWorkmanship.model.CropData;

/**
 *
 * @author Marcus Vilaronga and Nefi Nuñez
 */


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
        
        // The doAction method
        // Purpose: performs the selected action
        // Parameters: none2
    
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
        // Purpose: loads a saved game object from disk and start the game
        // Parameters: none
        // Returns: none
        // =================================== 
        public void startSavedGame() {
        System.out.println("Start Saved Game option Selected");
        
        Scanner input = new Scanner(System.in);    

        // get rid of nl character left in the stream
        input.nextLine();
        // prompt user to get a file path
        System.out.println("File path of the game wanted: ");
        String fileName;
        fileName = input.nextLine();
        // call the getSavedGame( ) method in the GameControl class to load the game
        GameControl gc = new GameControl();
        GameControl.getSavedGame(fileName);

        // display the game menu for the loaded game
        GameMenuView gm = new GameMenuView();
        gm.displayMenu();
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
               // Show banner page
        System.out.println(
            "\n********************************************************\n"+
            "* Welcome to the City of Aaron. You have been summoned *\n" +
            "* by the High Priest to assume your role as ruler of   *\n" +
            "* the city. Your responsibility is to buy land, sell   *\n" +
            "* land, determine how much wheat to plant each year,   *\n" +
            "* and how much to set aside to feed the people. You     *\n" +
            "* will also be required to pay an annual tithe on the  *\n" +
            "* that is harvested. If you fail to provide      *\n" +
            "* enough wheat for the people to eat, people will die  *\n" +
            "* and your workforce will be diminished. Plan very     *\n" +
            "* carefully or you may find yourself in trouble with   *\n" +
            "* the people. And oh, watch out for plagues and rats!  *\n" +
            "********************************************************\n"); 
        
        // Get player name, create player object, and save it in the Game
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
                    
        // welcome message
        System.out.println("\nWelcome " + name + ", have fun playing.");
        
        // call the createNewGame( ) method. Pass the name as a parameter
         GameControl.createNewGame(name);
        
        //show the game menu
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenuView();

        }    

    public void displayHelpMenuView() {
        System.out.println("Display Help Menu View option Selected");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }
    
    }
