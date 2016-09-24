package collection.example.metier;

public class Personne {
	
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	private String nom;
	private String prenom;
	private int age;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	/**
	 * This method is going to tell how 2 object of this class are equal, in that case we will 
	 * compare the note and if equal we will return true.
	 */
	@Override
	public boolean equals(Object obj) 
	{

		return (this.age ==  ((Personne) obj).getAge());
	}
	
	/**
	 * This method is our own hashmap specially tailored for this class.
	 */
	@Override
	public int hashCode() {
		//System.out.println(nom.hashCode());
		return  age;
		
	}

}
