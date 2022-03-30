package javabaeldung.classes;

public class Car {

  // fields
  String type;
  String model;
  String color;
  int speed;

  // constructor
  Car(String type, String model, String color) {
    this.type = type;
    this.model = model;
    this.color = color;
  }

  // methods
  int increaseSpeed(int increment) {
    this.speed = this.speed + increment;
    return this.speed;
  }

  public String toString() {
    return "Type: " + this.type + ", Model: " + this.model +
        ", Colour: " + this.color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
