package fil.coo;

public class Student {
	private String nom;
	private String numeroEtudiant;
	
	public Student (String nom, String numeroEtudiant) {
		this.nom = nom;
		this.numeroEtudiant = numeroEtudiant;
	}

	/**
	 * @return nom le nom de l'étudiant
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom le nom à définir
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return le numeroEtudiant
	 */
	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}

	/**
	 * @param numeroEtudiant le numero étudiant à définir
	 */
	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}

	/**
	 * @param student
	 * @return true si les objets sont identique
	 */
	public boolean equals(Student student) {
		if(student == null)
			return false;
		if(student != this) {
			if(!student.getNom().equals(nom))
				return false;
			if(!student.getNumeroEtudiant().equals(numeroEtudiant))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Nom : " + nom + "\nNumeroEtudiant : " + numeroEtudiant;
	}
	
	
	
}
