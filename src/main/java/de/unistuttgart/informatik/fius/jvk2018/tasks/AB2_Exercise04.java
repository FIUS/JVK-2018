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
 * TODO: The Task for the 4 excercise on worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise04 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     * 
     */
    protected Boolean test = true;
    
    /**
     * 
     */
    public AB2_Exercise04() {
        super(Presets.cage(10, 5).result(), "AB 2 Exercise 04 (a-d)");
        this.mario = new Mario(this.simulation);
    }

    /**
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
        /////////////////////////////
        
      //task a)
        this.mario.spawn(2, 0);;
        vonObenNachUnten();
        if(!(this.mario.lastPosition().column == 2)) {
            if(!(this.mario.lastPosition().row == 4)) {
                this.test = false;
            }
        }
        //task b)
        this.mario.despawn();
        this.mario.spawn(2,4);
        vonUntenNachOben();
        if(!(this.mario.lastPosition().column == 2)) {
            if(!(this.mario.lastPosition().row == 0)) {
                this.test = false;
            }
        }
        //task c)
        this.mario.despawn();
        this.mario.spawn(0,2);
        vonLinksNachRechts();
        if(!(this.mario.lastPosition().column == 4)) {
            if(!(this.mario.lastPosition().row == 2)) {
                this.test = false;
            }
        }
        //task d)
        this.mario.despawn();
        this.mario.spawn(4,2);
        vonRechtsNachLinks();
        if(!(this.mario.lastPosition().column == 0)) {
            if(!(this.mario.lastPosition().row == 2)) {
                this.test = false;
            }
        }
        ////////////////////////////////
        this.simulation.pause();
        
        Assertions.assertEquals(this.test,true);
    }

    /**
     * 
     */
    protected abstract  void vonObenNachUnten();

    /**
     * 
     */
    protected abstract  void vonUntenNachOben();

    /**
     * 
     */
    protected abstract  void vonLinksNachRechts();

    /**
     * 
     */
    protected abstract void vonRechtsNachLinks();
    
}
