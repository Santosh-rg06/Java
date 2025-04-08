public class Wall{
    public static void main(String[] args) {
       
        String[] walls = {"Brick", "Concrete", "Wood", "Glass", "Metal"};

     
        System.out.println("Using for loop:");
        for (int i = 0; i < 2; i++) { 
            System.out.println(walls[i]);
        }

     
        System.out.println("Using for-each loop:");
        int count = 0;
        for (String wall : walls) {
            if (count >= 2) { 
                System.out.println(wall);
            }
            count++;
        }
    }
}
