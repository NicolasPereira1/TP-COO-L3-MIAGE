package fil.coo;

public class MainStudent {
	public static void main(String[] args) {
		Student brice = new Student("Despelchin", "4242XFA");
		Student nicolas = new Student("Pereira", "4242XFB");
		
		System.out.println("Les meilleurs Students sont : \n\n" + brice + "\n\nET\n\n"+ nicolas);
	}
}
