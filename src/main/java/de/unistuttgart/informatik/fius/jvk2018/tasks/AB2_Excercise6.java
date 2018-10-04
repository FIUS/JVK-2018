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
 * base solution for excercise 6 of worksheet 2
 * @author Sebastian Paule
 */
public class AB2_Excercise6 extends TaskTemplate {
    protected final Mario mario1;
    protected final Mario mario2;
    /**
     * @param initialTty
     * @param name
     */
    public AB2_Excercise6() {
        super(Presets.cage(12, 2).result(), "AB 2 Exercise 6");
        this.mario1 = new Mario(this.simulation);
        this.mario2 = new Mario(this.simulation);
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
       
       if(this.mario1.lastPosition().column == 11){
           if(this.mario1.lastPosition().row == 0){
               if(this.mario2.lastPosition().column == 11){
                   if(this.mario2.lastPosition().row == 1){
                       //everything is just fine
                   }
               }
           }
       }
       
       mario1.spawn(11, 0);
       mario2.spawn(11, 1);
       
       
       
    }
    
}
