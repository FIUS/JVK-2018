/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.Random;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * Task for the 12th exercise of the second worksheet
 * 
 * @author Sebastian Paule
 */
public abstract class AB2_Task12 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     * 
     */
    protected final Coin[] coin = new Coin[random(5, 15)];
    
    private Random rdm = new Random();
    
    /**
     */
    public AB2_Task12() {
        super(Presets.cage(10, 10).result(), "Worksheet 2, task 12");
        this.mario = new Mario(this.simulation);
        
        for (int i = 0; i < coin.length; i++) {
            
            this.coin[i] = new Coin(this.simulation);
            this.coin[i].spawn(rdm.nextInt(10), rdm.nextInt(10));
            
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
    protected int random(int min, int max) {
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
