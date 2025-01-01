package OOPs;

public class constructor3 {
    // Base class
    public static class Vehicle {
        private String make;
        private String model;
        private int year;

        // Constructor with all parameters
        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public Vehicle(String make, String model) {
            this(make, model, 2020);// Chaining to the main constructor
        }

        public Vehicle() {
            this("Unknown", "Unknown", 2020);
        }
        // Method to display vehicle details

        public void displayInfo() {
            System.out.println("Vehicle: " + make + " " + model + "(" + year + ")");
        }

    }

    static class Car extends Vehicle {
        private boolean isConvertible;

        public Car(String make, String model, int year, boolean isConvertible) {
            super(make, model, year);
            this.isConvertible = isConvertible;
        }

        public Car() {
            super();
            this.isConvertible = false;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Convertible: " + (isConvertible ? "Yes" : "No"));

        }
    }

    public class ChangingConstructor {
        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022);
            Car car = new Car("Ford", "Mustang", 2021, true);
            Vehicle defaultVehicle = new Vehicle();
            Car defaultCar = new Car();
            vehicle.displayInfo();
            car.displayInfo();
            defaultVehicle.displayInfo();
            defaultCar.displayInfo();

        }
    }
}
