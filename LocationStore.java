public class LocationStore {
    public static void main(String[] args) {
        // Step 1: Define individual location variables
        String loc1 = "New York";
        String loc2 = "Los Angeles";
        String loc3 = "Chicago";
        String loc4 = "Houston";
        String loc5 = "Phoenix";
        String loc6 = "Philadelphia";
        String loc7 = "San Antonio";
        String loc8 = "San Diego";
        String loc9 = "Dallas";
        String loc10 = "San Jose";
        String loc11 = "Austin";
        String loc12 = "Jacksonville";
        String loc13 = "Fort Worth";
        String loc14 = "Columbus";
        String loc15 = "Charlotte";
        String loc16 = "Indianapolis";
        String loc17 = "San Francisco";
        String loc18 = "Seattle";
        String loc19 = "Denver";
        String loc20 = "Washington D.C.";

        // Step 2: Store all location variables in an array
        String[] locations = {
            loc1, loc2, loc3, loc4, loc5, loc6, loc7, loc8, loc9, loc10,
            loc11, loc12, loc13, loc14, loc15, loc16, loc17, loc18, loc19, loc20
        };

        // Step 3: Print a specific location (example: index 5)
        String ref = locations[5]; // Philadelphia
        System.out.println("Location @ index 5: " + ref);

        // Step 4: Update a location at index 10
        locations[10] = "Las Vegas";

        // Step 5: Print updated location
        System.out.println("Updated Location @ index 10: " + locations[10]);
    }
}
