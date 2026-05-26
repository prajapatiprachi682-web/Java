package DSA.Linkedlist;

public class L4 {

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

        // Create Cycle
        void createCycle() {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = head.next;
        }

        // Detect Cycle
        void detectCycle() {

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    System.out.println("Cycle Detected");
                    return;
                }
            }

            System.out.println("No Cycle");
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.createCycle();

        list.detectCycle();
    }
}