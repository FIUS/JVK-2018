package de.unistuttgart.informatik.fius.jvk2018.tasks;

import de.unistuttgart.informatik.fius.icge.course.Presets;
import de.unistuttgart.informatik.fius.icge.course.TaskTemplate;

/**
 * Mario und Luigi veranstalten ein Wettrennen.
 * Sie würfeln nacheinander und dürfen erst einen Schritt nach vorne machen, wenn die summe der Augenzahlen 18 oder groesser
 * ist.
 * Wenn einer einen Schritt gemacht hat wird die Summe der Augenzahlen für sie zurückgesetzt.
 * Der erste der die Linke Seite erreicht hat gewonnen.
 * Er soll ausgeben dass er gewonnen hat.
 * 
 * @author Weilinger
 */
public abstract class AB3_Task08 extends TaskTemplate {
    public AB3_Task08() {
        super(Presets.cage(15, 2).result(), "Worksheet 2, task 07");
    }
    
    @Override
    public void test() {
        this.solve();
        this.simulation.pause();
    }
}
