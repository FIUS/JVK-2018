/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 *
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.jvk2018.solutions.MyMario;

/**
 * This provides the base class for Solution1.
 */
abstract public class AB3_Task01 extends TaskTemplate {
    
    protected final MyMario mario = new MyMario(this.simulation);
    
    public AB3_Task01() {
        super(new Territory(), "AB3_Excerice03");
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
