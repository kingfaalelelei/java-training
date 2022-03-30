package javabaeldung.interfaces.abstractclassimplementinginterface;

public interface Transform {
  void transform();

  default void printSpecs(){
    System.out.println("Transform Specification");
  }
}

