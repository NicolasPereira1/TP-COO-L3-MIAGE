package contents;

import java.util.ArrayList;
import java.util.List;

import fil.coo.Inhabitant;
/**
 * List of Inhabitant 
 * @author Pereira and Despelchin
 *
 */
public class ListInhabitant implements Content{
	private List<Inhabitant> listInhabitants;
	
	/**
	 * Construct a list of inhabitants
	 * @param inhabitants
	 */
	public ListInhabitant(List<Inhabitant> inhabitants) {
		listInhabitants= inhabitants;
	}

	/**
	 * Get the list of inhabitans
	 * @return the listInhabitants
	 */
	public List<Inhabitant> getListInhabitants() {
		return listInhabitants;
	}

	/**
	 * Set the list of inhabitants
	 * @param listInhabitants the listInhabitants to set
	 */
	public void setListInhabitants(List<Inhabitant> listInhabitants) {
		this.listInhabitants = listInhabitants;
	}
	
	
}
