/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * Task for the 12th exercise of the second worksheet
 * 
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise12 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     * 
     */
    protected final Coin[] coin = new Coin[random(5, 15)];
    
    /**
     */
    public AB2_Exercise12() {
        super(Presets.cage(10, 10).result(), "AB 2 Exercise 12");
        this.mario = new Mario(this.simulation);
        
        for (int i = 0; i < coin.length; i++) {
            
            coin[i] = new Coin(this.simulation);
            coin[i].spawn(random(0, 9), random(0, 9));
            
        }
        this.mario.spawn(0, 0);
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * @param max
     *            max value
     * @param min
     *            min value
     * @return a random value betwween min and max
     */
    protected int random(int max, int min) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        //kein test
    }
    
}
