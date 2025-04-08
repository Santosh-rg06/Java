class Product {
    static int[] productIds = new int[3];
    static double[] productPrices = new double[3]; 
    static int index = 0; 

    public static void addProduct(int productId, double productPrice) {
        if (index < productIds.length) {
            productIds[index] = productId;
            productPrices[index] = productPrice;
            System.out.println("Product ID " + productId + " with price " + productPrice + " is saved.");
            index++;
        } else {
            System.out.println("Array is full, we can't add more products.");
        }
    }

    public static void displayProducts() {
        System.out.println("\nStored Products:");
        for (int i = 0; i < index; i++) {
            System.out.println("Product ID: " + productIds[i] + ", Price: " + productPrices[i]);
        }
    }

    public static void main(String[] args) {
        addProduct(101, 499.99);
        addProduct(102, 999.50);
        addProduct(103, 1500.75);
        addProduct(104, 2000.00);

        displayProducts();
    }
}