package DSA.Linkedlist;

public class L7 {

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
        Node reverse(Node head) {

            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {

                next = current.next;

                current.next = prev;

                prev = current;

                current = next;
            }

            return prev;
        }

        // Check Palindrome
        boolean isPalindrome() {

            if (head == null || head.next == null) {
                return true;
            }

            // Find middle
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse second half
            Node secondHalf = reverse(slow);

            Node firstHalf = head;

            // Compare both halves
            while (secondHalf != null) {

                if (firstHalf.data != secondHalf.data) {
                    return false;
                }

                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        list.print();

        if (list.isPalindrome()) {

            System.out.println("Palindrome Linked List");
        }
        else {

            System.out.println("Not Palindrome");
        }
    }
}