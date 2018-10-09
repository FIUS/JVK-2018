/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import de.unistuttgart.informatik.fius.icge.simulation.*;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB3_Task05;

/**
 * @author ruffdd
 */
public class AB3_Solution05 extends AB3_Task05 {
    
    
    @Override
    /*
     * Ich habe mario.turnright() nicht marion hinzugeügt sondern extra gelassen, natürlich ist es besser von Marion zu erben.
     */
    public void solve() {
        int[][] field = new int[fieldWidth][fieldHeight];
        /**
         * Is Mario on the Way Back?
         */
        
        boolean returns = false;
        while (true) {
            while (true) {
                if (returns == false) {
                    
                    int collected = 0;
                    for (; mario.canCollect(); collected++) {
                        mario.collect();
                    }
                    field[mario.getColumn()][mario.getRow()] = collected;
                    
                }
                
                else {
                    for (int todrop = field[fieldWidth-mario.getColumn()-1][fieldHeight-mario.getRow()-1]; todrop > 0; todrop--) {
                        mario.tryDrop(Coin.class);
                    }
                }
                this.mario.tryMove();
                if (!mario.canMove()) {
                    int collected = 0;
                    for (; mario.canCollect(); collected++) {
                        mario.collect();
                    }
                    field[mario.getColumn()][mario.getRow()] = collected;
                    if (mario.getRow() % 2 == 0) {
                        turnRight(mario);
                        if (!mario.tryMove()) {
                            break;
                        }
                        turnRight(mario);
                    } else {
                        mario.turnLeft();
                        if (!mario.tryMove()) {
                            break;
                        }
                        mario.turnLeft();
                    }
                }
                
            }
            mario.turnLeft();
            if (returns) {
                break;
            } else {
                returns = true;
            }
        }
    }
    
    private void turnRight(Mario m) {
        m.turnLeft();
        m.turnLeft();
        m.turnLeft();
    }
}
