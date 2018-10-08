/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.Entity;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Wall;

/**
 * Task for ex. 1 of worksheet 2
 * 
 * @author Sebastian Paule
 */
public abstract class AB2_Task01 extends TaskTemplate {

    protected final Mario mario;
    protected final Coin coin1;
    protected final Coin coin2;

    /**
     *
     */
    public AB2_Task01() {
        super(Presets.cage(5, 3).result(), "Worksheet 2, task 01");

        this.mario = new Mario(this.simulation);
        this.mario.spawn(0, 0);

        this.coin1 = new Coin(this.simulation);
        this.coin1.spawn(2, 0);

        this.coin2 = new Coin(this.simulation);
        this.coin2.spawn(2, 2);
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        ArrayList<Entity> atCenter = this.simulation.entitiesWith(ent -> ent.getColumn() == 2 && ent.getRow() == 1);
        Assertions.assertEquals(1, atCenter.size());
        Entity ent = atCenter.get(0);
        Assertions.assertTrue(ent instanceof Wall);

        this.solve();
        this.simulation.pause();

        for (Coin c : new Coin[]{ coin1, coin2 }) {
            Assertions.assertEquals(0, c.getColumn());
            Assertions.assertEquals(2, c.getRow());
        }
    }
    
}
