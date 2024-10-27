import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private String name;
    private String author;
    private short publishingYear;
    private String isbn;
    private String publisher;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, author, publishingYear, isbn, publisher);
    }
}