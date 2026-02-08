package Feb7.Level2;

/*Problem Statement: You have a list of Book objects with the following fields: title, author,
genre, and rating. Write a method to perform the following operations:
1. Filter: Select books that are of genre "Science Fiction" with a rating greater than 4.0.
2. Transform: Create a new list of BookRecommendation objects containing title and
rating.
3. Sort: Sort these books by their rating in descending order.
4. Paginate: Return the top 10 books as a paginated result, assuming each page shows 5
books.
*/

import java.util.*;
import java.util.stream.*;

public class Book {
    private String title;
    private String author;
    private String genre;
    private double rating;
    public Book(String title,String author,String genre,double rating){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.rating=rating;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public double getRating(){
        return rating;
    }
    static class BookRecommendation{
        private String title;
        private double rating;
        public BookRecommendation(String title, double rating){
            this.title=title;
            this.rating=rating;
        }
        public double getRating(){
            return rating;
        }
        @Override
        public String toString(){
            return title+" (Rating: "+rating+")";
        }
    }
    public static List<BookRecommendation> getPaginatedRecommendations(List<Book> books,int pageNumber,int pageSize){
        return books.stream().filter(b->"Science Fiction".equals(b.getGenre())).filter(b->b.getRating() > 4.0).map(b->new BookRecommendation(b.getTitle(),b.getRating())).sorted(Comparator.comparingDouble(BookRecommendation::getRating).reversed()).limit(10).skip((long)(pageNumber-1)*pageSize).limit(pageSize).collect(Collectors.toList());
    }
    public static void main(String[] args){
        List<Book> books=Arrays.asList(
                new Book("Dune","Frank Herbert","Science Fiction",4.6),
                new Book("Foundation","Isaac Asimov","Science Fiction",4.4),
                new Book("Neuromancer","William Gibson","Science Fiction",4.1),
                new Book("Snow Crash","Neal Stephenson","Science Fiction",4.3),
                new Book("Hyperion","Dan Simmons","Science Fiction",4.5),
                new Book("The Martian","Andy Weir","Science Fiction",4.7),
                new Book("Ender's Game","Orson Scott Card","Science Fiction",4.2),
                new Book("1984","George Orwell","Dystopian",4.8),
                new Book("Brave New World","Aldous Huxley","Science Fiction",4.0),
                new Book("Project Hail Mary","Andy Weir","Science Fiction",4.8),
                new Book("Red Rising","Pierce Brown","Science Fiction",4.3)
        );
        int pageSize=5;
        System.out.println("Page 1:");
        getPaginatedRecommendations(books,1,pageSize).forEach(System.out::println);
        System.out.println("\nPage 2:");
        getPaginatedRecommendations(books,2,pageSize).forEach(System.out::println);
    }
}
