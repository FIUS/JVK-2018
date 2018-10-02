/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 *
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.jvk2018.tasks.Task2;

public class Solution2 extends Task2 {
    @Override
    public void solve() {
        for (int i = 0; i < 10; ++i) {
            this.mario.turnLeft();
            while (this.mario.tryMove()) {
                // nothing to do
            }
        }
    }
}
