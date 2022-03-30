package javabaeldung.interfaces;

public class Computer implements Electronic {

  @Override
  public int getElectricityUse() {
    return 1000;
  }
}

//In an interface, we're allowed to use:
//constants variables
//abstract methods
//static methods
//default methods

//We also should remember that:
//we can't instantiate interfaces directly
//an interface can be empty, with no methods or variables in it
//we can't use the final word in the interface definition, as it will result in a compiler error
//all interface declarations should have the public or default access modifier; the abstract
//modifier will be added automatically by the compiler
//an interface method can't be protected or final
//up until Java 9, interface methods could not be private; however, Java 9 introduced
//the possibility to define private methods in interfaces
//interface variables are public, static, and final by definition; we're not allowed
//to change their visibility
