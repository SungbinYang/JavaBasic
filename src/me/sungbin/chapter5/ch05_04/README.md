# 03. 스택(Stack) 구현하기

## Stack의 특징

- 맨 마지막 위치(top)에서만 자료를 추가,삭제, 꺼내올 수 있음 ( 중간의 자료를 꺼낼 수 없음)

- Last In First Out ( 후입선출 ) 구조

- 택배 상자가 쌓여있는 모양

- 가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 이를 무를때 사용할 수 있음

- 함수의 메모리는 호출 순서에 따른 stack 구조

- jdk 클래스 : Stack

## 배열을 활용하여 Stack 구현하기

MyArrayStack.java
``` java
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

```

MyArrayStackTest.java
``` java
package me.sungbin.chapter5.ch05_04;

public class MyArrayStackTest {
    public static void main(String[] args) {

        MyArrayStack stack = new MyArrayStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printAll();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

```
