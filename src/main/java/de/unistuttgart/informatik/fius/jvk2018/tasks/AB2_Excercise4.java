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
import de.unistuttgart.informatik.fius.icge.territory.Territory;

/**
 * TODO: The Task for the 4 excercise on worksheet 2
 * @author Sebastian Paule
 */
public class AB2_Excercise4 extends TaskTemplate {
    protected final Mario mario;
    protected Boolean test = true;
    
    /**
     * @param initialTty
     * @param name
     */
    public AB2_Excercise4() {
        super(Presets.cage(10, 5).result(), "AB 2 Excercise 4 (a-d)");
        mario = new Mario(this.simulation);
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
        
        if(test) {
            //everything works just fine
        } else {
            //something went wrong
        }
    }
    
}
