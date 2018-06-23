
package buyi.cit260.curiousworkmanship.view;

import java.util.Scanner;


/**
 *
 * @author Nefi Nuñez
 */
public abstract class GameMenuView implements ViewInterface {
    
     Scanner keyboard = new Scanner(System.in);

    
    
     // private classes to help manage the menu
     private String gameMenu;
     private int max;
      
     
     
     
     
    
          @Override public void displayMenu()
    {
        
        GameMenuView theGame = new GameMenuView();
         int menuOption = 0;
            do
            {

            //Display the Menu
                 System.out.println(gameMenu);

            //Prompt for input
                menuOption = getMenuOption(); 


            //Perform actions

                   doAction(menuOption);


            //Determine next view
            }  while (menuOption != max);     
    }

        
        
        
    
        
          public GameMenuView()
{
        gameMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n";
        
        max = 5;
} 
 
        
     
    
    
    
// The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
 
    
    
      @Override public int getMenuOption() {
    // The getMenuOption method
    int userInput;
    // begin loop
        do{
            // get user input from the keyboard
            userInput = keyboard.nextInt();

            // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > max)
            {
                System.out.println("\noption must be between 1 and " + max);
            } 
            return userInput;
            }while(userInput < 1 || userInput > max);
        
        }
            
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
        

    
    
    
        @Override public void doAction(int option)
    {
               switch(option)
        {
            case 1: // View Map
                viewMap();
                break;
            case 2: // view list
                viewList();
                break;
            case 3: // move to new location
                moveToNewLocation();
                break;
            case 4: // manage crops
                manageCrops();
                break;
            case 5:
                System.out.println("Game Over.");
        }
    }
     
public void viewMap(){System.out.println("\n View map selected");}
public void viewList(){System.out.println("\n View list selected");}
public void moveToNewLocation(){System.out.println("\n Move to new location selected");}
public void manageCrops(){System.out.println("\n Manage crops selected");}


}   
