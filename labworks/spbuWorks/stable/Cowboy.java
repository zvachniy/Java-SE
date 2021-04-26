package spbuWorks.stable;

public class Cowboy extends Thread {
    public void run() {
        try {

            while (true) {
                Thread.sleep(50);
                synchronized (Stable.class) {   //следующий блок делается если никого нет

                    if (Stable.horses > 0) {
                        Stable.horses--;
                    }
                    Thread.sleep(50);

                    synchronized (Stable.class) {   //следующий блок делается если никого нет
                        Stable.horses++;
                    }

                    if (Stable.horses < 0) {
                        System.out.println("!!!!!!!Цыгане украли Лошадь " + Stable.horses);
                        System.exit(0);
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
