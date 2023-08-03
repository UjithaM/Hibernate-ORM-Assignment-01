package software.ujithamigara.ManyToMany;

import software.ujithamigara.ManyToMany.dao.AuthorDao;
import software.ujithamigara.ManyToMany.dao.BookDao;
import software.ujithamigara.ManyToMany.dao.impl.AuthorDaoImpl;
import software.ujithamigara.ManyToMany.dao.impl.BookDaoImpl;
import software.ujithamigara.ManyToMany.entity.Author;
import software.ujithamigara.ManyToMany.entity.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        AuthorDao   authorDao = new AuthorDaoImpl();

        Author author1 = new Author();
        author1.setId(1);
        author1.setName("johan");
        author1.setBirthDay("2003/15/15");

        Author author2 = new Author();
        author2.setId(2);
        author2.setName("Wick");
        author2.setBirthDay("20030/54/54");

        Book book1 = new Book();
        book1.setId(1);
        book1.setTitle("fijt");
        book1.setISBN("ijafie35451*54165");

        Book book2 = new Book();
        book2.setId(2);
        book2.setTitle("mitasd");
        book2.setISBN("ijafieakl846*54165");

        Book book3 = new Book();
        book3.setId(3);
        book3.setTitle("fukakjm");
        book3.setISBN("ikahd6468*54165");

        List<Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author2);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        author1.setBookList(bookList);
        author2.setBookList(bookList);

        book1.setAuthorList(authorList);
        book3.setAuthorList(authorList);
        book3.setAuthorList(authorList);

        authorDao.saveAuthor(author1);
        authorDao.saveAuthor(author2);

        bookDao.saveBook(book1);
        bookDao.saveBook(book2);
        bookDao.saveBook(book3);
    }
}
