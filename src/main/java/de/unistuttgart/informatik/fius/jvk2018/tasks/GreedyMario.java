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
 * Mario who picks all coins at once and saves the amount of picked coins in 
 * an attribute
 * @author schieljn
 */
public class GreedyMario extends Mario {

    /**
     * @param sim
     */
    public GreedyMario(Simulation sim) {
        super(sim);
    }
    
}
