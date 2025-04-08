public class PaperArray{
    public static void main(String[] args) {

        String[] papers = {"A4", "Notebook", "Tissue", "Cardboard", "Newspaper"};


        System.out.println("Using for loop:");
        for (int i = 0; i < 2; i++) { 
            System.out.println(papers[i]);
        }

     
        System.out.println("Using for-each loop:");
        int count = 0;
        for (String paper : papers) {
            if (count >= 2) { 
                System.out.println(paper);
            }
            count++;
        }
    }
}
