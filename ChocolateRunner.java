public class ChocolateRunner{
	public static void main(String[] values){
		String chocolate1="Dairy Milk";
		String chocolate2="Five Star";
		String chocolate3="Kit Kat";
		String chocolate4="Galaxy";
		
		
		String[] chocolate1s={chocolate1, chocolate2, "Milky Bar"};
		String ref = chocolate1s[1];
		System.out.println("Chocolate @ inde 1:"+ ref);
		chocolate1s[2] = "Ecairs";

	}
}