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
public abstract class AB3_Task05 extends TaskTemplate {
    
    /**
     * Mario to move
     */
    public final GreedyMario mario;
    
    /**
     * Initializes the exercise
     */
    public AB3_Task05() {
        super(Presets.cage(10, 3).result(), "Worksheet 3, task 05");
        Random rdm = new Random();
        for (int i = 0; i < 10; i++) {
            int coins = rdm.nextInt(5);
            coins++;
            for (int j = 0; j < coins; j++) {
                new Coin(this.simulation).spawn(i, 0);
            }
        }
        this.mario = new GreedyMario(this.simulation);
        this.mario.spawn(0, 1);
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        /*
        int lastField = 0;
        int newField = 0;
        for (int i = 0; i < 10; i++) {
            lastField = newField;
            newField = 0;
            ArrayList<Entity> e = this.simulation.entitiesWith(i, 2);
            for (Entity ent : e) {
                if (ent.type() == EntityType.COIN) {
                    newField++;
                }
            }
            int check = 0;
            if (newField >= lastField) {
                check = 1;
            }
            assertEquals(1, check, "The coins are not sorted!");
        }
        */
        
        this.simulation.pause();
    }
    
}
