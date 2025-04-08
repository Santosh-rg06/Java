class ArrayAssignment {
    public static void main(String[] values) {
      
        String[] shirts = {"Red", "Blue", "Green", "White", "Black"};
        String[] clips = {"Metal", "Plastic", "Paper", "Binder", "Magnetic"};
        String[] paints = {"Oil", "Watercolor", "Acrylic", "Spray", "Latex"};
        String[] wires = {"Copper", "Aluminum", "Fiber", "Steel", "Gold"};
        String[] walls = {"Concrete", "Brick", "Glass", "Wood", "Plaster"};
        String[] papers = {"A4", "Notebook", "Glossy", "Recycled", "Newspaper"};
        String[] posters = {"Movie", "Event", "Educational", "Advertisement", "Art"};
        String[] wallets = {"Leather", "Canvas", "Plastic", "Metal", "Fabric"};
        String[] coins = {"Penny", "Nickel", "Dime", "Quarter", "Rupee"};
        String[] notes = {"$1", "$5", "$10", "$20", "$50"};
        String[] watches = {"Digital", "Analog", "Smart", "Automatic", "Solar"};
        String[] cameras = {"DSLR", "Mirrorless", "Point & Shoot", "Polaroid", "CCTV"};
        String[] games = {"Chess", "Football", "Cricket", "Tennis", "Hockey"};
        String[] bags = {"Backpack", "Messenger", "Duffle", "Tote", "Briefcase"};
        String[] pots = {"Clay", "Metal", "Ceramic", "Glass", "Plastic"};
        String[] routers = {"WiFi 5", "WiFi 6", "Dual-band", "Tri-band", "Mesh"};

    
        System.out.println("Using for loop:");
        for (int i = 0; i < 5; i++) { System.out.println(shirts[i]); }
        for (int i = 0; i < 5; i++) { System.out.println(clips[i]); }
        for (int i = 0; i < 5; i++) { System.out.println(paints[i]); }
        for (int i = 0; i < 5; i++) { System.out.println(wires[i]); }
        for (int i = 0; i < 5; i++) { System.out.println(walls[i]); }
        for (int i = 0; i < 5; i++) { System.out.println(papers[i]); }
        for (int i = 0; i < 5; i++) { System.out.println(posters[i]); }
        for (int i = 0; i < 5; i++) { System.out.println(wallets[i]); }

    
        System.out.println("nUsing for-each loop:");
        for (String item : coins) { System.out.println(item); }
        for (String item : notes) { System.out.println(item); }
        for (String item : watches) { System.out.println(item); }
        for (String item : cameras) { System.out.println(item); }
        for (String item : games) { System.out.println(item); }
        for (String item : bags) { System.out.println(item); }
        for (String item : pots) { System.out.println(item); }
        for (String item : routers) { System.out.println(item); }
    }
}