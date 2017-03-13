import java.io.Console;

public class App{
  public static void main(String[] args){
    Console console = System.console();
    Animal spot = new Animal();
    spot.name = "Spot";
    spot.species = "dog";
    spot.age = 1;
    spot.color = "black and white";
    spot.temperament = "friendly";

    Animal boots = new Animal();
    boots.name = "Boots";
    boots.species = "cat";
    boots.age = 6;
    boots.color = "grey";
    boots.temperament = "friendly";

    Animal snappy = new Animal();
    snappy.name = "Snappy";
    snappy.species = "alligator";
    snappy.age = 20;
    snappy.color = "green";
    snappy.temperament = "bitey";

    System.out.println("What temperament are you looking for?");
    String matchInput = console.readLine();

    Animal[] allAnimals = {spot, boots, snappy};
    System.out.println("Welcome to Animal Adoptions!");
    System.out.println("Here are our friendly animals:");
    for(Animal indAnimal : allAnimals){
      if(indAnimal.petMatch(matchInput)){
        System.out.println("------------------");
        System.out.println("Name: " + indAnimal.name);
        System.out.println("Species: " + indAnimal.species);
        System.out.println("Age: " + indAnimal.age);
        System.out.println("Color: " + indAnimal.color);
        System.out.println("Temperament: " + indAnimal.temperament);
      } else {
        System.out.println("There are no animals in this temperament.");
      }
    }
  }
}
