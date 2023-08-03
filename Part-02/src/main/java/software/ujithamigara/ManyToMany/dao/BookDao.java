package software.ujithamigara.ManyToMany.dao;

import software.ujithamigara.ManyToMany.entity.Book;

public interface BookDao {
    public boolean saveBook(Book book);
    public Book searchBook(int id);
    public boolean updateBook(Book book);
    public boolean deleteBook(Book book);
}
