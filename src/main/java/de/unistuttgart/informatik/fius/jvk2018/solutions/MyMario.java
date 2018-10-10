package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Simulation;

/**
 * This class extends `Mario` adding additional functionality
 */
public class MyMario extends Mario {
    
    /**
     * Constructs a `MyMario` that is associated to a certain `Simulation`
     * 
     * @param sim
     *            The `Simulation` to assiciate this `MyMario` to
     */
    public MyMario(Simulation sim) {
        super(sim);
    }
    
    /**
     * See worksheet 3, task 1 (a)
     */
    public void moveAndCount() {
        // TODO work here (a)
    }
    
    /**
     * @return The current move count
     */
    public int getMoveCount() {
        // TODO: return the current move count
        return 0;
    }
    
    /**
     * See worksheet 3, task 1 (b)
     */
    public void collectCoinAndCount() {
        // TODO work here (b)
    }
    
    /**
     * @return The number of coins that have ever been collected by this `MyMario`
     */
    public int getCollectCoinCount() {
        // TODO: return the current collect count
        return 0;
    }
    
    /**
     * See worksheet 3, task 1 (c)
     */
    public int coinPerStep() {
        // TODO work here (c)
        return 0;
    }
    
    /**
     * See worksheet 3, task 1 (c)
     */
    public int stepPerCoin() {
        // TODO work here (c)
        return 0;
    }
    
    /**
     * Turn mario 180°
     */
    public void turnBack() {
        // Try to uncomment the two codelines in this method. What changes?
        // this.setDelay(10);
        this.turnLeft();
        this.turnLeft();
        // this.resetDelay();
    }
    
    /**
     * Turn mario to the right
     */
    public void turnRight() {
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
    }
    
}
