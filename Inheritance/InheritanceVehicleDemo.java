package Inheritance;

class Vehicle {
 protected String brand;
 protected int year;

 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 public void displayVehicleInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Year: " + year);
 }
}

class Car extends Vehicle {
 protected String model;

 public Car(String brand, int year, String model) {
     super(brand, year); // Call parent constructor
     this.model = model;
 }

 public void displayCarInfo() {
     displayVehicleInfo(); // Call parent method
     System.out.println("Model: " + model);
 }
}

//Grandchild class
class ElectricCar extends Car {
 private int batteryCapacity; // in kWh

 public ElectricCar(String brand, int year, String model, int batteryCapacity) {
     super(brand, year, model);
     this.batteryCapacity = batteryCapacity;
 }

 public void displayElectricCarInfo() {
     displayCarInfo(); 
     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 }
}

public class InheritanceVehicleDemo {
 public static void main(String[] args) {

     ElectricCar tesla = new ElectricCar("Tesla", 2023, "Model S", 100);

     tesla.displayElectricCarInfo();
 }
}
