package javabaeldung.abstractclasses;

public class Checkers extends BoardGame {
  public void play() {
    //... implementation
  }
}

// When to Use Abstract Classes
// We want to encapsulate some common functionality in one place (code reuse) that multiple,
// related subclasses will share
// We need to partially define an API that our subclasses can easily extend and refine
// The subclasses need to inherit one or more common methods or fields with protected access
// modifiers
