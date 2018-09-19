/**
 * Name: Izzy Hurley
 * Lab Name: QueueFromStacksDriver
 * Lab Purpose: The goal of QueueFromStacksDriver is to create a program
 * Date: 9/19/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class QueueFromStacksDriver {
    public static void main(String[] args) {


        QueueFromStacks n = new QueueFromStacks();
        n.enqueue("first on");
        n.enqueue("second on");
        n.enqueue("third on");
        System.out.println("enqueue first on, second on, third on");
        System.out.println("dequeue");
        System.out.println("expected:first on \n"+n.dequeue());
        System.out.println("dequeue");
        System.out.println("expected:second on \n"+n.dequeue());
        System.out.println("dequeue");
        System.out.println("expected:third on \n"+n.dequeue());

    }
}