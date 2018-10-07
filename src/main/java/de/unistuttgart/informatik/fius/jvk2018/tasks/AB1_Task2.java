/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.function.Supplier;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.EntityType;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Editor;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject;

/**
 * Base class for Task 2 of Sheet 1
 * 
 * @author Dilara Aygün
 */
abstract public class AB1_Task2 extends TaskTemplate {
    protected final Mario mario;
    
    public AB1_Task2() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            ed.add(new WorldObject(EntityType.WALL, 4, 2));
            ed.add(new WorldObject(EntityType.WALL, 9, 4));
            ed.add(new WorldObject(EntityType.WALL, 7, 3));
            return ed.result();
        }).get(), "Task1_2");
        this.mario = new Mario(this.simulation);
        this.mario.spawn(0, 0);
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.jvk2018.tasks.TaskTemplate#test()
     * 
     *      test method for Task1_2, since there are no code modifications required, there is no
     *      need for an elaborate test method.
     * 
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        
    }
    
}
