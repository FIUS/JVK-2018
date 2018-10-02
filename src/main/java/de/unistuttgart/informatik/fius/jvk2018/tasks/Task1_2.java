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
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Editor;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject;
import de.unistuttgart.informatik.fius.icge.territory.WorldObject.Sprite;

/**
 * Base class for Task 2 of Sheet 1
 * 
 * @author Dilara Aygün
 */
abstract public class Task1_2 extends TaskTemplate {
    protected final Mario mario;
    
    public Task1_2() {
        super(((Supplier<Territory>) () -> {
            Editor ed = Presets.cage(10, 5);
            ed.add(new WorldObject(Sprite.WALL, 4, 2));
            ed.add(new WorldObject(Sprite.WALL, 9, 4));
            ed.add(new WorldObject(Sprite.WALL, 7, 3));
            return ed.result();
        }).get(), "Task1_2");
        this.mario = new Mario(this.simulation);
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
