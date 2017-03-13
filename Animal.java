class Animal{
  public String name;
  public String species;
  public int age;
  public String color;
  public String temperament;


  public Animal(String name, String species, int age, String color, String temperament) {
    this.name = name;
    this.species = species;
    this.age = age;
    this.color = color;
    this.temperament = temperament;
  }

  public boolean insidePet(){
    if(this.species.equals("dog")) {
      return true;
    } else {
      return false;
    }
  }

}
