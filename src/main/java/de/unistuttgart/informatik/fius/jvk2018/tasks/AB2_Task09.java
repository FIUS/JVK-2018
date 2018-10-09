/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.tasks;

import org.junit.jupiter.api.Assertions;

import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;
import de.unistuttgart.informatik.fius.icge.simulation.Coin;
import de.unistuttgart.informatik.fius.icge.simulation.CollectableEntity;
import de.unistuttgart.informatik.fius.icge.simulation.Entity;
import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Territory;

/**
 * task for the exercise 9 of worksheet 2
 * 
 * @author Sebastian Paule
 * @author haslersn
 */
public abstract class AB2_Task09 extends TaskTemplate {
    
    protected final Mario mario;
    
    /**
     * 
     */
    public AB2_Task09() {
        super(new Territory(), "Worksheet 2, task 09");
        
        this.mario = new Mario(this.simulation);
        this.mario.spawn(0, 0);
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#solve()
     */
    @Override
    public final void solve() {
        // intentionally empty
    }
    
    /**
     * @see de.unistuttgart.informatik.fius.icge.course.TaskTemplate#test()
     */
    @Override
    public void test() {
        // scanFront
        Assertions.assertFalse(this.scanFront(this.mario));
        Coin cEast = new Coin(this.simulation);
        cEast.spawn(1, 0);
        Assertions.assertTrue(this.scanFront(this.mario));
        this.mario.turnLeft();
        Assertions.assertFalse(this.scanFront(this.mario));
        
        // scanRight
        Assertions.assertTrue(this.scanRight(this.mario));
        this.mario.turnLeft();
        Assertions.assertFalse(this.scanRight(this.mario));
        Coin cNorth = new Coin(this.simulation);
        cNorth.spawn(0, -1);
        Assertions.assertTrue(this.scanRight(this.mario));
        
        // scanBack
        Assertions.assertTrue(this.scanBack(this.mario));
        this.mario.turnLeft();
        Assertions.assertTrue(this.scanBack(this.mario));
        cNorth.despawn();
        Assertions.assertFalse(this.scanBack(this.mario));
        
        // scanLeft
        Assertions.assertTrue(this.scanLeft(this.mario));
        cEast.despawn();
        Assertions.assertFalse(this.scanLeft(this.mario));
        this.mario.turnLeft();
        Assertions.assertFalse(this.scanLeft(this.mario));
        
        // diagonal scans
        this.mario.turnLeft();
        Assertions.assertFalse(this.scanUpperRight(this.mario));
        Assertions.assertFalse(this.scanUpperLeft(this.mario));
        Assertions.assertFalse(this.scanLowerRight(this.mario));
        Assertions.assertFalse(this.scanLowerLeft(this.mario));
        new Coin(this.simulation).spawn(1, 1);
        Assertions.assertFalse(this.scanUpperRight(this.mario));
        Assertions.assertFalse(this.scanUpperLeft(this.mario));
        Assertions.assertTrue(this.scanLowerRight(this.mario));
        Assertions.assertFalse(this.scanLowerLeft(this.mario));
        new Coin(this.simulation).spawn(-1, 1);
        Assertions.assertFalse(this.scanUpperRight(this.mario));
        Assertions.assertFalse(this.scanUpperLeft(this.mario));
        Assertions.assertTrue(this.scanLowerRight(this.mario));
        Assertions.assertTrue(this.scanLowerLeft(this.mario));
        new Coin(this.simulation).spawn(1, -1);
        Assertions.assertTrue(this.scanUpperRight(this.mario));
        Assertions.assertFalse(this.scanUpperLeft(this.mario));
        Assertions.assertTrue(this.scanLowerRight(this.mario));
        Assertions.assertTrue(this.scanLowerLeft(this.mario));
        new Coin(this.simulation).spawn(-1, -1);
        Assertions.assertTrue(this.scanUpperRight(this.mario));
        Assertions.assertTrue(this.scanUpperLeft(this.mario));
        Assertions.assertTrue(this.scanLowerRight(this.mario));
        Assertions.assertTrue(this.scanLowerLeft(this.mario));
        
        // scanAround
        for (Entity c : this.simulation.entitiesWith(ent -> ent instanceof CollectableEntity)) {
            Assertions.assertTrue(this.scanAround(this.mario));
            ((CollectableEntity) c).despawn();
        }
        Assertions.assertFalse(this.scanAround(this.mario));
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is in front of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanFront(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is behind mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanBack(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is at the right of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanRight(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is at the left of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanLeft(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell in front and one to the
     *         right of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanUpperRight(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell in front and one to the
     *         left of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanUpperLeft(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell behind and one to the right
     *         of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanLowerRight(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell behind and one to the left
     *         of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanLowerLeft(Mario mario);
    
    /**
     * @return true iff an instance of `CollectableEntity` is anywhere in the 3x3 field around
     *         mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected abstract boolean scanAround(Mario mario);
    
}
