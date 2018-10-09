/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB3_Task07;

/**
 * Solution class for worksheet 3, task 6
 * @author schieljn
 */
public class AB3_Solution07 extends AB3_Task07 {
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        while (this.mario.tryCollect())
            ;
        for (int rows = 0; rows < 4; rows++) {
            int mod = 2;
            for (int x = 0; x < 7; x++) {
                if (x % mod == 0) {
                    this.mario.tryDrop(Coin.class);
                    
                }
                this.mario.move();
            }
            this.mario.turnLeft();
            this.mario.turnLeft();
            this.mario.turnLeft();
            this.mario.move();
            this.mario.turnLeft();
            this.mario.turnLeft();
            this.mario.turnLeft();
            
            for (int x = 0; x < 7; x++) {
                if (x % mod == 0) {
                    this.mario.tryDrop(Coin.class);
                    
                }
                this.mario.move();
            }
            if (rows < 3) {
                this.mario.turnLeft();
                this.mario.move();
                this.mario.turnLeft();
            }
        }
    }
    
}
