
package buyi.cit260.curiousworkmanship.view;

import java.util.Scanner;
import buyi.cit260.curiousworkmanship.view.CropView;

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
                    " 5 - Return to the Main menu\n",
                5);
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
            case 4: // manage crops
                manageCrops();
                break;
            case 5:
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
    public void manageCrops(){System.out.println("\n Manage crops selected");}

    public void displayMenuView() {
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();

    }




    


}   
