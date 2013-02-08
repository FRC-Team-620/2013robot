/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc0.Warbot.commands;

/**
 *
 * @author Warbots
 */
public class Location {
    int pos;
    int step = 0;
    
    public Location(int position) throws IllegalArgumentException {
        if(position <= 4) {
            pos = position;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    public int getTotalSteps() {
        switch(pos) {
            case 0:
                return 6;
            case 1:
                return 4;
            case 3:
                return 4;
            case 4:
                return 6;
            default:
                return 0;
       }
        
        public void updateStep() {
            if(step == getTotalSteps()) {
                
            }
        }        
 }
    
    
}
