/*
* The main() class file for the cityOfAaron project
* CIT-260
* Spring 2018
*  Team members: Nefi Garcia and Marcus Vilaronga
*/
package citiofaaron;

import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author MARCUS VILARONGA
 */
public class CitiOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setTime(7.00);
        
        System.out.println(playerOne.toString());
    }
    
}
