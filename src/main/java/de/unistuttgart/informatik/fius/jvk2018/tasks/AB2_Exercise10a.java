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
import de.unistuttgart.informatik.fius.icge.simulation.Wall;

/**
 * Task for exercise 10 a of the second worksheet
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise10a extends TaskTemplate {
    /**
     * 
     */
    protected final Wall[] walls = new Wall[9];
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
        for(int i = 0; i!= 9; ++i){
            this.walls[i] = new Wall(this.simulation);
        }
        generateWalls();
    }
    
    private void generateWalls() {
        for (int i = 0; i != 9; ++i) {
            int n1 = 0;
            int n2 = 0;
            while (n1 == 0 & n2 == 0) {
                if (n1 == 0 & n2 == 0) {
                    n1 = this.random();
                    n2 = this.random();
                    this.walls[i].spawn(n1, n2);
                }
            }
        }
    }
    
    /**
     * @return a random value between 1 and 9
     */
    protected int random(){
            int range = (9 - 0) + 1;     
            return (int)(Math.random() * range) + 0;
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
    }
    
}
