/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.curiousworkmanship.view;

import java.util.Scanner;

/**
 *
 * @author MARCUS VILARONGA
 */
public class HelpMenuView extends MenuView  {
    
    Scanner keyboard = new Scanner(System.in);
    
     // private classes to help manage the menu
     private String helpMenu;
     private int max;
     
    
                   public HelpMenuView()
{
        super ("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - What are the goals of the game?\n" +
                   " 2 - Where is the city of Aaron?\n" +
                   " 3 - How do I view the map?\n" +
                   " 4 - How do I move to another location?\n" +
                   " 5 - How do I display a list of animals, provisions and\n" +
                   "tools in the city storehouse?\n" +
                   " 6 - Back to the Main Menu.\n" +
                   " 7 - Quit\n",
        
                7);
} 
                   
         
     @Override public void doAction(int option)
    {
               switch(option)
        {
            case 1: // View goalOfGame
                goalOfGame();
                break;
            case 2: // view whereIsTheCity
                whereIsTheCity();
                break;
            case 3: // move to map
                howToviewTheMap();
                break;
            case 4: // howToMoveLocation
                howToMoveLocation();
                break;
            case 5: // howToMoveLocation
                howToMoveLocation();
                break;
            case 6:   // the program will return to the main menu here
                backHelpMenu();
                break;
            case 7:
                System.out.println("Quit.");
        }
    }

public void goalOfGame(){System.out.println("\n Shows goals of the game");}
public void whereIsTheCity(){System.out.println("\n Shows where is the city of Aaron");}
public void howToviewTheMap(){System.out.println("\n Shows the map");}
public void howToMoveLocation(){System.out.println("\n Shows how do I move to another location");}
public void howToDisplayStorehouse(){System.out.println("\n Shows How do I display a list of animals, provisions and tools in the city storehouse");}
public void backHelpMenu(){System.out.println("\n Back to the Help Menu");}
}
