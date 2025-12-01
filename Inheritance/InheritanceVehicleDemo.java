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

class Carr extends Vehicle {
 protected String model;

 public Carr(String brand, int year, String model) {
     super(brand, year); // Call parent constructor
     this.model = model;
 }

 public void displayCarInfo() {
     displayVehicleInfo(); // Call parent method
     System.out.println("Model: " + model);
 }
}

class ElectricCar extends Carr {
 private int batteryCapacity; // in kWh

 public ElectricCar(String brand, int year, String model, int batteryCapacity) {
     super(brand, year, model);
     this.batteryCapacity = batteryCapacity;
 }

 public void displayElectricCarInfo() {
     displayCarrInfo(); 
     System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 }

private void displayCarrInfo() {
	// TODO Auto-generated method stub
	
}
}

public class InheritanceVehicleDemo {
 public static void main(String[] args) {

     ElectricCar tesla = new ElectricCar("Tesla", 2023, "Model S", 100);

     tesla.displayElectricCarInfo();
 }
}
