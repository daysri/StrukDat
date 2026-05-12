package Pertemuan1112LLDLL;

public class SingleLL {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(int value) {
        if (head == null) {
            return false;
        }

        if (head.data == value) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        current.next = current.next.next;
        size--;
        return true;
    }

    public int removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        Node current = head;
        System.out.print("SingleLL: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

