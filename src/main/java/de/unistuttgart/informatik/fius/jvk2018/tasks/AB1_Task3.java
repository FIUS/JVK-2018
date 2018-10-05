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
abstract public class AB1_Task3 extends TaskTemplate {
    protected final Mario mario;
    
    public AB1_Task3() {
        super(Presets.cage(10, 5).result(), "Task1_3");
        this.mario = new Mario(this.simulation);
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.jvk2018.tasks.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        // TODO elaborate test method
    }
    
}
