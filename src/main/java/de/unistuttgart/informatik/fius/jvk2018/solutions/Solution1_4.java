/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.jvk2018.tasks.Task1_4;

/**
 * Solution class for Task 4 of sheet 1
 * @author Dilara
 */
public class Solution1_4 extends Task1_4 {

    public void solve() {
        this.mario.move();
        this.mario.move();
        this.mario.move();
        this.mario.turnLeft();
       // this.mario.move();
        //this.mario.move();
        this.coin.spawn(6, 3);
       
    }
    
}
