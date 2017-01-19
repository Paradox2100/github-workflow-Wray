/**
 * Created by Alex on 1/19/2017.
 */
public class Dog extends Pets{

    public static String dogBreed;

    public Dog(String furColor, String animalSize, String newDogBreed){
        super(furColor, animalSize);
        dogBreed = newDogBreed;

    }

    public static void dogTraits(){
        System.out.println("Your dogs traits are: " + furColor + ", " + size + ", " + dogBreed + ".");
    }
}
