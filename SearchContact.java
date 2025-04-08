class ContactSearch {
	
    static long getMobileByEmail(String email) { 
        System.out.println("Running getMobileByEmail: " + email);

        if (email == "ravi.kapoor@example.com") 
		{
            return 9876543210L;
        } 
		
		else if (email == "rohit.sharma@example.com") 
		{
            return 8765432109L;
        } 
		
		else if (email == "anil.shetty@example.com") 
		{
            return 7654321098L;
        } 
		
		else if (email == "priya.kapoor@example.com")
			{
            return 6543210987L;
        } 
		
		else if (email == "sneha.sharma@example.com")
			{
            return 5432109876L;
        } 
		
		else if (email == "kiran.shetty@example.com")
			{
            return 4321098765L;
        } 
		
		else if (email == "amit.kapoor@example.com") 
		{
            return 3210987654L;
        } 
		
		else if (email == "deepak.sharma@example.com")
			{
            return 2109876543L;
        } 
		
		else if (email == "megha.shetty@example.com") 
		{
            return 1098765432L;
        } 
		
		else if (email == "varun.kapoor@example.com")
			{
            return 9988776655L;
        } 
		
		else if (email == "nisha.sharma@example.com") 
		{
            return 8877665544L;
        }

		else if (email == "manoj.shetty@example.com") 
		{
            return 7766554433L;
        } 
		
		else if (email == "rahul.kapoor@example.com") 
		{
            return 6655443322L;
        } 
		
		else if (email == "pooja.sharma@example.com")
			{
            return 5544332211L;
        } 
		
		else if (email == "arjun.shetty@example.com") 
		{
            return 4433221100L;
        } 
		
		else
			{
            System.out.println("No mobile number found");
            return 0;
        }
    }

    static String getEmailByName(String name) { 
        System.out.println("Running getEmailByName: " + name);

        if (name == "Ravi Kapoor") 
		{
            return "ravi.kapoor@example.com";
        }

		else if (name == "Rohit Sharma")
			{
            return "rohit.sharma@example.com";
        }

		else if (name == "Anil Shetty")
			{
            return "anil.shetty@example.com";
        }

		else if (name == "Priya Kapoor") 
		{
            return "priya.kapoor@example.com";
        } 
		
		else if (name == "Sneha Sharma") 
		{
            return "sneha.sharma@example.com";
        } 
		
		else if (name == "Kiran Shetty")
			{
            return "kiran.shetty@example.com";
        } 
		
		else if (name == "Amit Kapoor") 
		{
            return "amit.kapoor@example.com";
        }

		else if (name == "Deepak Sharma")
			{
            return "deepak.sharma@example.com";
        } 
		
		else if (name == "Megha Shetty") 
		{
            return "megha.shetty@example.com";
        }

		else if (name == "Varun Kapoor") 
		{
            return "varun.kapoor@example.com";
        }

		else if (name == "Nisha Sharma") 
		{
            return "nisha.sharma@example.com";
        } 
		
		else if (name == "Manoj Shetty") 
		{
            return "manoj.shetty@example.com";
        }

		else if (name == "Rahul Kapoor")
			{
            return "rahul.kapoor@example.com";
        } 
		
		else if (name == "Pooja Sharma") 
		{
            return "pooja.sharma@example.com";
        }

		else if (name == "Arjun Shetty") 
		{
            return "arjun.shetty@example.com";
        } 
		
		else 
		{
            System.out.println("No email found");
            return null;
        }
    }

    static String[] searchByLastName(String name) { 
        System.out.println("Running searchByLastName: " + name);

        if (name == "Kapoor") 
		{
            return new String[]{"Ravi Kapoor", "Priya Kapoor", "Amit Kapoor", "Varun Kapoor", "Rahul Kapoor"};
        } 
		
		else if (name == "Sharma")
			{
            return new String[]{"Rohit Sharma", "Sneha Sharma", "Deepak Sharma", "Nisha Sharma", "Pooja Sharma"};
        } 
		
		else if (name == "Shetty") 
		{
            return new String[]{"Anil Shetty", "Kiran Shetty", "Megha Shetty", "Manoj Shetty", "Arjun Shetty"};
        } 
		
		else 
		{
            System.out.println("No records found");
            return new String[0];
        }
    }
}