/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Marcus Vilaronga and Nefi Nuñez
 */
public class Game implements Serializable{
    
    // class instance variable
    
    private Player player;
    private CropData cropData = null;

    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    
    

    public Game() {
    }
    
    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.player);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTools(ArrayList<ListItem> tool) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setProvisions(ArrayList<ListItem> provision) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMap(Map theMap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
