/*
 * This source file is part of the FIUS ICGE project.
 * For more information see github.com/neumantm/ICGE
 *
 * Copyright (c) 2018 the ICGE project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.jvk2018.tasks.Task1;

public class Solution1 extends Task1 {
    
    @Override
    public void solve() {
        this.mario.spawn(0, 0);
        while (this.mario.tryMove()) {
            // nothing to do
        }
    }
}
