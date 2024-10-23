public class Stack {
    Node head;
    private int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Checking Empty
    public boolean isEmpty(){
        return head == null;
    }

    // Push
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Pop
    public int pop() {
        if (head == null) {
            System.out.println("Empty");
            return 0;
        }
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }

    //Peek
    public int peek(){
        if (head == null) {
            System.out.println("Empty");
            return 0;
        }
        return head.data;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Stack st =  new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        System.out.println("Size: " + st.getSize());
    }
}