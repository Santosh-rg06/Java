class Bullet {
    void displayInfo(String caliber, String type, int weight, String material, int speed) {
        System.out.println("Bullet Info - Caliber: " + caliber + ", Type: " + type + ", Weight: " + weight + "g, Material: " + material + ", Speed: " + speed + "m/s");
    }

    public static void main(String[] args) {
        Bullet bullet = new Bullet();
        bullet.displayInfo("9mm", "Hollow Point", 15, "Lead", 400);
    }
}
