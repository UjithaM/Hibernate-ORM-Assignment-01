package software.ujithamigara.OneToMany.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import software.ujithamigara.OneToMany.dao.BookDao;
import software.ujithamigara.OneToMany.entity.Book;
import software.ujithamigara.OneToMany.util.FactoryConfiguration;

public class BookDaoImpl implements BookDao {

    @Override
    public boolean saveBook(Book book) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Save the book to the database
            session.save(book);

            transaction.commit();
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Book searchBook(int id) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Search for the book with the given ID in the database
            Book book = session.get(Book.class, id);

            transaction.commit();
            session.close();

            return book ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateBook(Book book) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Update the book in the database
            session.merge(book);

            transaction.commit();
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteBook(Book book) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Delete the book from the database
            session.remove(book);

            transaction.commit();
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
