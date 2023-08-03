package software.ujithamigara.OneToMany.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import software.ujithamigara.OneToMany.dao.AuthorDao;
import software.ujithamigara.OneToMany.entity.Author;
import software.ujithamigara.OneToMany.util.FactoryConfiguration;

public class AuthorDaoImpl implements AuthorDao {

    @Override
    public boolean saveAuthor(Author author) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Save the book to the database
            session.persist(author);

            transaction.commit();
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Author searchBook(int id) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Search for the book with the given ID in the database
            Author author = session.get(Author.class, id);

            transaction.commit();
            session.close();

            return author ;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateBook(Author author) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Update the book in the database
            session.merge(author);

            transaction.commit();
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteBook(Author author) {
        try {
            Session session = FactoryConfiguration.getInstance().getSession();
            Transaction transaction = session.beginTransaction();

            // Delete the book from the database
            session.remove(author);

            transaction.commit();
            session.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
