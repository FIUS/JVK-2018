/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * Base class for Task 3 of sheet 1
 * 
 * @author Dilara Aygün
 */
public class Task1_3 extends TaskTemplate {
    protected final Mario mario = new Mario(this.simulation);
    
    public Task1_3() {
        super(Presets.cage(10, 5).result(), "Task1_3");
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.jvk2018.tasks.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        try {
            this.mario.spawn(1, 1);
            for (int i = 0; i < 100; i++) {
                this.mario.move();
            }
        } catch (Exception e) {
            //Todo print line for exception
        }
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.jvk2018.tasks.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        
    }
    
}
