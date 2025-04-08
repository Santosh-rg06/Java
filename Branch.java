public class Branch {
    static String[] branchNames = {null, null, null};
    static int index = 0;

    public static void addBranch(String branchName) {
        if (branchNames != null) {
            if (index < branchNames.length) {
                branchNames[index] = branchName; 
                System.out.println("Branch name is saved successfully");
                index++; 
            } else {
                System.out.println("Array is full, cannot add more branches");
            }
        }
    }

    public static void main(String[] args) {
        addBranch("CSE");
        addBranch("ECE");
        addBranch("MECH");
        addBranch("CIVIL"); 
    }
}
