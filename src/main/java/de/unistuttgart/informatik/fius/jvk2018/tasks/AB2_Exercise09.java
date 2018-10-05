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
 * task for the exercise 9 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise09 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     */
    public AB2_Exercise09() {
        super(Presets.cage(5, 5).result(), "AB 2 Exercise 09");
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
        ///////////////////////////////////
        //TODO test here
        //////////////////////////////////
        this.simulation.pause();
    }
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanFront();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanBack();
    
    /** 
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanLeft();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanUpperRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanUpperLeft();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract  Boolean scanLowerRight();
    
    /**
     * @return true if on the scanned field is a collectable
     */
    protected abstract Boolean scanLowerLeft();
    
}
