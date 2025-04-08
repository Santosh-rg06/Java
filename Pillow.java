class Pillow {
    public static void main(String[] args) {
       
        String brand = "SleepWell";
        int length = 24;
        int width = 16; 
        double price = 799.99;
        boolean isMemoryFoam = true;
        float weight = 1.2f; 
        char comfortLevel = 'A'; 
        long batchNumber = 9876543210L;
        short warrantyYears = 2;
        byte discount = 15; 

        System.out.println("Initial Pillow Details");
        System.out.println("Brand: " + brand);
        System.out.println("Length: " + length + " inches");
        System.out.println("Width: " + width + " inches");
        System.out.println("Price: ₹" + price);
        System.out.println("Memory Foam: " + isMemoryFoam);
        System.out.println("Weight: " + weight);
        System.out.println("Comfort Level: " + comfortLevel);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Discount: " + discount);

       
        brand = "CozyCloud";
        length = 26;
        width = 18;
        price = 999.50;
        isMemoryFoam = false;
        weight = 1.5f;
        comfortLevel = 'B';
        batchNumber = 1122334455L;
        warrantyYears = 3;
        discount = 20;

        System.out.println("Updated Pillow Details");
        System.out.println("Brand: " + brand);
        System.out.println("Length: " + length + " inches");
        System.out.println("Width: " + width + " inches");
        System.out.println("Price: ₹" + price);
        System.out.println("Memory Foam: " + isMemoryFoam);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Comfort Level: " + comfortLevel);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Discount: " + discount + "%");
    }
}
