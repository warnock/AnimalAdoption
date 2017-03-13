class Animal{
  public String name;
  public String species;
  public int age;
  public String color;
  public String temperament;

  public boolean petMatch(String match){
    if(this.temperament.equals(match)){
      return true;
    } else{
      return false;
    }
  }
}
