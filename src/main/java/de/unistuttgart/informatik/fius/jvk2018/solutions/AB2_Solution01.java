/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB2_Exercise01;

/**
 * Base class for the solution of Exc. 1 of worksheet 2
 * @author Sebastian Paule
 */
public class AB2_Solution01 extends AB2_Exercise01{

    
    
    @Override
    public void solve() {
        this.coin1.spawn(0, 0);
        this.coin2.spawn(0, 0);
        this.mario.spawn(0, 0);
        this.wall.spawn(0,0);
    }
    
}
