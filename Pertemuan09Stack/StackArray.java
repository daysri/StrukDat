package Pertemuan09Stack;

public class StackArray {
    int size;
    int top=-1;
    int[] stackArray;

    public StackArray(int size){
        this.size = size;
        stackArray = new int[size];
    }

    public void push(int data){
    if(top < size - 1){
        stackArray[++top] = data;
    } else {
        System.out.println("Stack Overflows");
     }
    }

    public int pop() {
    if (top > -1) {
        return stackArray[top--];
    } else {
        System.out.println("Stack Underflows");
        return -1;
    }
    }
    
    public int peek() {
    if (top > -1) {
        return stackArray[top];
    } else {
        System.out.println("Stack is Empty");
        return -1;
    }
    }
    public void display() {
        if (top > -1) { 
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is Empty");
        }
    }



}
