package main;

import java.util.ArrayList;
import java.util.List;

import contents.Content;
import contents.ListInhabitant;
import fil.coo.Account;
import fil.coo.City;
import fil.coo.FoolLetter;
import fil.coo.Inhabitant;
import fil.coo.Letter;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		if(args.length == 0) {
			System.out.println("Which simulation ?");
		}else if(args[0].equals("Simulation1")){
			townOne();
		}else if(args[0].equals("Simulation2")){
			townTwo();
		}else {
			System.out.println("Which simulation ?");
		}
	}

	private static void townOne() throws InterruptedException {
		List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		List<Letter<?>> mailbox = new ArrayList<Letter<?>>();
		City V = new City(inhabitants, mailbox, "Townsville");
		int nbrInahbitantSender = 2;
		int nbrDay = 10;

		for(int i=0; i<10; i++)
			inhabitants.add(new Inhabitant(V, new Account(50f)));
				
		while(nbrDay > 0) {
			System.out.println("--------Day"+(11 - nbrDay)+"--------");
			System.out.println("\n>> Letters distributed :\n");
			V.distributeLetters();
			System.out.println("\n>> Letters sended :\n");
			for(int i=0; i<nbrInahbitantSender; i++) {
				Inhabitant sender = V.getRandomInhabitant();
				Inhabitant receiver = V.getRandomInhabitant();;
				while(sender.equals(receiver))
					receiver = V.getRandomInhabitant();
				Letter<? extends Content> letter = V.getLetterRandom(sender, receiver);
				sender.sendLetter(letter);
				System.out.println(letter.getClass());
			}
			Thread.sleep(1500);
			nbrDay--;
		}
	}
	
	private static void townTwo() throws InterruptedException {
		List<Inhabitant> inhabitants = new ArrayList<Inhabitant>();
		List<Letter<?>> mailbox = new ArrayList<Letter<?>>();
		City V = new City(inhabitants, mailbox, "Townsville");
		int cpt = 1;
		for(int i=0; i<50; i++)
			inhabitants.add(new Inhabitant(V, new Account(50f)));
		
		//Send the firt letter
		Inhabitant root = inhabitants.get(0);
		Inhabitant receiver = V.getRandomInhabitant();;
			while(root.equals(receiver))
			receiver = V.getRandomInhabitant();
		List<Inhabitant> listInhabitants = new ArrayList<Inhabitant>();
		while(listInhabitants.size()<5) {
			Inhabitant inhabitant = V.getRandomInhabitant();
			if(!listInhabitants.contains(inhabitant))
				listInhabitants.add(inhabitant);
		}
		root.sendLetter(new FoolLetter(root, receiver, new ListInhabitant(listInhabitants)));
		
		while(!V.getMailbox().isEmpty()) {
			
			System.out.println("--------Day"+cpt+"--------");
			System.out.println("\n>> Letters distributed :\n");
			V.distributeLetters();
			System.out.println("\n>> Letters sended :\n");
			Thread.sleep(2500);
			cpt++;
		}
		Inhabitant winner = V.getRandomInhabitant();
		for(Inhabitant i : inhabitants) {
			System.out.println(i.getAccount().getAmount());
			if(i.getAccount().getAmount()>winner.getAccount().getAmount())
				winner = i;
		}
		System.out.println("END ! \nWinner's account : " + winner.getAccount().getAmount());
	}
}
