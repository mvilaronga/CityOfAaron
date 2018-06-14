/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

/**
 *
 * @author MARCUS VILARONGA
 */
public enum Actor {
    
    Nefi("Nefi Garcia", "The firt member of the team group"),
    Vinicius("Vinicius Silva", "The second member of the team group"),
    Marcus("Marcus Vilaronga", "The third member of the team group"),
    Roger(("Roger deBry", "The fourth member of the team group");
    
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", title=" + title + '}';
    }
    
    

    Actor(String name, String title) {
        this.name = name;
        this.title = title;   

}
    
}
