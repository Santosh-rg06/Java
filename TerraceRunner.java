class TerraceRunner {
    public static void main(String[] args) {
     
        Terrace terrace1 = new Terrace();
        
    
        System.out.println("The default value for area is: " + terrace1.area);
        System.out.println("The default value for height is: " + terrace1.height);
        System.out.println("The default value for flooring is: " + terrace1.flooring);
        System.out.println("Does it have shade? " + terrace1.hasShade);

        
        terrace1.area = 200;
        terrace1.height = 15;
        terrace1.flooring = "Wooden";
        terrace1.hasShade = true;

    
        System.out.println("The values after initialization:");
        System.out.println("Terrace area: " + terrace1.area);
        System.out.println("Terrace height: " + terrace1.height);
        System.out.println("Terrace flooring: " + terrace1.flooring);
        System.out.println("Does it have shade? " + terrace1.hasShade);

       
        Terrace terrace2 = new Terrace();
        terrace2.area = terrace1.area;
        terrace2.height = terrace1.height;
        terrace2.flooring = terrace1.flooring;
        terrace2.hasShade = terrace1.hasShade;

      
        System.out.println("The values of the copied object:");
        System.out.println("Terrace area: " + terrace2.area);
        System.out.println("Terrace height: " + terrace2.height);
        System.out.println("Terrace flooring: " + terrace2.flooring);
        System.out.println("Does it have shade? " + terrace2.hasShade);
    }
}
