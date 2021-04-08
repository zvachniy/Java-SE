package spbu.works.cpsmi;

public class progress {
    private static final int N = 10;

    public static void main(String[] args) {
        Coal myCoalRu = new Coal("антрацит", 3);
        Coal myCoalUSA = new Coal("антрацит", 4);
        for (int i = 400; i > 350; i--) {
            myCoalRu.mine();
            myCoalRu.burn();

            myCoalUSA.mine();
            myCoalUSA.burn();
        }


    }
}
