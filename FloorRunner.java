class FloorRunner{
    public static void main(String[] args) 
	{
        Floor floor = new Floor();

        System.out.println("The default value for length is \t" + floor.length);
        System.out.println("The default value for breadth is \t" + floor.breadth);
        System.out.println("The default value for material is \t" + floor.material);
        System.out.println("Is it tiled? \t" + floor.isTiled);

        floor.length = 10;
        floor.breadth = 12;
        floor.material = "Marble";
        floor.isTiled = true;

        System.out.println("The values after initialization:");
        System.out.println("Floor length: " + floor.length);
        System.out.println("Floor breadth: " + floor.breadth);
        System.out.println("Floor material: " + floor.material);
        System.out.println("Is it tiled? " + floor.isTiled);
    }
}