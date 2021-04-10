package spbuWorks.dt;

public class Alice {
    public void walk(){
        int steps = 0;
        while (steps < 10) {
            Leg l = new Leg();
            l.up();
            l.step();
            l.down();
            steps++;
        }
    }
}

