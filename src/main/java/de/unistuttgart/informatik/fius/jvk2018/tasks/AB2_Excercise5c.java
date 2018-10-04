/*
c * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.territory.Territory;

/**
 * task for exercise 6 of worksheet 2
 * @author
 */
public class AB2_Excercise5c extends TaskTemplate {
    
    /**
     * @param initialTty
     * @param name
     */
    public AB2_Excercise5c() {
        super(Presets.cage(6, 6).result(), "AB 2 Exercise 5 (c)");
        // TODO Auto-generated constructor stub
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
    }
    
}
