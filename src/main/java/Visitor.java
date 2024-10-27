import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Visitor {
    private String name;
    private String surname;
    private String phone;
    private boolean subscribed;
    private List<Book> favoriteBooks;
}