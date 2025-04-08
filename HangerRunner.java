class HangerRunner {
    public static void main(String[] args) {
     
        Hanger hanger1 = new Hanger();
        
        
        System.out.println("The default value for material is: " + hanger1.material);
        System.out.println("The default value for color is: " + hanger1.color);
        System.out.println("The default value for capacity is: " + hanger1.capacity);
        System.out.println("Does it have hooks? " + hanger1.hasHooks);

        
        hanger1.material = "Plastic";
        hanger1.color = "Black";
        hanger1.capacity = 5;
        hanger1.hasHooks = true;

        
        System.out.println("The values after initialization:");
        System.out.println("Hanger material: " + hanger1.material);
        System.out.println("Hanger color: " + hanger1.color);
        System.out.println("Hanger capacity: " + hanger1.capacity);
        System.out.println("Does it have hooks? " + hanger1.hasHooks);

      
        Hanger hanger2 = new Hanger();
        hanger2.material = hanger1.material;
        hanger2.color = hanger1.color;
        hanger2.capacity = hanger1.capacity;
        hanger2.hasHooks = hanger1.hasHooks;

     
        System.out.println("The values of the copied object:");
        System.out.println("Hanger material: " + hanger2.material);
        System.out.println("Hanger color: " + hanger2.color);
        System.out.println("Hanger capacity: " + hanger2.capacity);
        System.out.println("Does it have hooks? " + hanger2.hasHooks);
    }
}
