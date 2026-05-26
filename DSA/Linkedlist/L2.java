package DSA.Linkedlist;

public class L2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {

        Node head;

        // Insert at end
        void insert(int data) {

            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // Print Linked List
        void print() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        // Reverse Linked List
        void reverse() {

            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {

                next = current.next;   // store next node

                current.next = prev;   // reverse link

                prev = current;        // move prev forward

                current = next;        // move current forward
            }

            head = prev;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original Linked List:");
        list.print();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.print();
    }
}