class Soap {
    public static void main(String[] args) {
        String brand = "Dove";
        int weight = 100; 
        double price = 45.50;
        boolean isFragrant = true;
        float phLevel = 5.5f;
        char grade = 'A';
        long batchNumber = 123456789L;
        short expiryYear = 2026;
        byte discount = 10; 

        System.out.println("Initial Soap Details");
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
        System.out.println("Price: ₹" + price);
        System.out.println("Fragrant: " + isFragrant);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Grade: " + grade);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Expiry Year: " + expiryYear);
        System.out.println("Discount: " + discount);
        
       
        brand = "Lux";
        weight = 125;
        price = 55.75;
        isFragrant = false;
        phLevel = 6.0f;
        grade = 'B';
        batchNumber = 987654321L;
        expiryYear = 2027;
        discount = 15;
        
        System.out.println("ReInitialize Soap Details");
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
        System.out.println("Price: ₹" + price);
        System.out.println("Fragrant: " + isFragrant);
        System.out.println("pH Level: " + phLevel);
        System.out.println("Grade: " + grade);
        System.out.println("Batch Number: " + batchNumber);
        System.out.println("Expiry Year: " + expiryYear);
        System.out.println("Discount: " + discount );
    }
}
