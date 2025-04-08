class InstanceDemoRunner {
    public static void main(String[] args) {
        Floor floor1 = new Floor();
        Terrace terrace1 = new Terrace();
        Bed bed1 = new Bed();
        Shirt shirt1 = new Shirt();
        Hanger hanger1 = new Hanger();
        Anchor anchor1 = new Anchor();
        Jamoon jamoon1 = new Jamoon();
        Hair hair1 = new Hair();
        IronBox ironBox1 = new IronBox();
        Siren siren1 = new Siren();
        Patient patient1 = new Patient();
        Crane crane1 = new Crane();

       
        floor1.length = 10;
        floor1.breadth = 12;
        floor1.material = "Marble";
        floor1.isTiled = true;

        terrace1.area = 500;
        terrace1.type = "Open";
        terrace1.isOpen = true;
        terrace1.height = 15;

        bed1.size = "Queen";
        bed1.material = "Wood";
        bed1.weight = 60;
        bed1.hasHeadboard = true;

        shirt1.color = "Blue";
        shirt1.size = "M";
        shirt1.brand = "Nike";
        shirt1.price = 1499.99;

        hanger1.material = "Plastic";
        hanger1.capacity = 5;
        hanger1.isFoldable = false;
        hanger1.color = "Black";

        anchor1.weight = 50;
        anchor1.material = "Steel";
        anchor1.isRustProof = true;
        anchor1.length = 10;

        jamoon1.color = "Golden Brown";
        jamoon1.weight = 0.5;
        jamoon1.isSweet = true;
        jamoon1.quantity = 12;

        hair1.type = "Straight";
        hair1.color = "Black";
        hair1.length = 15;
        hair1.isCurly = false;

        ironBox1.brand = "Philips";
        ironBox1.power = 1500;
        ironBox1.isAutomatic = true;
        ironBox1.weight = 2.5;

        siren1.volume = 90;
        siren1.type = "Fire Alarm";
        siren1.isActive = true;
        siren1.frequency = 1500;

        patient1.name = "John Doe";
        patient1.age = 45;
        patient1.disease = "Fever";
        patient1.isAdmitted = false;

        crane1.capacity = 1000;
        crane1.type = "Tower Crane";
        crane1.height = 30;
        crane1.isOperational = true;

       
        System.out.println("Floor Material: " + floor1.material);
        System.out.println("Terrace Type: " + terrace1.type);
        System.out.println("Bed Size: " + bed1.size);
        System.out.println("Shirt Brand: " + shirt1.brand);
        System.out.println("Hanger Material: " + hanger1.material);
        System.out.println("Anchor Weight: " + anchor1.weight);
        System.out.println("Jamoon Quantity: " + jamoon1.quantity);
        System.out.println("Hair Type: " + hair1.type);
        System.out.println("IronBox Brand: " + ironBox1.brand);
        System.out.println("Siren Type: " + siren1.type);
        System.out.println("Patient Name: " + patient1.name);
        System.out.println("Crane Capacity: " + crane1.capacity);
    }
}