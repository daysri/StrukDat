package Pertemuan09Stack;

public class StackLinkedList {
    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflows");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack elements:");
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
