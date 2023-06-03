public  class StaticExample {
    static int count = 0;

//Constructor
    StaticExample() {
        ++count;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        StaticExample instance = null;
        for (int i = 0; i < 3; ++i) {
            instance = new StaticExample();
        }
        //Callwith object instance
        System.out.println("Number of instances so far="+ instance.getCount());
        // We can use class name directly and call function becos it is static method
        System.out.println("Number of instances so far="+ StaticExample.getCount());
    }
}
