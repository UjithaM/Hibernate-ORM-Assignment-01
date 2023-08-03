package software.ujithamigara.ManyToMany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private String ISBN;
    @ManyToMany
    private List<Author> authorList;

    public Book(Integer id, String title, String ISBN, List<Author> authorList) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.authorList = authorList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book() {
    }

}
