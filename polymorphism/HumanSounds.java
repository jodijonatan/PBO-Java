package polymorphism;

class Human {
    public void humanSound() {
      System.out.println("The human makes a sound");
    }
}

class Jeje extends Human {
    public void humanSound() {
        System.out.println("Jeje says: jancuk");
    }
}

class HumanSounds {
    public static void main(String[] args) {
        Human theHuman = new Human();
        Human theJeje = new Jeje();
        theHuman.humanSound();
        theJeje.humanSound();
    }
}