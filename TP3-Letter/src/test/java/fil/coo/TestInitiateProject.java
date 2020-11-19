package fil.coo;

import java.util.ArrayList;

import contents.Text;

public abstract class TestInitiateProject {
	//Define a game to be tested
	protected City city;
	protected ArrayList<Inhabitant> inhabitants;
	protected ArrayList<Letter<?>> mailbox;
	protected Inhabitant billy;
	protected Inhabitant titouan;
	public void setUp() {
		inhabitants = new ArrayList<>();
		mailbox = new ArrayList<>();
		city = new City(inhabitants, mailbox, "London");
		
		billy = new Inhabitant(city, new Account(100));
		titouan = new Inhabitant(city, new Account(10));
		inhabitants.add(billy);
		inhabitants.add(titouan);
	
	}
}
