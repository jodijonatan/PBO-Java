package intrface;

interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
  public void myMethod() {
    System.out.println("Some text.. I'm Jodi Jonatan");
  }
  public void myOtherMethod() {
    System.out.println("Some other text... Junior Fullstack developer");
  }
}

class SomeInterface {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}