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
 *  task for exercise 2 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise02 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     *
     */
    public AB2_Exercise02() {
        super(Presets.cage(5, 5).result(), "AB 2 Exercise 02");
        this.mario = new Mario(this.simulation);
    }
    
    /**
     * this method only exists here so I don't need it in the Solution class
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.mario.spawn(0, 0);
        this.mario.move();
        turnRight();
        this.mario.move();
        turnAround();
        this.mario.move();
        this.simulation.pause();
        if(this.mario.lastPosition().column == 1){
            if(this.mario.lastPosition().row==0){
                //everything is just fine
            }
        }
    }

    /**
     * 
     */
    protected abstract void turnAround();

    /**
     * 
     */
    protected abstract void turnRight();
    
}
