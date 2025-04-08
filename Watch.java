class Watch {
    public static void main(String[] args) {
        String brand = "Rolex";
        int modelNumber = 12345;
        double price = 150000.75;
        boolean isSmartWatch = false;
        float screenSize = 1.5f;
        char waterResistance = 'A'; 
        long serialNumber = 9876543210123L;
        short warrantyYears = 5;
        byte discount = 10;


        System.out.println("Initial Watch Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: ₹" + price);
        System.out.println("Smart Watch: " + isSmartWatch);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Discount: " + discount );


        brand = "Apple";
        modelNumber = 67890;
        price = 45000.99;
        isSmartWatch = true;
        screenSize = 1.9f;
        waterResistance = 'B';
        serialNumber = 1122334455667L;
        warrantyYears = 3;
        discount = 15;


        System.out.println("ReInitial Watch Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: ₹" + price);
        System.out.println("Smart Watch: " + isSmartWatch);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Water Resistance: " + waterResistance);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Discount: " + discount);
    }
}
