package software.ujithamigara.OneToOne;

import software.ujithamigara.OneToOne.dao.AuthorDao;
import software.ujithamigara.OneToOne.dao.BookDao;
import software.ujithamigara.OneToOne.dao.impl.AuthorDaoImpl;
import software.ujithamigara.OneToOne.dao.impl.BookDaoImpl;
import software.ujithamigara.OneToOne.entity.Author;
import software.ujithamigara.OneToOne.entity.Book;

public class Main {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();
        AuthorDao authorDao = new AuthorDaoImpl();

        Book book = new Book(1, "lamantha", "8748-diaojdo-546545");
        Author author =new Author("1", "jhon", book, "2003/08/01");

        bookDao.saveBook(book);
        authorDao.saveAuthor(author);
    }
}