/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB2_Task09;

/**
 * Solution class for worksheet 2, task 9
 * 
 * @author Sebastian Paule
 */
public class AB2_Solution09 extends AB2_Task09 {
    
    /**
     * @return true iff an instance of `CollectableEntity` is in front of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanFront(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is behind mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanBack(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is at the right of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanRight(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is at the left of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanLeft(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell in front and one to the
     *         right of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanUpperRight(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell in front and one to the
     *         left of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanUpperLeft(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell behind and one to the right
     *         of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanLowerRight(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is one cell behind and one to the left
     *         of mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanLowerLeft(Mario mario) {
        // TODO work here
        return false;
    }
    
    /**
     * @return true iff an instance of `CollectableEntity` is anywhere in the 3x3 field around
     *         mario
     *
     * @param mario
     *            The mario to scan relative to
     */
    protected boolean scanAround(Mario mario) {
        // TODO work here
        return false;
    }
    
}
