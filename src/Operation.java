public class Operation {
    int data=50;
    void Change(Operation op)
    {
        op.data= op.data+100;
    }
    public static void main(String args[])
    {
        Operation op=new Operation();
        //before change
        System.out.println("before change "+op.data);
        //Passing object
        op.Change(op);
        System.out.println("after change "+op.data);

    }
}
