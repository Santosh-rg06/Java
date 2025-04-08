class Engine {
    void displayInfo(String type, int horsepower, int torque, int cylinders, String fuelType, int weight, int rpm, int fuelCapacity, int displacement, int emissions, String manufacturer, String model, String serialNumber, int warrantyYears, String turbocharged, String coolingSystem, int efficiency, String hybrid, int voltage, String ignitionType, int fuelConsumption, String electronicControl, String transmissionType, String country) {
        System.out.println("Engine Info - Type: " + type + ", Horsepower: " + horsepower + " HP, Torque: " + torque + " Nm");
        System.out.println("Fuel Type: " + fuelType + ", Cylinders: " + cylinders + ", Displacement: " + displacement + "cc");
        System.out.println("Manufacturer: " + manufacturer + ", Model: " + model + ", Serial: " + serialNumber);
    }

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.displayInfo("V8", 450, 500, 8, "Petrol", 300, 6000, 60, 5000, 200, "Ford", "Mustang V8", "12345678", 5, "Yes", "Liquid", 90, "No", 12, "Spark", 15, "Yes", "Automatic", "USA");
    }
}
