class Gun {
    void displayInfo(String model, String type, int range, int capacity, int weight, String manufacturer, int price, String country) {
        System.out.println("Gun Info - Model: " + model + ", Type: " + type + ", Range: " + range + "m, Capacity: " + capacity);
        System.out.println("Weight: " + weight + "kg, Manufacturer: " + manufacturer + ", Price: $" + price + ", Country: " + country);
    }

    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.displayInfo("AK-47", "Rifle", 500, 30, 4, "Kalashnikov", 1500, "India");
    }
}
