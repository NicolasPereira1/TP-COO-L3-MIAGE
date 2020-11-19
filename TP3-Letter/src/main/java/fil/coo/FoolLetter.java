package fil.coo;

import java.util.ArrayList;

import contents.ListInhabitant;
import contents.Money;

/**
 * A fool letter contains a list of 4 inhabitants and ask you to send back 5e to theses peoples
 * @author Despelchin and Pereira
 *
 */
public class FoolLetter extends Letter<ListInhabitant> {
	private static final float COST = 0.5f;
	/**
	 * Construct a fool letter
	 * @param sender - the inhabitant sender of the current letter
	 * @param receiver - the inhabitant receiver of the current letter
	 * @param content - the content of the letter
	 */
	public FoolLetter(Inhabitant sender, Inhabitant receiver, ListInhabitant content) {
		super(sender, receiver, content);
	}

	@Override
	public float getCost() {
		return COST;
	}

	@Override
	public void action() {
		sendFiveEuros();
		addHisOwnName();
		sendBack();
	}
	
	public boolean isFoolLetter() {
		return true;
	}
	
	/**
	 * Send 5 euros at the inhabitant in the list
	 */
	private void sendFiveEuros() {
		for (Inhabitant inhabitant : content.getListInhabitants()) {
			BillOfExchange bof = new BillOfExchange(receiver, inhabitant, new Money(5));
			receiver.sendLetter(bof);
		}
	}
	
	/**
	 * Delete the first name of the list and and yourself
	 */
	private void addHisOwnName() {
		content.getListInhabitants().remove(0);
		content.getListInhabitants().add(receiver);		
	}
	
	/**
	 * send the letter to 10 others inhabitants
	 */
	private void sendBack() {
		//Get 10 other inhabitants
		if(receiver.city.inhabitants.size()>10) {
			ArrayList<Inhabitant> inhabitants = new ArrayList<>();
			do {
				Inhabitant inhabitant = receiver.city.getRandomInhabitant();
				if(!inhabitants.contains(inhabitant) && inhabitant!=receiver){
					inhabitants.add(inhabitant);
				}
			}while(inhabitants.size()<10);
			// Send back to the new inhabitants
			for(int i=0; i<inhabitants.size(); i++) {
				receiver.sendLetter(new FoolLetter(receiver, inhabitants.get(i), content));
			}
		}else {
			System.out.println("Not enough inhabitant in the city !");
		}
	}
}
