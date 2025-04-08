class Bed {
    public static void main(String[] args) {
        
        String brand = "SleepWell";
        int length = 78;
        int width = 60; 
        double price = 25000.99;
        boolean isKingSize = true;
        float weight = 50.5f; 
        char comfortLevel = 'A';
        long batchNumber = 9876543210L;
        short warrantyYears = 5;
        byte discount = 10; 

        
        System.out.println("Initial Bed Details);
        System.out.println("Brand: " + brand);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Price: ₹" + price);
        System.out.println("King Size: " + isKingSize);
        System.out.println("Weight: " + weight);
        System.out.println("Comfort Level: " + comfortLevel);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Warranty: " + warrantyYears);
        System.out.println("Discount: " + discount);

       
        brand = "RoyalRest";
        length = 84;
        width = 72;
        price = 35000.50;
        isKingSize = false;
        weight = 65.0f;
        comfortLevel = 'B';
        batchNumber = 1122334455L;
        warrantyYears = 7;
        discount = 15;

      
        System.out.println("Updated Bed Details ");
        System.out.println("Brand: " + brand);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Price: ₹" + price);
        System.out.println("King Size: " + isKingSize);
        System.out.println("Weight: " + weight);
        System.out.println("Comfort Level: " + comfortLevel);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Warranty: " + warrantyYears);
        System.out.println("Discount: " + discount);
    }
}
