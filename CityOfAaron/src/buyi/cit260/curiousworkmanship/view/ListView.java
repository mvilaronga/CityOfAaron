/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.curiousworkmanship.view;

import buyi.cit260.curiousworkmanship.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Marcus Vilaronga and Nefi Nuñez
 */
public class ListView extends MenuView {

       Scanner keyboard = new Scanner(System.in);
       
       // private classes to help manage the menu
       
       public ListView() {
       
       super("\n" +
                   "**********************************\n"+
                   " CITY OF AARON:      LIST MENU  *\n"+
                   "**********************************\n" +
                   " 1 - View the development team\n"+
                   " 2 - View a list of animals\n"+
                   " 3 - View a list of tools\n" +
                   " 4 - View a list of provisions\n"+
                   " 5 - Return to the game menu\n",
               5);
    
       }
    
       @Override public void doAction(int option) {
               switch(option)
        {
            case 1: // View Map
                displayDevTeam();
                break;
            case 2: // view list
                displayAnimalList();
                break;
            case 3: // move to new location
                displayToolList();
                break;
            case 4: // manage crops
                displayProvisionList();
                break;
            case 5:
                System.out.println("Returning to the Game Menu.");
        }
    }
       
       public void displayDevTeam(){System.out.println("\n List of Developers:\n" +
                                                       " Nefi Garcia" +
                                                       " Marcus Vilaronga");}
       
       
       public void displayAnimalList(){System.out.println("\n View a list of animals:\n" +
                                                          " Chickens, sheeps, dogs and ducks");}
       
       
       public void displayToolList(){System.out.println("\n View a list of tools:\n" +
                                                          " plow beam, curry-comb, digging-fork\n" +
                                                          " and garden hammer");}
       
       
       public void displayProvisionList(){System.out.println("\n View a list of provisions:\n" +
                                                          " Hay, wheat, beans and rice");}

    void displayMenuView() {
           MainMenuView mmv = new MainMenuView();
           mmv.displayMenu();

    }
       
public void viewProvisions() {
        System.out.println("Show Provisions Selected");
        GameControl.showProvisionsList(); 
    }
    
    public void saveAnimals() {
        System.out.println("Save Animal List Selected");
        GameControl.saveAnimalList(); 
        
    }
}
