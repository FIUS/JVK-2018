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
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Editor;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Sprite;

/**
 * This provides the base class for Solution2.
 */
abstract public class Task2 extends TaskTemplate {
    
    protected final Mario mario;
    
    public Task2() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            ed.add(new WorldObject(Sprite.WALL, 4, 2));
            return ed.result();
        }).get(), "Task2");
        this.mario = new Mario(this.simulation);
        this.mario.spawn(0, 0);
    }
    
    @Override
    public void test() {
        Assertions.assertNotNull(this.mario);
        Assertions.assertTrue(this.mario.canMove());
        this.solve();
        Assertions.assertFalse(this.mario.canMove());
        this.simulation.pause();
    }
}
