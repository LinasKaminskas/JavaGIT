import Data.Cat;
import Data.Dog;
import Data2.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog =new Dog("Dog - au");
        Animal cat = new Cat("Cat - miau");
        Animal[] array ={new Dog("au - au"), new Cat("miau - miau")};
        System.out.println(dog.getVoices());
        System.out.println(cat.getVoices());
    }
}
