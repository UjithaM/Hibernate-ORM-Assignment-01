package software.ujithamigara.OneToMany.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {

    @Id
    private String id;

    private String name;

    private String birthDay;

    @OneToMany(mappedBy = "author")
    private List<Book> bookList = new ArrayList<>();

    public Author() {
    }

    public Author(String id, String name, String birthDay, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.bookList = bookList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
