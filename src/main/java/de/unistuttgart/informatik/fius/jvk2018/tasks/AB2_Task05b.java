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
 * TODO: task for the exercise 5 (b) of worksheet 2
 * @author Sebastian Paule
 */
public abstract class AB2_Task05b extends TaskTemplate {
    /**
     * 
     */
    protected final Mario mario;
    /**
     *
     */
    public AB2_Task05b() {
        super(Presets.cage(6, 6).result(), "Worksheet 2, task 05 (b)");
        this.mario = new Mario(this.simulation);
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
       // TODO (haslersn): In a later ICGE release, this will be called `entitiesAt()` and will
       // have the parameter order swapped (column first). See FIUS/ICGE#55.
       Assertions.assertEquals(1, this.simulation.entitiesWith(0, 0));
       Assertions.assertEquals(1, this.simulation.entitiesWith(0, 1));
       Assertions.assertEquals(1, this.simulation.entitiesWith(0, 3));
       Assertions.assertEquals(1, this.simulation.entitiesWith(1, 0));
       Assertions.assertEquals(1, this.simulation.entitiesWith(1, 5));
       Assertions.assertEquals(1, this.simulation.entitiesWith(3, 4));
       Assertions.assertEquals(1, this.simulation.entitiesWith(5, 3));
       
    }
    
}
