package me.sungbin.chapter2.ch02_21;

public class ObjectCopyTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("해리포터 1", "안젤리나 졸리");
        library[1] = new Book("해리포터 2", "안젤리나 졸리");
        library[2] = new Book("해리포터 3", "안젤리나 졸리");
        library[3] = new Book("해리포터 4", "안젤리나 졸리");
        library[4] = new Book("해리포터 5", "안젤리나 졸리");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

//        System.arraycopy(library, 0, copyLibrary, 0, 5); // 얕은 복사

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        library[0].setAuthor("박완서");
        library[0].setTitle("나무");

        System.out.println("== library ==");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== copy library ==");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
