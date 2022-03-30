package javabaeldung.classes;

public class Main {
  public static void main(String[] args) {
    Car focus = new Car("Ford", "Focus", "red");
    System.out.println(focus.toString());

    System.out.println(focus.getModel());
  }
}
