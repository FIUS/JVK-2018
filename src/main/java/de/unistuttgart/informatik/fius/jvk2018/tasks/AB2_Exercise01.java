/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Entity;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Wall;

/**
 * Task for ex. 1 of worksheet 2
 * 
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise01 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     * 
     */
    protected final Coin coin1;
    /**
     * 
     */
    protected final Coin coin2;
    /**
     * 
     */
    protected final Wall wall;
    
    /**
     *
     */
    public AB2_Exercise01() {
        super(Presets.cage(5, 5).result(), "AB 2 Exercise 01");
        this.mario = new Mario(this.simulation);
        this.coin1 = new Coin(this.simulation);
        this.coin2 = new Coin(this.simulation);
        this.wall = new Wall(this.simulation);
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        
        ArrayList<Entity> temp = this.simulation.entitiesWith(2, 1);
        Assertions.assertEquals(3, temp.size());
    }
    
}
