/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Wall;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB2_Exercise10a;

/**
 * Base solution for the exercise 10 (a) of worksheet 2
 * 
 * @author Sebastian Paule
 */
public class AB2_Solution10a extends AB2_Exercise10a {
    
    @Override
    public void solve() {
        
        for (int i = 0; i != 9; ++i) {
            System.out.println("t1");
            int n1 = 0;
            int n2 = 0;
            while (n1 == 0 & n2 == 0) {
                if (n1 == 0 & n2 == 0) {
                    n1 = this.random();
                    n2 = this.random();
                    walls[i].spawn(n1, n2);
                    System.out.println("t2");
                }
            }
        }
        
        // TODO work here
        
    }
}
