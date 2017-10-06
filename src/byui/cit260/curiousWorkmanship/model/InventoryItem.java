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
 * @author sadss
 */
public class InventoryItem implements Serializable {
    
    // class instance variables
    private String inventoryType;
    private int quantityStock;
    private int requiredamount;

    public InventoryItem() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public int getRequiredamount() {
        return requiredamount;
    }

    public void setRequiredamount(int requiredamount) {
        this.requiredamount = requiredamount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.inventoryType);
        hash = 59 * hash + this.quantityStock;
        hash = 59 * hash + this.requiredamount;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityStock=" + quantityStock + ", requiredamount=" + requiredamount + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityStock != other.quantityStock) {
            return false;
        }
        if (this.requiredamount != other.requiredamount) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }
    
    
}
