
class SambarRunner {
    public static void main(String[] values) {
        String[] vegetables = Sambar.vegie();
        for (String veg : vegetables) {
            System.out.println(veg);
        }

        String quantity = Sambar.quantity();
        System.out.println( quantity);

        boolean condition = Sambar.condition();
        System.out.println(condition);

        boolean about = Sambar.about();
        System.out.println( about);
    }
}
