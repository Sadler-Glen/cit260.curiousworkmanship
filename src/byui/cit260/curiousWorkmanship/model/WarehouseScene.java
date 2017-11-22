/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;

import byui.cit260.curiousWorkmanship.enums.SceneGroup;

/**
 *
 * @author jacksonrkj
 */
public class WarehouseScene extends Scene {
        
    private InventoryItem[] itemsStored;

    public WarehouseScene() {
    }

    public WarehouseScene(SceneGroup sceneGroup, String description, String mapSymbol, double travelTime, double capacity, InventoryItem[] itemsStored) {
        super(sceneGroup, description, mapSymbol, travelTime, true);
        this.itemsStored = itemsStored;
        
    }

    public InventoryItem[] getItemsStored() {
        return itemsStored;
    }

    public void setItemsStored(InventoryItem[] itemsStored) {
        this.itemsStored = itemsStored;
    }
    
    

    
}