package Assignment9;

public class ArrayQueueImpl {

        private int[] arr = new int[10];


        private int front = -1;
        private int rear = 0;
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            return arr[front];
        }
        public void enqueue(int obj){
        if(rear==arr.length)
        {
            resize();
        }
        arr[rear]=obj;
        rear++;

        }
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];

            }
            if(rear<arr.length) arr[rear]=0;
            rear--;

            return 1;
        }

    private void resize()
    {
        System.out.println("resizing");
        int len=arr.length;
        int newlen=2*len;
        int[] newArray=new int[newlen];
        System.arraycopy(arr,0,newArray ,0,len);
        arr=newArray ;

    }
        public boolean isEmpty(){

            if (front==  rear || (front==-1 && rear==0) )
            {return true;}
            return false;
        }
        public int size(){

            return rear;
        }

    public void Display()
    {
        int i;

        for (i = front+1; i < rear; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return;
    }

}

