import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class L3 {
    public static void main(String[] args) {
        File input = new File("./src/DB/books.json");
        Gson gson = new Gson();
        List<Visitor> visitors = List.of();
        try{
            visitors = gson.fromJson(new FileReader(input), new TypeToken<List<Visitor>>(){});
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }
        //Задание 1
//       visitors.forEach(visitor -> System.out.println(visitor.getName() + " " + visitor.getSurname()));
//       System.out.println(visitors.size());
        //Задание 2
//        Set<Book> uniqueBook = visitors.stream()
//                .map(Visitor::getFavoriteBooks)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toSet());
//        System.out.println("Unique books: ");
//        uniqueBook.forEach(System.out::println);
//        System.out.println(uniqueBook.size());
        //Задание 3
//        System.out.println("Sorted unique books:");
//        uniqueBook.stream()
//                .sorted(Comparator.comparing(Book::getPublishingYear))
//                .forEach(System.out::println);
        //Задание 4
//        boolean hasJA = uniqueBook.stream().anyMatch(book -> book.getAuthor().equals("Jane Austen"));
//        System.out.println(hasJA);
        //Задание 5
//        List<List<Book>> uniqueBook = visitors.stream()
//                .map(Visitor::getFavoriteBooks)
//                .toList();
//        List<Integer> favBooksCountList = new ArrayList<>();
//        for (List<Book> books : uniqueBook) {
//            favBooksCountList.add(books.size());
//        }
//        System.out.println(Collections.max(favBooksCountList));
        //Задание 6
//        double averageBooks = visitors.stream()
//                .mapToInt(visitor -> visitor.getFavoriteBooks().size())
//                .average().orElse(0);
//        visitors.stream()
//                .filter(Visitor::isSubscribed)
//                .map(visitor -> {
//                    int favoriteBooksCount = visitor.getFavoriteBooks().size();
//                    String sms;
//                    if (favoriteBooksCount > averageBooks) {
//                        sms = "You are a Bookworm";
//                    } else if (favoriteBooksCount < averageBooks) {
//                        sms = "Read more";
//                    } else {
//                        sms = "Fine!";
//                    }
//                    return visitor.getPhone() + ", " + sms;
//                })
//                .forEach(System.out::println);
    }
}