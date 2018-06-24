
package buyi.cit260.curiousworkmanship.view;

import java.util.Scanner;


/**
 *
 * @author Nefi Nuñez
 */
public class GameMenuView extends MenuView {
    
     Scanner keyboard = new Scanner(System.in);

    
    
     // private classes to help manage the menu

        
        public GameMenuView()
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
 
        
     
    
    
    
// The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
 
    
    
            
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
