package de.unistuttgart.informatik.fius.jvk2018.solutions;

import java.util.Random;

import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB3_Task07;

/**
 * Solution class for worksheet 3, task 7
 */
public class AB3_Solution07 extends AB3_Task07 {


    @Override
    public void solve() {
        Mario luigi = new Mario(this.simulation); // TODO: Use a Luigi object once the Luigi class is added to ICGE
        luigi.spawn(0, 1);
        int marioCount = 0;
        int luigiCount = 0;
        while (this.mario.canMove() && luigi.canMove()) {
            marioCount += dice();
            luigiCount += dice();
            if (marioCount >= 18) {
                this.mario.move();
                marioCount = 0;
            }
            if (luigiCount >= 18) {
                luigi.move();
                luigiCount = 0;
            }
        }
        if (this.mario.canMove()) {
            luigi.print("LUIGI HAT GEWONNEN");
        } else {
            this.mario.print("MARIO HAT GEWONNEN");
        }
    }

    /**
     * standard dice should be implemented here
     *
     * @return random integer value from 1 to 6
     */
    public int dice() {
        return 1 + new Random().nextInt(6);
    }
}
