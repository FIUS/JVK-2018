/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Editor;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;

/**
 * Base class for task 4 of sheet 1
 * 
 * @author Dilara
 */
abstract public class AB1_Task4 extends TaskTemplate {
    protected final Mario mario;
    protected final Coin coi;
    protected final Coin coin;
    
    
    public AB1_Task4() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            return ed.result();
        }).get(), "Task1_4");
        this.mario = new Mario(this.simulation);
        this.mario.spawn(5, 0, Direction.SOUTH);
        this.coi = new Coin(this.simulation);
        this.coi.spawn(3, 1);
        this.coin = new Coin(this.simulation);
        this.coin.spawn(1, 4);
        
    }
    
    @Override
    public void test() {
        this.solve();
        Assertions.assertFalse(this.mario.canMove());
        this.simulation.pause();
        Assertions.assertEquals(7, this.mario.firstPosition().column, "Wrong position");
        Assertions.assertEquals(4, this.mario.lastPosition().row, "Wrong position");
    }
}
