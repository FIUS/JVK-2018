/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 *
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.MovableEntity.MoveEvent;

/**
 * This provides the base class for Solution1.
 */
abstract public class Task1 extends TaskTemplate {
    
    protected final Mario mario = new Mario(this.simulation);
    
    public Task1() {
        super(Presets.cage(10, 5).result(), "Task1");
    }

    public static int taskNumber() {
        return 10;
    }
    
    @Override
    public void test() {
        this.solve();
        Assertions.assertFalse(this.mario.canMove());
        this.simulation.pause();
        Assertions.assertEquals(0, this.mario.firstPosition().column, "Did not start at col 0.");
        for (MoveEvent e : this.mario.positionHistory()) {
            Assertions.assertEquals(0, e.row, "Did not move in a straight line.");
        }
    }
}
