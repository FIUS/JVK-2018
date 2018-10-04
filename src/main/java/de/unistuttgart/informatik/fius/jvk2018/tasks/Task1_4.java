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
import de.unistuttgart.informatik.fius.icge.territory.WorldObject;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Direction;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Sprite;

/**
 * Base class for task 4 of sheet 1
 * 
 * @author Dilara
 */
abstract public class Task1_4 extends TaskTemplate {
    protected final Mario mario;
    protected final Coin coin;
    
    public Task1_4() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            ed.add(new WorldObject(Sprite.WALL, 4, 2));
            return ed.result();
        }).get(), "Task1_4");
        this.mario = new Mario(this.simulation);
        this.mario.spawn(5, 0, Direction.SOUTH);
        this.coin = new Coin(this.simulation);
    }
    
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        
    }
}
