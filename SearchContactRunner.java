class ContactSearchRunner {
    public static void main(String[] values) {
        String email = "ravi.kapoor@example.com";
        long mobile = ContactSearch.getMobileByEmail(email);
        System.out.println("Mobile Number: " + mobile);

        email = "pooja.sharma@example.com";
        mobile = ContactSearch.getMobileByEmail(email);
        System.out.println("Mobile Number: " + mobile);

        email = "unknown@example.com";
        mobile = ContactSearch.getMobileByEmail(email);
        System.out.println("Mobile Number: " + mobile);

        String name = "Ravi Kapoor";
        String emailByName = ContactSearch.getEmailByName(name);
        System.out.println("Email: " + emailByName);

        name = "Unknown Name";
        emailByName = ContactSearch.getEmailByName(name);
        System.out.println("Email: " + emailByName);

        String[] kapoors = ContactSearch.searchByLastName("Kapoor");
        System.out.println("Kapoor Family:");
        for (String person : kapoors) 
		{
            System.out.println(person);
        }

        String[] sharmas = ContactSearch.searchByLastName("Sharma");
        System.out.println("Sharma Family:");
        for (String person : sharmas) 
		{
            System.out.println(person);
        }

        String[] shettys = ContactSearch.searchByLastName("Shetty");
        System.out.println("Shetty Family:");
        for (String person : shettys) 
		{
            System.out.println(person);
        }
    }
}