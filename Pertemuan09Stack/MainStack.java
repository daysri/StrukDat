package Pertemuan09Stack;

public class MainStack {
    public static void main(String[] args) {

        //implementasi stack dengan array
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("isi stack Array setelah push:");
        stack.display();
        
        int popped = stack.pop();
        System.out.println("Popped from stack: " + popped);

        // Performing the peek operation
        int peeked = stack.peek();
        System.out.println("Peeked from stack: " + peeked);
        System.out.println("isi stack Arrasetelah pop:");
        stack.display();

        //implementasi stack dengan linked list

        StackLinkedList stackLL = new StackLinkedList();
        stackLL.push(100);  
        stackLL.push(200);
        stackLL.push(300);
        System.out.println("isi stack Linked List setelah push:");
        stackLL.display();
        int poppedLL = stackLL.pop();
        System.out.println("Popped from stack: " + poppedLL);
        System.out.println("isi stack Linked List setelah pop:");
        stackLL.display();

        //implementasi stack dengan library
        java.util.Stack<Integer> stackLib = new java.util.Stack<>();
        stackLib.push(1000);
        stackLib.push(2000);
        stackLib.push(3000);
        System.out.println("isi stack Library setelah push:");
        System.out.println(stackLib);
        int poppedLib = stackLib.pop();
        System.out.println("Popped from stack: " + poppedLib);
        System.out.println("isi stack Library setelah pop:");
        System.out.println(stackLib);

    }

}
