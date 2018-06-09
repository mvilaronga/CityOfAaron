// The MainMenuView class - part of the view layer
// Object of this class manage the main menu
// Author: Jones, Smith, Brown team
// Date last modified: January 2018
//-------------------------------------------------------------

package buyi.cit260.curiousworkmanship.view;



import java.util.Scanner;
import cityofaaron.cityofaaron;
import buyi.cit260.curiousworkmanship.model.Player;

public class MainMenuView {
    
        Scanner keyboard = new Scanner(System.in);
        
        private String theMenu;
        private int max;
        
           
        theMenu = "\n" +
            "****************************\n" +
            "  CITY OF AARON: Main Game Menu  " +
            "****************************\n" +
            " 1 - Start an new game\n" +
            " 2 - Continue a saved game\n" +
            " 3 - How to play\n" +
            " 4 - Save game\n" +
            " 5 - Quit\n";
        max = 5;



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

        
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption()
    {
        // declare a variable to hold user’s input
        int userInput;

        // begin loop
        do
        {

        // get user input from the keyboard
        userInput = keyboard.nextInt();

        // if it is not a valid value, output an error message
        if(userInput < 1 || userInput > max)
        {
            System.out.println("\noption must be between 1 and " + max);
        }
        
        
        // loop back to the top if input was not valid
        } while(userInput < 1 || userInput > max);

        // return the value input by the user
        return userInput;

    }
    
    }
}
