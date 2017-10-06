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
public class QuestionScene implements Serializable {
    
    // class instance variables
    private int noToAnswer;
    private int bonus;

    public QuestionScene() {
    }
    
    public int getNoToAnswer() {
        return noToAnswer;
    }

    public void setNoToAnswer(int noToAnswer) {
        this.noToAnswer = noToAnswer;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.noToAnswer;
        hash = 71 * hash + this.bonus;
        return hash;
    }

    @Override
    public String toString() {
        return "QuestionScene{" + "noToAnswer=" + noToAnswer + ", bonus=" + bonus + '}';
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
        final QuestionScene other = (QuestionScene) obj;
        if (this.noToAnswer != other.noToAnswer) {
            return false;
        }
        if (this.bonus != other.bonus) {
            return false;
        }
        return true;
    }
    
}
