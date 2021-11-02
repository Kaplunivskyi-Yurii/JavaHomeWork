package com.pb.kaplunivskyi.hw5;

public class Liberty {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов И. И.", 1, "ИФ", "2000 г.", "+3809911111");
        Reader reader2 = new Reader("Сидоров А. В.", 2, "ИФ", "1980 г.", "+3806622222");
        Reader reader3 = new Reader("Гусев К. В.", 3, "ИФ", "2010 г.", "+3809333333");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключения", "Ключков");
        Book book2 = new Book("Словарь", "Семенов");
        Book book3 = new Book("Энциклопедия", "НАУ");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Космобиолухи, Громыко", "Java программирование, Шилдт");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(3);
        reader2.returnBook("Приключения");
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}