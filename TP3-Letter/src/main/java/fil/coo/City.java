package fil.coo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import contents.Content;
import contents.Money;
import contents.Text;

/**
 * A city have a list of inhabitants, and a mailbox where the letter the inhabitants write are.
 * @author Despelchin and Pereira
 *
 */
public class City {
	
	protected List<Inhabitant> inhabitants;
	protected List<Letter<?>> mailbox;
	protected String name;
	/**
	 * Creates a city
	 * @param inhabitants - the inhabitants of the city
	 * @param mailbox - the mailbox where is the letter the inhabitants wants to send
	 * @param name - the name of the city
	 */
	public City(List<Inhabitant> inhabitants, List<Letter<?>> mailbox, String name) {
		this.inhabitants = inhabitants;
		this.mailbox = mailbox;
		this.name = name;
	}
	
	/**
	 * Add a inhabitant to the city
	 */
	public void addInhabitant(Inhabitant inhabitant) {
		this.inhabitants.add(inhabitant);
	}
	
	/**
	 * Add a letter to the mailbox
	 * @param letter - the letter to add
	 */
	public void addLetter(Letter<?> letter) {
		mailbox.add(letter);
	}
	
	/**
	 * @return the mailbox
	 */
	public List<Letter<?>> getMailbox() {
		return mailbox;
	}

	/**
	 * Distribute all the letter contained on the mailbox
	 */
	public void distributeLetters() {
		List <Letter<?>> postbag = new ArrayList<>(mailbox);
		for(Letter<?> letter : postbag){
			letter.getReceiver().receiveLetter(letter);
			mailbox.remove(letter);
		}
	}
	
	/**
	 * Get a random inhabitant of the city
	 * @return a random inhabitant of the city
	 */
	public Inhabitant getRandomInhabitant() {
		Random r = new Random();
		int number = r.nextInt(inhabitants.size());
		return inhabitants.get(number);
	}
	/**
	 * Get a random letter
	 * @return a random letter with the good sender and reveiver
	 */
	public Letter<? extends Content> getLetterRandom(Inhabitant sender, Inhabitant receiver) {
		int index = (int) (Math.random()*4);
		Letter<? extends Content> letter;
		switch (index) {
			case 0:
				letter = new SimpleLetter(sender, receiver, new Text("Hi ! How are you today my friend ?"));
				break;
			case 1:
				letter = new BillOfExchange(sender, receiver, new Money(10));
				break;
			case 2:
				letter = new RegisteredLetter(new SimpleLetter(sender, receiver, new Text("Man, you will have to anwser me now !")));
				break;
			case 3:
				letter = new UrgentLetter(new SimpleLetter(sender, receiver, new Text("Hi my friend, I really need your help to finish this TP please HELP ME ! :'(")));
				break;

			default:
				letter = null;
				System.out.println("Random error");
				break;
		}
		return letter;
	}
	
}
