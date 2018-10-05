/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * base solution for exercise 6 of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise06 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario1;
    /**
     * 
     */
    protected final Mario mario2;
    /**
     *
     */
    public AB2_Exercise06() {
        super(Presets.cage(12, 2).result(), "AB 2 Exercise 06");
        this.mario1 = new Mario(this.simulation);
        this.mario2 = new Mario(this.simulation);
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

       Assertions.assertEquals(this.mario1.lastPosition().column,0);
       Assertions.assertEquals(this.mario1.lastPosition().row,0);
       Assertions.assertEquals(this.mario2.lastPosition().column,1);
       Assertions.assertEquals(this.mario2.lastPosition().row,1);
       
       
       this.mario1.spawn(11, 0);
       this.mario2.spawn(11, 1);
       
       
       
    }
    
}
