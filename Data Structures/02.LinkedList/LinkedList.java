public class LinkedList {

    Node head;
    Node tail;
    private int size;

    // constructor initialize value to variable
    LinkedList() {
        this.size = 0;
    }// constructor of main class

    /* Linked list Node */
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add First
    public void addFirst(String data) {
        Node newNode = new Node(data); // create new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data); // create new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add At Position
    public void AddAtPosition(int index, String data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        Node newNode = new Node(data);
        if (head == null || index == 0) {
            newNode.next = head;
            head = tail = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i <= index - 1; i++) {
            currNode = currNode.next;
        }
    
        // Insert the new node
        newNode.next = currNode.next;
        currNode.next = newNode;
    
        // Update tail if the new node is added at the end
        if (index == size) {
            tail = newNode;
        }
    }

    // delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
        size--;
    }

    // delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
        tail = secondlast;
        size--;
    }

    // Remove an Index Key
    public void remove(int index) {
        if (head == null || head.next == null) {
            deleteFirst();
            return;
        }
        Node currNode = head;
        if (head.next == null || index == 0) {
            head = tail = null;
            size--;
            return;
        }

        for (int i = 1; i < size - 1; i++) {
            if (i == index) {
                currNode.next = currNode.next.next;
                break;
            }
            currNode = currNode.next;
        }
        size--;
    }

    //Find & Remove Nth node from End
    public void deleteNthfromEnd(int nth){
        if (head == null || head.next == null) {
            deleteFirst();
            return;
        }
        if (nth == size){
            head = head.next;
            return;
        }
        Node prevNode = head;
        int find =  size - nth;
        for (int i = 1;  i < find; i++) {
            prevNode = prevNode.next;
        }

        prevNode.next =  prevNode.next.next;
        size--;
        return;
    }


    // Reverse Iterate
    public void reverseIterate() { // Time complexity - O(n)
        if (head == null || head.next == null) { // Space complexity - O(1)
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse Recursively
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // search (Iterate)
    public boolean searchIterate(String key) {
        if (head == null) {
            return false;
        }
        Node currNode = head;
        boolean result = false;
        while (currNode != null) {
            if (currNode.data == key) {
                result = true;
            }
            currNode = currNode.next;
        }
        return result;
    }

    // search (Recursive)
    public boolean searchRecursive(Node head, String key) {
        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        return searchRecursive(head.next, key);

    }

    // Swap Node in pairs
    public void swapInPairs() {
        if (head == null || head.next == null) {
            // If the list has 0 or 1 node, no swap is possible
            return;
        }
    
        Node prev = null;
        Node current = head;
    
        // Update head to the second node, which will become the new head after swapping
        head = head.next;
    
        while (current != null && current.next != null) {
            Node nextPair = current.next.next; // Store the node after the next one
            Node second = current.next;
    
            // Swap the current pair
            second.next = current;
            current.next = nextPair;
    
            // Link previous pair's last node to the current pair's new first node
            if (prev != null) {
                prev.next = second;
            }
    
            // Move prev and current pointers forward to the next pair
            prev = current;
            current = nextPair;
        }
    }
    

    // Print
    public void printList() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst("B"); // add first node
        ll.addFirst("A");
        ll.addLast("D"); // add last node
        ll.addLast("E");
        // ll.addLast("F");
        // ll.addLast("G");
        ll.AddAtPosition(2, "C"); // add in Middle

        // deleting an item from Linked List
        // ll.deleteFirst(); // delete First Node
        // ll.deleteLast(); // delete Last Node
        // ll.deleteLast();
        // ll.deleteLast();
        // ll.remove(3);
        // ll.deleteNthfromEnd(3);
        // Reverse Linked List
        // ll.reverseIterate();
        // ll.head = ll.reverseRecursive(ll.head);
        // Search an item
        // System.out.println(ll.searchIterate("D"));
        // System.out.println(ll.searchRecursive(ll.head, "C"));
        // ll.swapInPairs();

        ll.printList();
        System.out.println(ll.getSize());
    }

}