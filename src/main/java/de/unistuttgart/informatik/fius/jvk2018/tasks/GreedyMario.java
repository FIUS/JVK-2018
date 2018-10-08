/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Simulation;

/**
 * Subclass of Mario which can also pick op or drop all coins at once.
 * This class is used in AB3_Task05.
 * @author schieljn
 */
public class GreedyMario extends Mario {
    
    /**
     * Initializes a greedy mario
     * 
     * @param sim
     *            The simulation this entity lives in
     */
    public GreedyMario(Simulation sim) {
        super(sim);
    }
    
    /**
     * Collect all coins which are on the same cell
     * 
     * @return The amount of coins which have been collected
     */
    public int collectAllCoins() {
        int counter = 0;
        while (this.tryCollectCoin()) ++counter;
        return counter;
    }
    
    /**
     * Places all coins mario collected
     */
    public int dropAllCoins() {
        int counter = 0;
        while (this.tryDropCoin()) ++counter;
        return counter;
    }

    /**
     * Turns mario right
     */
    public void turnRight() {
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
    }
}
