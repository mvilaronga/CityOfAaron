
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Nefi Nuñez
 */
public class ListItem implements Serializable{
     // class instance variable
    private String name;
    private int number;

    public ListItem(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.number;
        
        return hash;
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
        
        return true;
    }


    @Override
    public String toString() {
        return "ListItem{" + "name=" + name + ", number=" + number + '}';
    }
    
    
}