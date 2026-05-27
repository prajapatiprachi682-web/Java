package DSA.Linkedlist;

public class L6 {

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

        // Remove Duplicates
        void removeDuplicate() {

            Node temp = head;

            while (temp != null && temp.next != null) {

                if (temp.data == temp.next.data) {

                    temp.next = temp.next.next;
                }
                else {

                    temp = temp.next;
                }
            }
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(4);
        list.insert(5);

        System.out.println("Original Linked List:");
        list.print();

        list.removeDuplicate();

        System.out.println("After Removing Duplicates:");
        list.print();
    }
}