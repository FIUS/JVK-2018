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
 * This provides the base class for Solution1.
 */
abstract public class AB3_Task05 extends TaskTemplate {
    
    protected final Mario mario = new Mario(this.simulation);
    /**
     * The width of the field
     */
    protected static int fieldWidth = 6;
    /**
     * The height of the field
     */
    protected static int fieldHeight = 6;
    
    public AB3_Task05() {
        super(Presets.cage(fieldWidth, fieldHeight).result(), "AB3_Excerice05");
        this.mario.spawn(0, 0);
    }
    
    public static int taskNumber() {
        return 35;
    }
    
    @Override
    public void test() {
        this.solve();
        
    }
}
