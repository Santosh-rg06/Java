class Poster {

    int width;
    int height;
    String content;
    String material;
 String brand;

    public Poster() {
        System.out.println("Running the poster program");
    }

 
    public Poster(int height,int width,String brand) {
        this.height = height;
		this.width=width;
		this.brand=brand;
    }

    
    public void info() {
        System.out.println("Running info in poster");
        System.out.println("Poster brand: " + brand);
        System.out.println("Poster material: " + material);
        System.out.println("Poster width: " + width);
        System.out.println("Poster height: " + height);
    }
}