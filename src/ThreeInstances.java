public class ThreeInstances {

    static int count = 0;


    ThreeInstances() {
        ++count;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        ThreeInstances instance = null;
        for (int i = 0; i < 3; ++i) {
            instance = new ThreeInstances();
        }

        System.out.println("Number of instances ="+ instance.getCount());

    }
}


