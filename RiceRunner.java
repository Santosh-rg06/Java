class RiceRunner {
    public static void main(String[] values) {
        String[] riceTypes = Rice.types();
        for (String type : riceTypes) {
            System.out.println(type);
        }

        String quantity = Rice.quantity();
        System.out.println(quantity);

        boolean isCooked = Rice.isCooked();
        System.out.println(isCooked);

        boolean isOrganic = Rice.isOrganic();
        System.out.println(isOrganic);
    }
}
