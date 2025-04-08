public class CoinArray {
    public static void main(String[] args) {

        String[] coins = {"Penny", "Nickel", "Dime", "Quarter", "Half Dollar"};

      
        System.out.println("Using for loop:");
        for (int i = 0; i < 2; i++) { 
            System.out.println(coins[i]);
        }

    
        System.out.println("Using for-each loop:");
        int count = 0;
        for (String coin : coins) {
            if (count >= 2) { 
                System.out.println(coin);
            }
            count++;
        }
    }
}
