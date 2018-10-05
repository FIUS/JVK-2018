/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.simulation.EntityType;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Simulation;

/**
 * Mario who picks all coins at once and saves the amount of picked coins in
 * an attribute
 * 
 * @author schieljn
 */
public class GreedyMario extends Mario {
    
    private int lastCollected;
    
    /**
     * Initializes a greedy mario
     * 
     * @param sim The simulation of the mario object
     */
    public GreedyMario(Simulation sim) {
        super(sim);
    }
    
    /**
     * Method to collect all coins on a field
     */
    public void collectAll() {
        int counter = 0;
        while (this.tryCollect(EntityType.COIN)) {
            counter++;
        }
        this.lastCollected = counter;
    }
    
    /**
     * Method to get the amount of coins that mario collected the last time the collectAll method
     * was used.
     * 
     * @return The amount of the last collected coins
     */
    public int getLastCollected() {
        return this.lastCollected;
    }
    
    /**
     * 
     */
    public void placeAll() {
        while (this.tryDrop());
    }
    
    private boolean tryDrop() {
        if (this.canDrop(EntityType.COIN)) {
            this.drop(EntityType.COIN);
            return true;
        }
        return false;
        
    }
}
