/*
 * This source file is part of the FIUS JVK 2018 project.
 * For more information see github.com/neumantm/ICGE
 * 
 * Copyright (c) 2018 the JVK 2018 project authors.
 */

package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.jvk2018.tasks.AB2_Exercise04;

/**
 * TODO: The base solution for excercise 4 of worksheet 2
 * @author Sebastian Paule
 */
public class AB2_Solution04 extends AB2_Exercise04 {
    
    @Override
    public void solve() {
        // Do not change anything here
        // Do stuff in the next method
        //task a)
        mario.spawn(2, 0);;
        vonObenNachUnten();
        if(!(mario.lastPosition().column == 2)) {
            if(!(mario.lastPosition().row == 4)) {
                this.test = false;
            }
        }
        //task b)
        mario.despawn();
        mario.spawn(2,4);
        vonUntenNachOben();
        if(!(mario.lastPosition().column == 2)) {
            if(!(mario.lastPosition().row == 0)) {
                this.test = false;
            }
        }
        //task c)
        mario.despawn();
        mario.spawn(0,2);
        vonLinksNachRechts();
        if(!(mario.lastPosition().column == 4)) {
            if(!(mario.lastPosition().row == 2)) {
                this.test = false;
            }
        }
        //task d)
        mario.despawn();
        mario.spawn(4,2);
        vonRechtsNachLinks();
        if(!(mario.lastPosition().column == 0)) {
            if(!(mario.lastPosition().row == 2)) {
                this.test = false;
            }
        }
    }
    
    private void vonObenNachUnten() {
        //TODO write code here
    }
    private void vonUntenNachOben() {
        //TODO write code here
    }
    private void vonLinksNachRechts() {
        //TODO write code here
    }
    private void vonRechtsNachLinks() {
        //TODO write code here
    }
    
}
