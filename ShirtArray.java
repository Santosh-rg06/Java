public class ShirtArray {
    public static void main(String[] args) {
        
        String[] shirts = {"Nike", "Adidas", "Puma", "Reebok", "Levi's"};

       
        System.out.println("Using for loop:");
        for (int i = 0; i < 2; i++) { 
            System.out.println(shirts[i]);
        }

  
        System.out.println("Using for-each loop:");
        int count = 0;
        for (String shirt : shirts) {
            if (count >= 2) { 
                System.out.println(shirt);
				

            }
            count++;
        }
    }
}
