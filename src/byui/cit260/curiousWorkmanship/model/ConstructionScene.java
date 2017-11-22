/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.model;


import byui.cit260.curiousWorkmanship.enums.SceneGroup;
import byui.cit260.curiousWorkmanship.enums.SceneType;

/**
 *
 * @author jacksonrkj
 */
public class ConstructionScene extends Scene {
    private InventoryItem[] requiredItems = new InventoryItem[5];

    public ConstructionScene() {
    }

    public ConstructionScene(SceneGroup sceneGroup, 
                             String description, 
                             String mapSymbol, 
                             double travelTime, 
                             boolean blocked,
                             InventoryItem[] requiredItems) {
        super(sceneGroup, description, mapSymbol, travelTime, blocked);
        this.requiredItems = requiredItems;
    }

    public InventoryItem[] getRequiredItems() {
        return requiredItems;
    }

    public void setRequiredItems(InventoryItem[] requiredItems) {
        this.requiredItems = requiredItems;
    }
    
    
    
}
