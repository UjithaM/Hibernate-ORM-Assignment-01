package software.ujithamigara.OneToMany.dao;

import software.ujithamigara.OneToMany.entity.Author;

public interface AuthorDao {
    public boolean saveAuthor(Author author);
    public Author searchBook(int id);
    public boolean updateBook(Author author);
    public boolean deleteBook(Author author);
}
