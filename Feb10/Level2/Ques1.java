package Feb10.Level2;

/*Create a parent class Animal with a method makeSound(). Then, create a Dog class that overrides this method using @Override.
🔹 Steps to Follow:
Define a makeSound() method in Animal class.
Override it in Dog class with @Override.
Instantiate Dog and call makeSound().
*/

class Animal{
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
public class Ques1{
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.makeSound();
    }
}
