package me.sungbin.chapter2.ch02_21;

public class BookTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("해리포터 1", "안젤리나 졸리");
        library[1] = new Book("해리포터 2", "안젤리나 졸리");
        library[2] = new Book("해리포터 3", "안젤리나 졸리");
        library[3] = new Book("해리포터 4", "안젤리나 졸리");
        library[4] = new Book("해리포터 5", "안젤리나 졸리");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

//        for (int i = 0; i < library.length; i++) {
//            System.out.println(library[i]);
//        }
    }
}
