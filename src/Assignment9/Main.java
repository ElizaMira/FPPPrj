package Assignment9;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl ArrayQ = new ArrayQueueImpl();
        ArrayQ.dequeue();
        ArrayQ.peek();

        ArrayQ.enqueue(2);
        ArrayQ.enqueue(4);
        ArrayQ.enqueue(6);
        ArrayQ.enqueue(8);
        ArrayQ.enqueue(12);
        ArrayQ.enqueue(13);
        ArrayQ.enqueue(14);
        ArrayQ.enqueue(15);
        ArrayQ.enqueue(16);
        ArrayQ.enqueue(17);
        ArrayQ.Display();
         ArrayQ.dequeue();
         ArrayQ.Display();
       ArrayQ.enqueue(18);
       ArrayQ.enqueue(19);
       ArrayQ.Display();
       System.out.println("Elements in the queue: "+ArrayQ.size());

        System.out.println("The peek value is: "+ArrayQ.peek());
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();
        ArrayQ.dequeue();

        ArrayQ.peek();

    }
}
