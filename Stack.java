/**
 * Name: Izzy Hurley
 * Lab Name: Stack
 * Lab Purpose: The goal of Stack is to create a program
 * Date: 9/10/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class Stack {
    private int size;
    private Node top;

    public Stack(){
        Node top = null;
        size = 0;
    }

    public void push(Object o){
        Node Otop = top;
        Node Ntop = new Node(o);
        top = Ntop;
        top.pointMe(Otop);
        size++;
    }

    public Object pop(){
        if (size== 0){return null;}
        Node Ntop = top.getPointer(0);
        Node Otop = top;
        top = Ntop;
        size--;
        return Otop.getData();

    }
    public Object peek(){
        if (size == 0){return null;}
        return top.getData();
    }

    public int size(){return size;}

    public boolean isEmpty(){if (size==0) return true; else return false;}


}
