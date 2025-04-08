public class WireArray {
    public static void main(String[] args) {
        
        String[] wires = {"Copper", "Aluminum", "Fiber Optic", "Coaxial", "Steel"};

      
        System.out.println("Using for loop:");
        for (int i = 0; i < 2; i++) { 
            System.out.println(wires[i]);
        }

       
        System.out.println("Using for-each loop:");
        int count = 0;
        for (String wire : wires) {
            if (count >= 2) { 
                System.out.println(wire);
            }
            count++;
        }
    }
}
