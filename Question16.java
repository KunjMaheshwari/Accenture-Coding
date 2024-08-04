//Clone a linked list with the random points 

public class Question16 {

    class Node {
        int data;
        Node next;
        Node random;

        Node() {
            this.data = 0;
            this.next = null;
            this.random = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }

        Node(int data, Node nextNode, Node randomNode) {
            this.data = data;
            this.next = nextNode;
            this.random = randomNode;
        }
    }

    public Node copyRandomList(Node head) {

        Node temp = head;

        // step 1
        while (temp != null) {
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        // step 2
        Node itr = head;
        while (itr != null) {
            if (itr.random != null) {
                itr.next.random = itr.random.next;
            }
            itr = itr.next.next;
        }

        // step 3
        Node dummy = new Node(0);
        itr = head;
        temp = dummy;
        Node fast;
        while (itr != null) {
            fast = itr.next.next;
            temp.next = itr.next;
            itr.next = fast;
            temp = temp.next;
            itr = fast;
        }
        return dummy.next;
    }
}
