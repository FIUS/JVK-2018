/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Wall;

/**
 * Task for exercise 10 a of the second worksheet
 * @author Sebastian Paule
 */
public abstract class AB2_Task10 extends TaskTemplate {
    protected final Mario mario;

    /**
     *
     */
    public AB2_Task10() {
        super(Presets.cage(10, 10).result(), "Worksheet 2, task 10 (a)");
        this.mario = new Mario(this.simulation);
        this.mario.spawn(0,0);
        generateWalls();
    }
    
    private void generateWalls() {
        Random r = new Random();
        for(int i = 1; i != 9;++i) {
            int b = r.nextInt(9);
            for (int o = 0; o < b; ++o) {
                new Wall(this.simulation).spawn(o, i);
            }
        }
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
    }

    /**
     * @param number1 first number to be used
     * @param number2 second number
     * @return n1/n2
     */
    public abstract int marioDivides(int number1, int number2);

    /**
     * @param n1 first number to be used
     * @param n1 second number
     * @return n1*n2
     */
    public abstract double marioMultiplies(double n1, double n2);

    /**
     * @param n1 first number to be used
     * @param n1 second number
     * @return n1^n2
     */
    public abstract int marioCalcsPow(int n1, int n2);

    /**
     *
     * @param radius of the circle
     * @return Area of the circle
     */
    public abstract double marioCircleArea(double radius);

    
}
