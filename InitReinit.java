public class InitReinit {
    public static void main(String[] args) {
      
        byte smallNumber = 10;  
        System.out.println("Initial byte: " + smallNumber);
        smallNumber = 20;       
        System.out.println("Reinitialized byte: " + smallNumber);

   
        short shortNum = 1000;
        System.out.println("Initial short: " + shortNum);
        shortNum = 2000;
        System.out.println("Reinitialized short: " + shortNum);

   
        int cost = 100;
        System.out.println("Initial int: " + cost);
        cost = 200;
        System.out.println("Reinitialized int: " + cost);

       
        long bigNumber = 100000L;
        System.out.println("Initial long: " + bigNumber);
        bigNumber = 200000L;
        System.out.println("Reinitialized long: " + bigNumber);

   
        float weight = 55.5f;
        System.out.println("Initial float: " + weight);
        weight = 65.8f;
        System.out.println("Reinitialized float: " + weight);

     
        double height = 5.9;
        System.out.println("Initial double: " + height);
        height = 6.2;
        System.out.println("Reinitialized double: " + height);

      
        char grade = 'A';
        System.out.println("Initial char: " + grade);
        grade = 'B';
        System.out.println("Reinitialized char: " + grade);

     
        boolean isPassed = true;
        System.out.println("Initial boolean: " + isPassed);
        isPassed = false;
        System.out.println("Reinitialized boolean: " + isPassed);

     
        String name = "Alice";
        System.out.println("Initial String: " + name);
        name = "Bob";
        System.out.println("Reinitialized String: " + name);
    }
}
