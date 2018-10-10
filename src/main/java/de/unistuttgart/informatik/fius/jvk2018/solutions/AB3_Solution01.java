/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.jvk2018.tasks.AB3_Task01;

/**
 * @author ruffdd
 * @author haslersn
 */
public class AB3_Solution01 extends AB3_Task01 {
    
    @Override
    public void solve() {
        // Die Aufgabe 1 ist in `MyMario.java` zu bearbeiten.
        // Hier ist nichts zu tun, aber du kannst diese Methode verwenden, um deine Loesung zu testen.
        // Zum Beispiel so:
        
        MyMario mario = new MyMario(this.simulation);
        mario.spawn(0, 0);
        mario.moveAndCount();
        mario.moveAndCount();
        mario.moveAndCount();
        mario.println(mario.getMoveCount());
    }
}
