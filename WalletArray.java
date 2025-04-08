public class WalletArray{
    public static void main(String[] args) {
        
        String[] wallets = {"Leather", "Fabric", "Metal", "Plastic", "RFID"};

      
        System.out.println("Using for loop:");
        for (int i = 0; i < 2; i++) { 
            System.out.println(wallets[i]);
        }

       
        System.out.println("Using for-each loop:");
        int count = 0;
        for (String wallet : wallets) {
            if (count >= 2) { 
                System.out.println(wallet);
            }
            count++;
        }
    }
}

