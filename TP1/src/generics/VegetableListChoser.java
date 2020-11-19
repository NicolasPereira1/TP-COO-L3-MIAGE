package generics;

import scanner.*;
import java.util.*;

public class VegetableListChoser {

    // methode chose
    // elle est similaire a celle de ListChoser simplement elle ne fonctionne
    // qu'avec des listes d'objets de type Legume (cf. interface Legume)
    // quel changement apporter a la methode de ListChoser  ?
	private <T extends Vegetable> T chose(String string, List<T> list) {
		displayMenu(list);
		int scanner = ScannerInt.readInt(list.size()+1);
		if(scanner==0) return null;
		else {
			return list.get(scanner-1);
		}
	}
	
	/**
	 * Display the list
	 * @param list
	 */
	private <T> void displayMenu(List<T> list) {
		for (T t : list) {
			System.out.println(t.toString());
		}
	}
	
    public static void main(String[] args) {
		List<Carrot> lCarrots = new ArrayList<Carrot>();
		lCarrots.add(new Carrot(1));
		lCarrots.add(new Carrot(2));
		lCarrots.add(new Carrot(3));

		List<Apple> lApples = new ArrayList<Apple>();
		lApples.add(new Apple(1));
		lApples.add(new Apple(2));
		lApples.add(new Apple(3));

		VegetableListChoser lcl = new VegetableListChoser();

		Carrot chosenCarrot = lcl.chose("which carrot ? ", lCarrots);
		System.out.println("You have chosen : " + chosenCarrot);

		// NE COMPILE PAS
		// Apple chosenApple = lcl.chose("which apple ? ",lApples);


    }
}
