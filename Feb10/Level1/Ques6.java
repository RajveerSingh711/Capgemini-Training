package Feb10.Level1;

/*Create a custom annotation @Author(name="Author Name"). Apply it to a class and use Reflection to retrieve and display the annotation value at runtime.
*/

import java.lang.annotation.*;;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
    String name();
}
@Author(name="Author Name")
class Book{
    public void display(){
        System.out.println("Book class");
    }
}
public class Ques6 {
    public static void main(String[] args){
        Class<Book> cls=Book.class;
        if(cls.isAnnotationPresent(Author.class)){
            Author author = cls.getAnnotation(Author.class);
            System.out.println("Author Name: "+author.name());
        }
    }
}
