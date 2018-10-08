/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.jvk2018.tasks.AB3_Task05;

/**
 * Solution class for worksheet 3, task 5
 * @author schieljn
 */
public class AB3_Solution05 extends AB3_Task05 {
    
    // TODO (haslersn): Why are those attributes and not local variables inside `solve()`?
    private int posBottomRow = 0;
    private int smallestStack = 0;
    private int lastSmallestPos = 0;
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        // TODO (haslersn): I guess this solution has to be cleared before packaging

        this.mario.turnLeft();
        this.mario.move();
        
        this.mario.turnRight();
        for (int coins = 0; coins < 10; coins++) {
            this.smallestStack = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                int collected = this.mario.collectAllCoins();
                if (collected <= this.smallestStack && collected != 0) {
                    this.smallestStack = collected;
                    this.lastSmallestPos = i;
                }

                this.mario.dropAllCoins();
                if (i < 9) {
                    this.mario.move();
                }
            }
            
            this.mario.turnLeft();
            this.mario.turnLeft();
            
            for (int i = 9; i > this.lastSmallestPos; i--) {
                this.mario.move();
            }
            
            this.mario.collectAllCoins();
            
            this.mario.turnLeft();
            this.mario.move();
            
            this.mario.turnRight();
            
            for (int i = this.mario.getColumn(); i > 0; i--) {
                this.mario.move();
            }
            
            this.mario.turnLeft();
            this.mario.move();
            this.mario.turnLeft();
            
            for (int i = 0; i < this.posBottomRow; i++) {
                this.mario.move();
            }
            this.mario.dropAllCoins();
            this.mario.turnLeft();
            this.mario.move();
            this.mario.turnLeft();
            
            for (int i = this.mario.getColumn(); i > 0; i--) {
                this.mario.move();
            }
            this.mario.turnRight();
            this.mario.move();
            this.mario.turnRight();
            this.posBottomRow++;
        }
    }
    
}
