package software.ujithamigara.OneToOne.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private Integer id;
    private String title;
    private String ISBN;

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

    public Book(Integer id, String title, String ISBN) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
    }
}
