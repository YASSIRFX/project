package first_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DeviceList {

	private List<Device> maListe;

    public DeviceList() {
        maListe = new ArrayList<>();
    }

    // Fonction pour alimenter la liste avec des objets de type Device
    public void alimenterListe(Device element) {
        maListe.add(element);
    }

    // Fonction pour afficher la liste ligne par ligne
    public void afficherListe() {
        for (Device element : maListe) {
            System.out.println(element);
        }
    }

    // Fonction pour parcourir la liste à l'aide d'un Iterateur
    public void parcourirListeAvecIterateur() {
        Iterator<Device> iterator = maListe.iterator();
        while (iterator.hasNext()) {
            Device element = iterator.next();
            // Faire quelque chose avec l'élément, par exemple, l'afficher
            System.out.println(element);
        }
    }
    
    public void insererElement(int index, Device element) {
        maListe.add(index, element);
    }
    
    public Device recupererElement(int index) {
        return maListe.get(index);
    }
    
    public void supprimerElement(Device element) {
        maListe.remove(element);
    }
    
    public int rechercherElement(Device element) {
        return maListe.indexOf(element);
    }
    
    public void trierListe() {
        Collections.sort(maListe);
    }
    
    public List<Device> copierListeDansTableau() {
        return new ArrayList<>(maListe);
    }
    
    public void melangerListe() {
        Collections.shuffle(maListe);
    }

    
    public void inverserListe() {
        Collections.reverse(maListe);
    }
    
    public List<Device> extrairePartieListe(int debut, int fin) {
        return new ArrayList<>(maListe.subList(debut, fin));
    }
    
    public boolean comparerListes(List<Device> autreListe) {
        return maListe.equals(autreListe);
    }
    
    public void echangerElements(int index1, int index2) {
        Collections.swap(maListe, index1, index2);
    }
    
    public void viderListe() {
        maListe.clear();
    }
    
    public boolean estListeVide() {
        return maListe.isEmpty();
    }


    
}
