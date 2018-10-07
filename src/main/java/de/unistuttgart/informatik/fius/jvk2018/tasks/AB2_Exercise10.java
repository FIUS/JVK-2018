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
public abstract class AB2_Exercise10 extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     *
     */
    public AB2_Exercise10() {
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
    
    public void solve(){
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        Assertions.assertEquals(marioIsCalculating(10,2),5);
        Assertions.assertEquals(marioIsCalculating(11,2),5);
    }

    /**
     * @param number1 first number to be used
     * @param number2 second number
     * @return n1/n2
     */
    public abstract int marioIsCalculating(int number1, int number2);
    
}
