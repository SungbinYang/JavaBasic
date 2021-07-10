package me.sungbin.chapter2.ch02_23;

import me.sungbin.chapter2.ch02_21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("해리포터 1", "안젤리나 졸리"));
        library.add(new Book("해리포터 2", "안젤리나 졸리"));
        library.add(new Book("해리포터 3", "안젤리나 졸리"));
        library.add(new Book("해리포터 4", "안젤리나 졸리"));
        library.add(new Book("해리포터 5", "안젤리나 졸리"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}
