public class App{
  public static void main(String[] args){
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
    boots.temperament = "pretty chill";

    Animal[] allAnimals = {spot, boots};
    System.out.println("Welcome to Animal Adoptions!");
    System.out.println("Here are our animals:");
    for(Animal indAnimal : allAnimals){
      System.out.println("------------------");
      System.out.println("Name: " + indAnimal.name);
      System.out.println("Species: " + indAnimal.species);
      System.out.println("Age: " + indAnimal.age);
      System.out.println("Color: " + indAnimal.color);
      System.out.println("Temperament: " + indAnimal.temperament);
    }
  }
}
