/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import java.io.Serializable;

/**
 *
 * @author sadss
 */
public class ResourceScene implements Serializable {
    
    // class instance variables
    private int amount;

    public int getAmount() {
        return amount;
    }

    public ResourceScene() {
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.amount;
        return hash;
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "amount=" + amount + '}';
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
        final ResourceScene other = (ResourceScene) obj;
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }
    
}
