/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Wall;
import de.unistuttgart.informatik.fius.icge.territory.Territory;

/**
 * Task for the exercise 10 c of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Exercise10c extends TaskTemplate {
    protected final Mario mario;
    protected final Coin[] coins = new Coin[20];
    /**
     * @param initialTty
     * @param name
     */
    public AB2_Exercise10c() {
        super(Presets.cage(10, 10).result(), "AB 2 Exercise 10 (c)");
        mario = new Mario(this.simulation);
        for(int i=0; i!=20; ++i){
            coins[i] = new Coin(this.simulation); 
        }
        mario.spawn(0, 9);
        coins[0].spawn(9,1);
        coins[1].spawn(9,2);
        coins[2].spawn(9,3);
        coins[3].spawn(8,3);
        coins[4].spawn(8,4);
        coins[5].spawn(7,4);
        coins[6].spawn(6,4);
        coins[7].spawn(6,5);
        coins[8].spawn(6,6);
        coins[9].spawn(5,6);
        coins[10].spawn(5,7);
        coins[11].spawn(5,8);
        coins[12].spawn(5,9);
        coins[13].spawn(4,9);
        coins[14].spawn(2,9);
        coins[15].spawn(1,9);
        coins[16].spawn(3,9);
        coins[17].spawn(8,0);
        coins[18].spawn(9,0);
        coins[19].spawn(7,0);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public void solve() {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
        Assertions.assertEquals(this.mario.lastPosition().column,7);
        Assertions.assertEquals(this.mario.lastPosition().row,0);
        
    }
    
}
