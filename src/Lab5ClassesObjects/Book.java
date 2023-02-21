package Lab5ClassesObjects;

import java.util.Scanner;

public class Book {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private int count;

    Book() {
    }
    Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    public int getISBN() {
        return ISBN;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public int getCount() {
        return count;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setCount(int count) {
        this.count = count;
    }


    public String toString() {
        return "ISBN=" + ISBN + " bookTitle=" + bookTitle + " numberOfPages=" + numberOfPages;
    }

    public int compareTo(int numberOfPages) {
        return (this.numberOfPages < numberOfPages) ? 1 : (this.numberOfPages == numberOfPages) ? 0 : -1;
    }
}




class MainB {
    public static Book[] books = new Book[5];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Input ISBN, Title, Number Of Page ");
            books[i] = new Book(input.nextInt(), input.next(), input.nextInt());
        }
        displayAll();

        System.out.println("Comparing two Books");
        System.out.println(books[1].compareTo(books[2].getNumberOfPages()));
        System.out.println("isHeavier()");
        System.out.println(isHeavier(books[0]));
    }

    public static void displayAll() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }

    public static boolean isHeavier(Book book) {
        return (book.getNumberOfPages() > 500) ? true : false;
    }
}
