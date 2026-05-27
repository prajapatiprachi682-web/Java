
package DSA.Linkedlist;

public class L5 {

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

        // Merge Two Sorted Linked Lists
        static Node merge(Node head1, Node head2) {

            Node dummy = new Node(-1);

            Node temp = dummy;

            while (head1 != null && head2 != null) {

                if (head1.data < head2.data) {

                    temp.next = head1;
                    head1 = head1.next;
                }
                else {

                    temp.next = head2;
                    head2 = head2.next;
                }

                temp = temp.next;
            }

            // Remaining nodes
            if (head1 != null) {
                temp.next = head1;
            }

            if (head2 != null) {
                temp.next = head2;
            }

            return dummy.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();

        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        LinkedList list2 = new LinkedList();

        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        Node mergedHead = LinkedList.merge(list1.head, list2.head);

        Node temp = mergedHead;

        System.out.println("Merged Linked List:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}