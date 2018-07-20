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
                backMainpMenu();
                break;
            case 7:
                System.out.println("Quit.");
        }
    }

public void goalOfGame(){System.out.println(
        "- In this game the player will assume the role of the ruler over the city Of Aaron." + 
        "\n- The player of the game will assume the role of the leader over the city of Aaron." + 
        "\n- Wheat is the staff of life, and is used as the main currency in the city." + 
        "\n- As ruler over the city, the player’s task is to manage the village’s wheat crops so" +
        "\nthat the people of the village can be adequately fed, while dealing with rats, and random" +
        "\ncrop yields." +
        "\n- The city is blessed when the people pay their tithes and offerings." +
        "n- After serving for 10 years, the player will be judged by the people." + 
        "n- If too many people die during the player’s term of office, the player is removed from" +
        "\noffice and the game ends.");}

public void whereIsTheCity(){System.out.println(
        "\nCity of Aaron where on the valley next to City of Amonia City. " +
        "\nShows where is the city of Aaron" + 
        "\nFarmland that provide provisions to City of Aaron’s population." +
        "\nThe fountain that help people and animals to get water and quench thirst." +
        "\nWithout the fountain all live in the valley they would all be dead." +
        "\nWe have too pasture that shapers provide provisions to sheep." +
        "\nAnd in the valley we have a forest that is the border of the Lamanites" +
        "\nland and we maintain a army to defend us from Lamanites.");}

public void howToviewTheMap(){System.out.println(
        "\nTo view the map please follow the instruction bellow:" +
        "\nChose option 1 in the Main Menu, after that you should choose" +
        "\noptions 1 to view the map.");}

public void howToMoveLocation(){System.out.println(
        "\nChose option 1 in the Main Menu, after that you should choose " +
        "\noption 3 to move to another location. Shows how do I move to another location");}

public void howToDisplayStorehouse(){System.out.println(
        "\"Chose option 1 in the Main Menu, after that you should choose " +
        "\noption 2 to move to List Menu and in this menu you should choose between those options:\n" +
        "1 – to view develop team, \n" +
        "2 – to view a list of animals, \n" +
        "3 – to view a list of tools, and option \n" +
        "4 – to view a list of provisions.");}

public void backMainpMenu(){
           MainMenuView mmv = new MainMenuView();
           mmv.displayMenu();

}
}
