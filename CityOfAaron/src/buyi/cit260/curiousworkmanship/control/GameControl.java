/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.curiousworkmanship.control;


import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import byui.cit260.curiousWorkmanship.model.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Marcus Vilaronga and Nefi Nuñez
 */
public class GameControl {
    
    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    
    // reference to a Game object
    private static Game theGame;

    
    public static void createNewGame(String pName) {
        // Created the game object. Save it in the main driver file
        theGame = new Game();
        CityOfAaron.setTheGame(theGame);

        // create the player object. Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setName(pName);
        theGame.setPlayer(thePlayer); 
        }
        // create the CropData object
        public static void createCropDataObject() {
        CropData theCrops = new CropData();
        
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000); 
        
        theGame.setCropData(theCrops);         
        }

        // create the list of animals
        public static void createAnimalList() {
            
        ArrayList<ListItem> animals = new ArrayList<>();
        
        animals.add(new ListItem("chickens", 12));
        animals.add(new ListItem("sheeps", 3));
        animals.add(new ListItem("dogs", 7));
        animals.add(new ListItem("ducks", 4));
       
        theGame.setAnimals(animals);
        }

        // create the list of tools
        public static void createToolList() {
            
        ArrayList<ListItem> tool = new ArrayList<>();
        
        tool.add(new ListItem("plow beam", 12));
        tool.add(new ListItem("curry-comb", 3));
        tool.add(new ListItem("digging-fork", 7));
        tool.add(new ListItem("garden hammer", 4));
       
        theGame.setTools(tool);
        }        
        //create the list of provisions
        public static void createProvisionList() {
            
        ArrayList<ListItem> provision = new ArrayList<>();
        
        provision.add(new ListItem("hay", 12));
        provision.add(new ListItem("wheat", 3));
        provision.add(new ListItem("beans", 7));
        provision.add(new ListItem("rice", 4));
       
        theGame.setProvisions(provision);
        }
        
        // create the Locations and the Map object 
            // The createMap method
        // Purpose: creates the location objects and the map
        // Parameters: none
        // Returns: none
        public static void createMap() {
           // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);

        // create a string that will go in the Location objects
        // that contain the river
        String valley = "\nYou are on the Valley. The valley is the source" +
                      "\nof life for our city. The valley marks the northen " +
                      "\nboundary of the city - it is wilderness to the West.";

        // create a new Location object
        Location loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(valley);
        loc.setSymbol("***");  

        // set this location object in each cell of the array in column 2      
        for(int i = 0; i < MAX_ROW; i++)
        {
                theMap.setLocation(i, 2, loc);
        }

        
        // define the string for a farm land location
        String farmland = "\nYou are on the fertile banks of the valley." +
        "\nIn the springthis low farmland floods and is covered with rich" +
        "\nnew soil. Wheat is planted as far as you can see."; 

        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("***");
        theMap.setLocation(0, 2, loc);
        
        // define the string for a fountain location
        String fountain = "\nIn the fountain cattle have abundant water." +
        "\nToo fountain provide water to plantations and to cook, whash dishies" +
        "\nand take a shower."; 

        // set a fountain location with a hint
        loc = new Location();
        loc.setDescription(fountain + "\nOne barrel of water quench thirst two sheeps.");
        loc.setSymbol("***");
        theMap.setLocation(1, 3, loc);
        
        // define the string for a pasture location
        String pasture = "\nIn the pasture cattle have grain to eat." +
        "\nIt's a silent place to cattle."; 

        // set a pasture location with a hint
        loc = new Location();
        loc.setDescription(pasture + "\nOne acre of pasture provide food to 05 sheeps.");
        loc.setSymbol("***");
        theMap.setLocation(3, 4, loc);
        
        // define the string for a forest location
        String forest = "\nWe have a forest that is so far and is in the" +
        "\nboundary of the valley. The forest is big and dense, but have wolfs." +
        "\nWolfs are a threat to our cattle.";; 

        // set a forest location with a hint
        loc = new Location();
        loc.setDescription(forest + "\nThe forest have a lot of wolfs.");
        loc.setSymbol("***");
        theMap.setLocation(4, 2, loc);

 
        theGame.setMap(theMap);
        }

     public static void getSavedGame(String filePath) {
            Game theGame = null;
            
            try (FileInputStream fips = new FileInputStream(filePath)) {
                ObjectInputStream input = new ObjectInputStream(fips);
                theGame = (Game) input.readObject();
                CityOfAaron.setTheGame(theGame);
            }
            catch (Exception e) {
                System.out.println("\nThere was an error reading the saved game file");
            }
        }

    public void displayMap() {
            Game _game = CityOfAaron.getTheGame();
            Map theMap = _game.getTheMap(); 
         
            for (int i = 0; i < MAX_ROW; ++i) {
                for (int j = 0; j < MAX_COL; ++j) {
                   
                    
                    if (theMap.getLocation(i, j) == null) {
                        System.out.print("...");
                    }
                    else {
                        System.out.print(theMap.getLocation(i, j).getSymbol());
                    } 
                }
                System.out.println("");
            }
    }
}

