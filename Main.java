package first_project;

public class Main {

	public static void main(String[] args) {
	    DeviceList maListe = new DeviceList();

	    // Ajouter des éléments à la liste
	    maListe.alimenterListe(new Device("Brand1", "Model1", 2020));
	    maListe.alimenterListe(new Device("Brand2", "Model2", 2021));

	    // Afficher la liste
	    System.out.println("Affichage de la liste :");
	    maListe.afficherListe();

	    // Tester si la liste est vide
	    if (maListe.estListeVide()) {
	        System.out.println("La liste est vide.");
	    } else {
	        System.out.println("La liste n'est pas vide.");
	    }

	    // Vider la liste
	    maListe.viderListe();

	    // Tester à nouveau si la liste est vide
	    if (maListe.estListeVide()) {
	        System.out.println("La liste est vide.");
	    } else {
	        System.out.println("La liste n'est pas vide.");
	    }
	}

}
