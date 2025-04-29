package polymorphism;
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
  
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wek wek");
  }
}
  
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: guk guk");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meong meong");
  }
}

class Goat extends Animal {
  public void animalSound() {
    System.out.println("The goat says: bek bek");
  }
}

class AnimalsSounds {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    Animal myCat = new Cat();
    Animal myGoat = new Goat();
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
    myCat.animalSound();
    myGoat.animalSound();
  }
}