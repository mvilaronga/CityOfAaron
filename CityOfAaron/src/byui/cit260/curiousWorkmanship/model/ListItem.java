/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nefi Nuñez
 */
public class ListItem implements Serializable {
  
    // class instance variable
    private string name;
    private int number;
    private ListItem ListItem;

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ListItem getListItem() {
        return ListItem;
    }

    public void setListItem(ListItem ListItem) {
        this.ListItem = ListItem;
    }

    public ListItem() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.number;
        hash = 23 * hash + Objects.hashCode(this.ListItem);
        return hash;
    }

    @Override
    public String toString() {
        return "ListItem{" + "name=" + name + ", number=" + number + ", ListItem=" + ListItem + '}';
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
        final ListItem other = (ListItem) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ListItem, other.ListItem)) {
            return false;
        }
        return true;
    }
    
    
}
