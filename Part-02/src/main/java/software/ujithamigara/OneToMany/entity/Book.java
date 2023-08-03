package software.ujithamigara.OneToMany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private String ISBN;

    @ManyToOne
    private Author author;

    public Book(Integer id, String title, String ISBN, Author author) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
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
