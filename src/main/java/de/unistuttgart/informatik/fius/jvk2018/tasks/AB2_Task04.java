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
import de.unistuttgart.informatik.fius.icge.simulation.Mario;

/**
 * The Task for the 4 excercise on worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task04 extends TaskTemplate {

    private final Mario marioA = new Mario(this.simulation);
    private final Mario marioB = new Mario(this.simulation);
    private final Mario marioC = new Mario(this.simulation);
    private final Mario marioD = new Mario(this.simulation);

    /**
     *
     */
    public AB2_Task04() {
        super(Presets.cage(10, 5).result(), "Worksheet 2, task 04 (a-d)");
        this.marioA.spawn(2, 0);
        this.marioB.spawn(2,4);
        this.marioC.spawn(0,2);
        this.marioD.spawn(4,2);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public final void solve() {
        // task 4a
        vonObenNachUnten(this.marioA);

        // task 4b
        vonUntenNachOben(this.marioB);

        // task 4c
        vonLinksNachRechts(this.marioC);

        // task 4d
        vonRechtsNachLinks(this.marioD);
    }

    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();

        // task 4a
        Assertions.assertEquals(this.marioA.lastPosition().column, 2);
        Assertions.assertEquals(this.marioA.lastPosition().row, 4);

        // task 4b
        Assertions.assertEquals(this.marioB.lastPosition().column, 2);
        Assertions.assertEquals(this.marioB.lastPosition().row, 0);

        // task 4c
        Assertions.assertEquals(this.marioC.lastPosition().column, 4);
        Assertions.assertEquals(this.marioC.lastPosition().row, 2);

        // task 4d
        Assertions.assertEquals(this.marioD.lastPosition().column, 0);
        Assertions.assertEquals(this.marioD.lastPosition().row, 2);
    }

    /**
     *
     */
    protected abstract void vonObenNachUnten(Mario mario);

    /**
     *
     */
    protected abstract void vonUntenNachOben(Mario mario);

    /**
     *
     */
    protected abstract void vonLinksNachRechts(Mario mario);

    /**
     *
     */
    protected abstract void vonRechtsNachLinks(Mario mario);

}
