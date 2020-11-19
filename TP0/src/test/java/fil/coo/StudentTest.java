package fil.coo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StudentTest {
	 @Test
	 public void sameObject() {
		 Student etudiant1 = new Student("Toto", "42T");
		 Student etudiant2 = etudiant1;
		 assertTrue(etudiant1.equals(etudiant2));
	 }
	 @Test
	 public void sameProperties() {
		 Student etudiant1 = new Student("Toto", "42T");
		 Student etudiant2 = new Student("Toto", "42T");
		 assertTrue(etudiant1.equals(etudiant2));
	 }
	 @Test
	 public void studentNull() {
		 Student etudiant1 = new Student("Toto", "42T");
		 Student etudiant2 = null;
		 assertFalse(etudiant1.equals(etudiant2));
	 }
	 @Test
	 public void differentNames() {
		 Student etudiant1 = new Student("Tato", "42T");
		 Student etudiant2 = new Student("Toto", "42T");
		 assertFalse(etudiant1.equals(etudiant2));
	 }
	 @Test
	 public void differentID() {
		 Student etudiant1 = new Student("Toto", "42T");
		 Student etudiant2 = new Student("Toto", "42X");
		 assertFalse(etudiant1.equals(etudiant2));
	 }
}
