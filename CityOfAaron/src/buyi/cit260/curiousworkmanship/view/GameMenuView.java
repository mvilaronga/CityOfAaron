
package buyi.cit260.curiousworkmanship.view;

import exceptions.CropException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


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
                    "* CITY OF AARON: GAME MENU  *\n" +
                    "**********************************\n" +
                    " 1 - View the map\n" +
                    " 2 - View/Print a list\n" +
                    " 3 - Move to a new location\n" +
                    " 4 - Manage the Crops\n" +
                    " 5 - Save the Game\n" +
                    " 6 - Return to the Main menu\n",
                6);
} 
 
   
    
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
            case 4: {
                   try {
                       // manage crops
                       manageCrops();
                   } catch (CropException ex) {
                       Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
                break;
            case 5: // manage crops
                saveGame();
                break;
            case 6:
                displayMenuView();
        }
    }
     
    public void viewMap(){System.out.println("\n View map selected");}

    // The viewList() method
    // Purpose: Creates a ViewList object and calls its
    //    displayMenuView ( ) method       
    // Parameters: none
    // Returns: none
    public void viewList(){
    {
        ListView lv = new ListView();
        lv.displayMenu();
    } 
}
    public void moveToNewLocation(){System.out.println("\n Move to new location selected");}
        public void saveGame(){System.out.println("\n Saving game");}
    public void manageCrops() throws CropException{
        CropView.runCropsView();}

    public void displayMenuView() {
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();

    }




    


}   
