package collection.example;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import collection.example.metier.Personne;

public class Driver {

	// format : le - indique que l'on aligne a gauche, et que l'on va reserver 3 caractere.
 
	public static final String FORMAT = "%-3s | %-6s\n";
	
	public static void main(String[] args) {
		
		System.out.println("--- Creation HasTable ---");
		
		Hashtable<String, String> maTable = new Hashtable<String, String>();
		
		
		System.out.println("--- remplissage de la table ---");
		for(int i =0; i < 200; i++) {
			maTable.put(i + "", "user"+i);
		}
		System.out.println("--- Affichage des cles et des valeurs ---");
		System.out.format(FORMAT ,"Clef","Valeur");
		for(Entry<String, String> current : maTable.entrySet()) {
			System.out.format(FORMAT , current.getKey().toString(), current.getValue().toString());
			
			//System.out.println(current.getKey().toString()+ " | " + current.getValue().toString());
		}
		
		
		System.out.println("-- Demonstration de Equal ---");
		
		Hashtable<String, Personne> mesPersonne = new Hashtable<String, Personne>();
		
		System.out.println("-- Genere les notes ---");
		
		for(int i =0; i < 20; i++) {
			mesPersonne.put(i + "", new Personne("paul", "benoit", i + 10));
		}
		
		System.out.println("-- Genere une note et compare ---");
		
		Personne p1 = new Personne("paul", "benoit", 10);

		
		for(Personne current : mesPersonne.values()) {		
			if(current.equals(p1)) {
				System.out.println("Attention nous avons un doublon dans les notes...");
			}
		}
		
		System.out.println("-- Demonstration de HashCode ---");
		
		Iterator<Entry<String, Personne>> itr = mesPersonne.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getValue().hashCode());
		}
		

		
		
		
		
		
		
		
		

	}

}
