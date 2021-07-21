package me.sungbin.chapter5.ch05_04;

import me.sungbin.chapter5.ch05_02.MyArray;

public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("stack is full");
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.removeElement(--top);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.getElement(--top);
    }

    public boolean isFull() {
        return top == arrayStack.ARRAY_SIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printAll() {
        arrayStack.printAll();
    }
}
