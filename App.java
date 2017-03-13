import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args){
    Console console = System.console();

    Animal spot = new Animal("Spot", "dog", 1, "black and white", "friendly");
    Animal boots = new Animal("Boots", "cat", 6, "grey", "friendly");
    Animal snappy = new Animal("Snappy", "alligator", 20, "green", "bitey");

    List<Animal> allAnimals = new ArrayList<Animal>();
    allAnimals.add(spot);
    allAnimals.add(boots);
    allAnimals.add(snappy);

    System.out.println("Please select from the following options: see all animals, add new animal, or search indoor pets.");
    String optionInput = console.readLine();

    if (optionInput.equals("see all animals")) {
      for(Animal indAnimal : allAnimals ){
          System.out.println("------------------");
          System.out.println("Name: " + indAnimal.name);
          System.out.println("Species: " + indAnimal.species);
          System.out.println("Age: " + indAnimal.age);
          System.out.println("Color: " + indAnimal.color);
          System.out.println("Temperament: " + indAnimal.temperament);
      }
    } else if (optionInput.equals("add new animal")){
      System.out.println("Looking to put an animal up for adoption? We will need a little information from you first. What is the animals name?");
      String userAnimalName = console.readLine();
      System.out.println("What is the animals species?");
      String userAnimalSpecies = console.readLine();
      System.out.println("What is the animals age?");
      int userAnimalAge = Integer.parseInt(console.readLine());
      System.out.println("What color is the animal?");
      String userAnimalColor = console.readLine();
      System.out.println("What color the temperament of the animal?");
      String userAnimalTemerament = console.readLine();
      Animal userAnimal = new Animal (userAnimalName, userAnimalSpecies, userAnimalAge, userAnimalColor, userAnimalTemerament);
      System.out.println("Here is the new animal for adoption!");
      System.out.println("------------------");
      System.out.println("Name: " + userAnimal.name);
      System.out.println("Species: " + userAnimal.species);
      System.out.println("Age: " + userAnimal.age);
      System.out.println("Color: " + userAnimal.color);
      System.out.println("Temperament: " + userAnimal.temperament);
    } else {
      System.out.println("not an option yet!");
    }
  }
}
