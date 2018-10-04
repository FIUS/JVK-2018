/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.function.Supplier;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Editor;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;

/**
 * Base class for Task 6 of sheet 1
 * 
 * @author Dilara
 */
abstract public class Task1_6 extends TaskTemplate {
    protected final Mario mario;
    
    public Task1_6() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            return ed.result();
        }).get(), "Task1_6");
        this.mario = new Mario(this.simulation);
        this.mario.spawn(1, 0, Direction.SOUTH);
    }
    
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        
    }
}
