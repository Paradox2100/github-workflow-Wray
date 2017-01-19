/**
 * Created by Alex on 1/19/2017.
 */
public class PetStore {

    private String storeName;
    private static int numCats;
    private static int numDogs;
    private static int numHamsters;

    public PetStore(String newName, int cats, int dogs, int hamsters){
        storeName = newName;
        numCats = cats;
        numDogs = dogs;
        numHamsters = hamsters;
    }

    public static void inventory(){
        System.out.println("The number of cats remaining for purchase is: " + numCats);
        System.out.println("The number of dogs remaining for purchase is: " + numDogs);
        System.out.println("The number of Hamsters remaining for purchase is: " + numHamsters);

    }

    public static void buyCat(){
        numCats--;
        System.out.println("You bought a cat!" + "\n" + "Thank you for your order.");
    }

    public static void buyDog(){
        numDogs--;
        System.out.println("You bought a Dog!" + "\n" + "Thank you for your order.");
    }

    public static void buyHamsters(int howManyHamsters){
        if(howManyHamsters <= 0){
            System.out.println("So you don't want any hamsters today?");
        }
        else if(howManyHamsters == 1){
            numHamsters--;
            System.out.println("Thank you for purchasing a hamster from us today!");
        }
        else{
            numHamsters = numHamsters - howManyHamsters;
            System.out.println("Thank you for purchasing your hamsters from us today!");
        }

    }

    public static void main(String[] args) {

       PetStore wraysPets = new PetStore("Wrays Pets", 3, 5, 13);
       inventory();
       buyCat();
       buyDog();
       buyHamsters(3);
       inventory();
       Dog beagle = new Dog("Brown", "Large", "Beagle");
       beagle.dogTraits();
    }

}
