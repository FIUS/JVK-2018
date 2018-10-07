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
import de.unistuttgart.informatik.fius.icge.simulation.Wall;

/**
 * Task for exercise 10 a of the second worksheet
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise10a extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     *
     */
    public AB2_Exercise10a() {
        super(Presets.cage(10, 10).result(), "AB 2 Exercise 10 (a)");
        this.mario = new Mario(this.simulation);
        generateWalls();
    }
    
    private void generateWalls() {
        for(int i = 1; i != 9;++i){
            int b = random();
            for(int o = 0; o != b;++o){
            new Wall(this.simulation).spawn(o, i);
            }
        }
    }
    
    /**
     * @return a random value between 1 and 9
     */
    protected int random(){
            int range = (8 - 0) + 1;     
            return (int)(Math.random() * range) + 0;
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        Assertions.assertEquals(this.mario.lastPosition().column,0);
        Assertions.assertEquals(this.mario.lastPosition().row,9);
    }
    
}
