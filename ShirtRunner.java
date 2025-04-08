class ShirtRunner {
    public static void main(String[] args) {
      
        Shirt shirt1 = new Shirt();
        
      
        System.out.println("The default value for color is: " + shirt1.color);
        System.out.println("The default value for size is: " + shirt1.size);
        System.out.println("The default value for material is: " + shirt1.material);
        System.out.println("Is it full sleeve? " + shirt1.isFullSleeve);

    
        shirt1.color = "Blue";
        shirt1.size = "Medium";
        shirt1.material = "Cotton";
        shirt1.isFullSleeve = true;

     
        System.out.println("The values after initialization:");
        System.out.println("Shirt color: " + shirt1.color);
        System.out.println("Shirt size: " + shirt1.size);
        System.out.println("Shirt material: " + shirt1.material);
        System.out.println("Is it full sleeve? " + shirt1.isFullSleeve);

        
        Shirt shirt2 = new Shirt();
        shirt2.color = shirt1.color;
        shirt2.size = shirt1.size;
        shirt2.material = shirt1.material;
        shirt2.isFullSleeve = shirt1.isFullSleeve;

    
        System.out.println("The values of the copied object:");
        System.out.println("Shirt color: " + shirt2.color);
        System.out.println("Shirt size: " + shirt2.size);
        System.out.println("Shirt material: " + shirt2.material);
        System.out.println("Is it full sleeve? " + shirt2.isFullSleeve);
    }
}
