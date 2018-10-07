/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 *
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.jvk2018.tasks.Task3;

public class Solution3 extends Task3 {
    
    @Override
    public void solve() {
        this.mario.move();
        this.mario.move();
        this.mario.turnLeft();
        this.mario.turnLeft();
        this.mario.turnLeft();
        this.mario.move();
        this.mario.move();
        this.mario.collect();
        this.mario.turnLeft();
        this.mario.move();
        this.mario.move();
        this.mario.drop(Coin.class);
        this.mario.turnLeft();
        this.mario.turnLeft();
        this.mario.move();
        this.mario.move();
        this.mario.collect();
        this.mario.turnLeft();
        this.mario.move();
        this.mario.drop(Coin.class);
        this.mario.turnLeft();
        this.mario.turnLeft();
        this.mario.move();
        this.mario.collect();
        this.mario.turnLeft();
        this.mario.turnLeft();
        this.mario.move();
        this.mario.drop(Coin.class);
    }
}
