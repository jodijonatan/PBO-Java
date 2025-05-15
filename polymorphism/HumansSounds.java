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

class Jojo extends Human {
    public void humanSound() {
        System.out.println("Jojo says: I'm Programmer");
    }
}

class HumansSounds {
    public static void main(String[] args) {
        Human theHuman = new Human();
        Human theJeje = new Jeje();
        Human theJojo = new Jojo();
        theHuman.humanSound();
        theJeje.humanSound();
        theJojo.humanSound();
    }
}