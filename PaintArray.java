public class PaintArray{
    public static void main(String[] args) {
       
        String[] paints = {"Oil", "Watercolor", "Acrylic", "Spray", "Latex"};

        // Us
        System.out.println("Using for loop:");
        for (int i = 0; i < 2; i++) { 
            System.out.println(paints[i]);
        }

      
        System.out.println("Using for-each loop:");
        int count = 0;
        for (String paint : paints) {
            if (count >= 2) { 
                System.out.println(paint);
            }
            count++;
        }
    }
}
