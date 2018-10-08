/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * task for excercise 5 a of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task05a extends TaskTemplate {

    protected final Mario mario;

    /**
     *
     */
    public AB2_Task05a() {
        super(Presets.cage(6, 6).result(), "Worksheet 2, task 5 (a)");
        this.mario = new Mario(this.simulation);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        for (int i = 0; i != 5; ++i) {
            for (int o = 0; o != 5; ++o) {
                Assertions.assertEquals(this.simulation.collectablesWith(i, o).size(), 1);
            }
        }
    }
    
}
