package software.ujithamigara.ManyToMany.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Author {
    @Id
    private Integer id;
    private  String name;
    @ManyToMany(mappedBy = "authorList")
    private List<Book> bookList ;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Author(Integer id, String name, List<Book> bookList, String birthDay) {
        this.id = id;
        this.name = name;
        this.bookList = bookList;
        this.birthDay = birthDay;
    }

    public Author() {
    }

    private  String birthDay;
}
