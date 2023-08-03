package software.ujithamigara;


import software.ujithamigara.dao.BookDao;
import software.ujithamigara.dao.impl.BookDaoImpl;
import software.ujithamigara.entity.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookDao bookDao = new BookDaoImpl();

        int userInput;
        do {
            System.out.print("to save book press (1)\nto search Book press (2)\n" +
                    "to update press(3)\nto delete press(4)\nto exit the program(9)\nInput : ");
            userInput = scanner.nextInt();

            if (userInput == 1){
                Book book = new Book();
                System.out.print("input Book Id : ");
                book.setId(scanner.nextInt());
                System.out.print("input Book title : ");
                scanner.nextLine();
                book.setTitle(scanner.nextLine());
                System.out.print("input Book ISBN : ");
                book.setISBN(scanner.nextLine());

                if(bookDao.saveBook(book)){
                    System.out.println("Book saved successfully :)");
                }else {
                    System.out.println("Book not saved something went wrong :(");
                }

            } else if (userInput == 2) {
                System.out.print("input Book Id ; ");
                Book book = bookDao.searchBook(scanner.nextInt());
                System.out.println("Book Id : "+book.getId()+"\nBook Title : "+book.getTitle()+"\nBook ISBN : " +book.getISBN());

            } else if (userInput == 3) {
                System.out.print("Input Book Id that want to update : ");
                Book book = new Book();
                book.setId(scanner.nextInt());
                scanner.nextLine();
                System.out.print("input new ISBN : ");
                book.setISBN(scanner.nextLine());
                System.out.print("input new Title : ");
                book.setTitle(scanner.nextLine());

                bookDao.updateBook(book);

            } else if (userInput == 4) {
                System.out.print("Input Book Id that want to delete : ");
                scanner.nextLine();
                Book book = bookDao.searchBook(Integer.parseInt(scanner.nextLine()));
                bookDao.deleteBook(book);
            }

        }while (userInput != 9);



    }
}