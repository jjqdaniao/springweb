package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Author {

    private String firstNmae;
    private String lastName;
    private Set<Book> books;

    public Author() {
    }

    public Author(String firstNmae, String lastName, Set<Book> books) {
        this.firstNmae = firstNmae;
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public void setFirstNmae(String firstNmae) {
        this.firstNmae = firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
