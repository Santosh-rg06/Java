class Latch {
    void typesWithPrice(String type, int price) {
        System.out.println("Latch Type: " + type + ", Price: " + price);
    }

    public static void main(String[] args) {
        Latch latch = new Latch();
        latch.typesWithPrice("Sliding", 200);
    }
}
