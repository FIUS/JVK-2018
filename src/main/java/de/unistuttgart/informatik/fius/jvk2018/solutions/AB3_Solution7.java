/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.jvk2018.tasks.AB3_Exercise07;

/**
 * The solution for the Exercise AB3_Exercise07
 * 
 * @author schieljn
 */
public class AB3_Solution7 extends AB3_Exercise07 {
    
    private int posBottomRow = 0;
    private int smallestStack = 0;
    private int lastSmallestPos = 0;
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        this.mario.turnLeft();
        this.mario.move();
        
        this.mario.turnRight();
        for (int coins = 0; coins < 10; coins++) {
            this.smallestStack = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                this.mario.collectAll();
                if (this.mario.getLastCollected() <= this.smallestStack && this.mario.getLastCollected() != 0) {
                    this.smallestStack = this.mario.getLastCollected();
                    this.lastSmallestPos = i;
                }

                this.mario.placeAll();
                if (i < 9) {
                    this.mario.move();
                }
            }
            
            this.mario.turnLeft();
            this.mario.turnLeft();
            
            for (int i = 9; i > this.lastSmallestPos; i--) {
                this.mario.move();
            }
            
            this.mario.collectAll();
            
            this.mario.turnLeft();
            this.mario.move();
            
            this.mario.turnRight();
            
            for (int i = this.mario.worldObject().column; i > 0; i--) {
                this.mario.move();
            }
            
            this.mario.turnLeft();
            this.mario.move();
            this.mario.turnLeft();
            
            for (int i = 0; i < this.posBottomRow; i++) {
                this.mario.move();
            }
            this.mario.placeAll();
            this.mario.turnLeft();
            this.mario.move();
            this.mario.turnLeft();
            
            for (int i = this.mario.worldObject().column; i > 0; i--) {
                this.mario.move();
            }
            this.mario.turnRight();
            this.mario.move();
            this.mario.turnRight();
            this.posBottomRow++;
        }
    }
    
}
