/**
 * Name: Izzy Hurley
 * Lab Name: QueueFromStacks
 * Lab Purpose: The goal of QueueFromStacks is to create a program
 * Date: 9/19/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class QueueFromStacks {
    Stack in;
    Stack out;

    public QueueFromStacks(){
    in = new Stack();
    out = new Stack();}

    public void enqueue(Object element){in.push(element);}    //add an element
    public Object dequeue(){
        if (out.size()>0) {return out.pop();}
        else {
            int size = in.size();
            for (int i=0; i<size; i++){
                out.push(in.pop());
            }
            return out.pop();
        }}              //remove and return the least recent element
    public boolean isEmpty(){ return (in.isEmpty()||out.isEmpty());}
   public int size(){
        return in.size()+out.size();
   }

    //not required, but common
    public Object peek() {
        if (out.size() > 0) {
            return out.peek();
        } else {
            for (int i = 0; i < in.size(); i++) {
                out.push(in.pop());
            }
            return out.peek();
        }            //look at the least recent element without removing
    }
}
