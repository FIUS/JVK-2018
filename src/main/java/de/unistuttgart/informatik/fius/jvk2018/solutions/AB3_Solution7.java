package de.unistuttgart.informatik.fius.jvk2018.solutions;

import de.unistuttgart.informatik.fius.icge.simulation.Mario;
import de.unistuttgart.informatik.fius.icge.territory.Territory;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB2_Exercise07;
import de.unistuttgart.informatik.fius.jvk2018.tasks.AB3_Exercise7;

public class AB3_Solution7 extends AB3_Exercise7 {


    @Override
    public void solve() {
        Mario luigi = new Mario(this.simulation);
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
        return (int) (6.0 * Math.random()) + 1;
    }
}
