/*
c * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * task for exercise 6 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task05c extends TaskTemplate {
    
    protected Mario mario;
    
    /**
     *
     */
    public AB2_Task05c() {
        super(Presets.cage(6, 6).result(), "Worksheet 2, task 05 (c)");
        this.mario = new Mario(this.simulation, 36);
        // TODO Auto-generated constructor stub
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
      //no test because everyone draws a smiley in his own way
    }
    
}
