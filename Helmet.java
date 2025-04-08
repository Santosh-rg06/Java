class Helmet {
    Helmet(String brand, String color, String size, int price, String material) {
        System.out.println("Helmet: " + brand + " " + color + " " + size + " " + price + " " + material);
    }

    public static void main(String[] args) {
        new Helmet("Steelbird", "Black", "M", 1500, "ABS Plastic");
    }
}
