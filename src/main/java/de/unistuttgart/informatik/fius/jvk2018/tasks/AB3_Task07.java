/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * Exercise AB3_7
 * 
 * @author schieljn
 */
public abstract class AB3_Task07 extends TaskTemplate {
    
    /**
     * Mario to move
     */
    public final Mario mario;
    
    /**
     * Initializes the exercise
     */
    public AB3_Task07() {
        super(Presets.cage(8, 8).result(), "Worksheet 2, task 06");
        
        this.mario = new Mario(this.simulation);
        this.mario.spawn(0, 0);
        for (int i = 0; i < 32; i++) {
            new Coin(this.simulation).spawn(0, 0);
        }
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        
    }
    
}
