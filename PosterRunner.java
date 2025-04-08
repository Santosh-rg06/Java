class PosterRunner {
    public static void main(String... values) {
		
		Poster poster=new Poster();
		poster.info();
        String brand = "Classmate";
        Poster poster1 = new Poster(brand);
       poster1.info();
	   String matirial = "Paper";
        int width = 25;
        int height = 36; 
        
		Poster poster2=new  Poster(width,height,brand);
         poster2.info();
        
    }
}