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
 * @author MARCUS VILARONGA
 */
public class Player implements Serializable{
    
    // class instance variable
    private String name;
    private double bastTime;
    private ArrayList<Game> games = new ArrayList<>();
    public boolean toString;

   

     public ArrayList<Game> getGames() {
         return games;
     } 
     
     public void setGames(ArrayList<Game> games) {
         this.games = games;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBastTime() {
        return bastTime;
    }

    public void setBastTime(double bastTime) {
        this.bastTime = bastTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.bastTime) ^ (Double.doubleToLongBits(this.bastTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bastTime=" + bastTime + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bastTime) != Double.doubleToLongBits(other.bastTime)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    public void setTime(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
            
    
}
