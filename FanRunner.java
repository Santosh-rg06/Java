class FanRunner {
    public static void main(String[] args) {
        // Creating an object of Fan class (Fixed error)
        Fan fan = new Fan();

        // Default values (primitive types get default values, objects get null)
        System.out.println("The default value for length is \t" + fan.length);
        System.out.println("The default value for breadth is \t" + fan.breadth);
        System.out.println("The default value for material is \t" + fan.material);
        System.out.println("Is it tiled? \t" + fan.isTiled);

        // Assigning new values
        fan.length = 10;
        fan.breadth = 12;
        fan.material = "Marble";
        fan.isTiled = true;

        // Printing updated values
        System.out.println("The values after initialization:");
        System.out.println("Fan length: " + fan.length);
        System.out.println("Fan breadth: " + fan.breadth);
        System.out.println("Fan material: " + fan.material);
        System.out.println("Is it tiled? " + fan.isTiled);
    }
}
