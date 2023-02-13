import java.util.Scanner;

public class LinkedListSample {

    Scanner scanner = new Scanner(System.in);
    public class Node {
        int data;
        Node next;

        Node () {
            next = null;
        }
    }
    Node head = null;

    public static void main(String[] args) {

        char isQuit;
        System.out.println("Press [1] to quit, any to enter");

    }

    public void mainLoop() {
        char chosenOp;
        System.out.println("(i)nsert front node, i(n)sert back node, in(s)ert between nodes");
        System.out.println("(d)elete front node, d(e)lete back node, de(l)ete between nodes");
        System.out.println("(t)raverse, e(x)it\nChoose:");
        chosenOp = scanner.nextLine().charAt(0);

        while (chosenOp != 'x') {
            switch (chosenOp) {
                case 'i' : {
                    insertFrontNode();
                    break; }
                case 'n' : {
                    insertBackNode();
                    break; }
                case 's' : {
                    insertBetweenNodes();
                    break; }
                case 'd' : {
                    deleteFrontNode();
                    break; }
                case 'e' : {
                    deleteBackNode();
                    break; }
                case 'l' : {
                    deleteBetweenNodes();
                    break; }
                case 't' : {
                    traverse();
                    break; }
                default:
                    System.out.println("Invalid input!");
            }
            System.out.println("(i)nsert front node, i(n)sert back node, in(s)ert between nodes");
            System.out.println("(d)elete front node, d(e)lete back node, de(l)ete between nodes");
            System.out.println("(t)raverse, e(x)it\nChoose:");
            chosenOp = scanner.nextLine().charAt(0);
        }
    }

    public void traverse() {
        Node temp = new Node();
        temp = head;
        while (temp != null) {
            System.out.println("\t\t|" + temp.data + "|");
            temp = temp.next;
        }
    }

    public void insertFrontNode() {
        Node head2 = new Node();
        System.out.println("Enter a number: ");
        head2.data = Integer.parseInt(scanner.nextLine());
        if (head == null) {
            head2.next = null;
        } else {
            head2.next = head;
        }
        head = head2;
    }
}
