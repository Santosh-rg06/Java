class Glass {
    void seller(String name, String address, int contact, String email, String shopName) {
        System.out.println("Seller Info - Name: " + name + ", Address: " + address + ", Contact: " + contact + ", Email: " + email + ", Shop: " + shopName);
    }

    void buyer(String name, String address, int contact, String email, String purpose) {
        System.out.println("Buyer Info - Name: " + name + ", Address: " + address + ", Contact: " + contact + ", Email: " + email + ", Purpose: " + purpose);
    }

    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.seller("Santosh", "India", 987654321, "santu@gmail.com", "John's Glass Store");
        glass.buyer("X-Workz", "LA", 912345678, "x-workz@gmail.com", "Home Window");
    }
}
