/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 *  task for excercise 3 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise03 extends TaskTemplate{
    protected final Mario mario;
    /**
     * @param initialTty
     * @param name
     */
    public AB2_Exercise03() {
        super(Presets.cage(5, 5).result(), "AB 2 Exercise 03");
        this.mario = new Mario(this.simulation);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        // TODO Auto-generated method stub
        
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        if(mario.lastPosition().column == 2){
            if(mario.lastPosition().row==1){
                //everything is just fine
            }
        }
    }
    
}
