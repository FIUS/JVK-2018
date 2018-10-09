/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.jvk2018.solutions.MyMario;

/**
 * Task for the 12th exercise of the second worksheet
 */
public abstract class AB2_Task13 extends TaskTemplate {

    protected MyMario mario;
    
    /**
     * Constructor of task 13
     */
    public AB2_Task13() {
        super(Presets.cage(10, 10).result(), "Worksheet 2, task 12");
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        assertNotNull(this.mario, "no mario created!");
        assertTrue(this.mario.alive(), "mario was is not alive!");
        this.simulation.pause();
    }
    
}
