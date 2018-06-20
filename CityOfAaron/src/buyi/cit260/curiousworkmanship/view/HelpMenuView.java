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
public class HelpMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    
     // private classes to help manage the menu
     private String helpMenu;
     private int max;
     
         public void displayMenuView()
    {
        
        HelpMenuView hmv = new HelpMenuView();    // create a HelpMenuView object
        hmv.displayMenuView();

        
        HelpMenuView theGame = new HelpMenuView();
         int menuOption = 0;
            do
            {

            //Display the Menu
                 System.out.println(helpMenu);

            //Prompt for input
                menuOption = getMenuOption(); 


            //Perform actions

                   doAction(menuOption);


            //Determine next view
            }  while (menuOption != max);     
    }

                   public HelpMenuView()
{
        helpMenu = "\n" +
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
                   " 7 - Quit\n";
        
        max = 7;
} 
                   
    public int getMenuOption() {
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
         
     public void doAction(int option)
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
