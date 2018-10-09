package de.unistuttgart.informatik.fius.jvk2018.solutions;


import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.simulation.Simulation;

/**
 * New MyMario class extending Mario
 */
public class MyMario extends Mario {

    /**
     * Constructor of MyMario class
     * 
     * @param sim the simulation to create this entity in
     */
    public MyMario(Simulation sim) {
        super(sim);
    }

    /**
     * Turn mario 180°
     */
    public void turnBack() {
        // try to uncomment th two codelines in this method. What changes?
        // this.setDelay(10);
        this.turnLeft();
        this.turnLeft();
        // this.resetDelay();
    }
}
