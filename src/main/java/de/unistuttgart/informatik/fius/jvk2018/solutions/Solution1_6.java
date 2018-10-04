/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.jvk2018.tasks.Task1_6;

/**
 * Solution class for task 6 of sheet 1
 * @author Dilara
 */
public class Solution1_6 extends Task1_6 {
    protected Coin coin;
    public void solve() {
        this.coin = new Coin(this.simulation);
        this.coin.spawn(1, 4);
    }
}
