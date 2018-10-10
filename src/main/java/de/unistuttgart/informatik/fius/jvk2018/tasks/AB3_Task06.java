/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.Random;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;

/**
 * Exercise AB3_7
 * 
 * @author schieljn
 */
public abstract class AB3_Task06 extends TaskTemplate {
    
    /**
     * Initializes the exercise
     */
    public AB3_Task06() {
        super(Presets.cage(10, 3).result(), "Worksheet 3, task 06");
        Random rdm = new Random();
        for (int i = 0; i < 10; i++) {
            int coins = rdm.nextInt(5);
            coins++;
            for (int j = 0; j < coins; j++) {
                new Coin(this.simulation).spawn(i, 0);
            }
        }
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        
        this.simulation.pause();
    }
    
}
