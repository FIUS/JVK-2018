/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 *
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.EntityType;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Editor;
import de.unistuttgart.informatik.fius.icge.territory.Territory;

/**
 * This provides the base class for Solution3.
 */
abstract public class Task3 extends TaskTemplate {
    
    protected final Mario mario;
    
    public Task3() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            return ed.result();
        }).get(), "Task3");
        for (int i = 0; i < 3; ++i) {
            new Coin(this.simulation).spawn(2, 2);
        }
        this.mario = new Mario(this.simulation);
        this.mario.spawn(0, 0);
    }

    
    public static int taskNumber() {
        return 30;
    }
    
    @Override
    public void test() {
        Assertions.assertNotNull(this.mario);
        Assertions.assertTrue(this.mario.canMove());
        Assertions.assertFalse(this.mario.canCollect());
        this.solve();
        Assertions.assertTrue(this.simulation.territory()
                .containsWith(wob -> (wob.type == EntityType.COIN) && (wob.column == 4) && (wob.row == 2)));
        this.simulation.pause();
    }
}
