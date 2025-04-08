class Ring {
    public static void main(String[] args) {
     
        String material = "Gold";
        int size = 7; 
        double price = 25000.75;
        boolean isEngraved = false;
        float weight = 5.2f; 
        char purity = 'A'; 
        long serialNumber = 987654321012L;
        short warrantyYears = 10;
        byte discount = 5; 

        System.out.println("Initial Ring Details ");
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Price: ₹" + price);
        System.out.println("Engraved: " + isEngraved);
        System.out.println("Weight: " + weight);
        System.out.println("Purity: " + purity);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Warranty: " + warrantyYears);
        System.out.println("Discount: " + discount);

        
        material = "Platinum";
        size = 9;
        price = 45000.50;
        isEngraved = true;
        weight = 6.8f;
        purity = 'B';
        serialNumber = 112233445566L;
        warrantyYears = 15;
        discount = 10;

        
        System.out.println("ReInitial  Updated Ring Details");
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Price: ₹" + price);
        System.out.println("Engraved: " + isEngraved);
        System.out.println("Weight: " + weight);
        System.out.println("Purity: " + purity);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Warranty: " + warrantyYears);
        System.out.println("Discount: " + discount);
    }
}
