package Assignment9;

import DataStructure.ArrayStack;
import DataStructure.LinkedQueue;

public class LinkedStack
{
    private class Node {

        Object data;
        Node reflink;
    }
        Node top;
        int count;
    LinkedStack() { this.top = null; }

    public void push(Object x) //
    {

        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nStack is full");
            return;
        }

        temp.data = x;

        temp.reflink = top;

        top = temp;
        count++;
    }

    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("Empty Stack");
            return;
        }

        top = top.reflink;
        count--;
    }
    public Object peek()
    {

        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean isEmpty() { return top == null; }
    public int size()
    {
        return count;
    }
    public void display() {

        if (top == null) {
            System.out.printf("\nStack is empty");

        } else {
            Node temp = top;

            System.out.println("Linked Stack:");
            if(temp==null)
                System.out.println("empty");
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.reflink;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        LinkedStack Lstk=new LinkedStack();

        Lstk.push('A');
        Lstk.push('B');
        Lstk.push('C');
        Lstk.push('D');
        System.out.println("size:"+Lstk.size());
        Lstk.display();
        Lstk.pop();
        Lstk.pop();
        Lstk.display();
        Lstk.push('G');
        System.out.println(Lstk.peek());
        Lstk.display();

    }

}


