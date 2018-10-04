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
import de.unistuttgart.informatik.fius.icge.territory.Territory;

/**
 * TODO: task for exercise 10 a of the second worksheet
 * @author Sebastian Paule
 */
public class AB2_Exercise10a extends TaskTemplate {
    protected final Wall[] walls = new Wall[9];
    protected final Mario mario;
    /**
     *
     */
    public AB2_Exercise10a() {
        super(Presets.cage(10, 10).result(), "AB 2 Exercise 10 (a)");
        mario = new Mario(this.simulation);
        for(int i = 0; i!= 9; ++i){
            walls[i] = new Wall(this.simulation);
        }
    }
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        // TODO Auto-generated method stub
        
    }
    
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
