package software.ujithamigara.OneToMany;


import software.ujithamigara.OneToMany.dao.AuthorDao;
import software.ujithamigara.OneToMany.dao.BookDao;
import software.ujithamigara.OneToMany.dao.impl.AuthorDaoImpl;
import software.ujithamigara.OneToMany.dao.impl.BookDaoImpl;
import software.ujithamigara.OneToMany.entity.Author;
import software.ujithamigara.OneToMany.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorDao authorDao = new AuthorDaoImpl();
        BookDao bookDao = new BookDaoImpl();

        Author author = new Author();
        author.setId("1");
        author.setName("mihatfda");
        author.setBirthDay("2003/08/01");

        Book book1 = new Book(1, "ahgfuageuiaehn", "hgiagd5+955+98", author);
        Book book2 = new Book(2, "jhifaefuio", "hgiagd5adadaw98", author);
        Book book3 = new Book(3, "aouiehfoaehn", "gaeg45654g+98", author);



        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);


        author.setBookList(bookList);

        authorDao.saveAuthor(author);

        bookDao.saveBook(book1);
        bookDao.saveBook(book2);
        bookDao.saveBook(book3);

    }
}