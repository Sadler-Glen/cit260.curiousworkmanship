/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.curiousWorkmanship.enums;

import byui.cit260.curiousWorkmanship.model.Location;
import java.awt.Point;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author sadss
 */




public enum Actor implements Serializable {
    
    Lehi("He is the prophet and leader of the family."),
    Sariah("She is Lehi's wife and mother of the family."),
    Nephi("Faithful son and later the prophet leader of the Nephites."),
    Jacob("Nephi's faithful brother, prophet and successor to Nephi"),
    Sam("The youngest boy and faithful brother of Nephi."),
    Laman("The oldest rebellious brother and leader of the Lamanites."),
    Lemuel("The 2nd oldest rebellious brother who went with Laman"),
    Zoram("Laban servant that became a faithful follower of Nephi");
    
    private final String description;
    private final Point coordinates;
    
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
}
