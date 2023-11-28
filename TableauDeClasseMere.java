package first_project;

import java.util.Arrays;

public class TableauDeClasseMere {
 
	private Device[] tableauDevices;
	
	public TableauDeClasseMere(Device[] tableauDevices) {
        this.tableauDevices = Arrays.copyOf(tableauDevices, tableauDevices.length);
    }
	
	 public void trierTableau() {
	        Arrays.sort(tableauDevices);
	    }

	 public void ajouterElement(Device nouvelElement) {
	        tableauDevices = Arrays.copyOf(tableauDevices, tableauDevices.length + 1);
	        tableauDevices[tableauDevices.length - 1] = nouvelElement;
	    }
	 
	 public void supprimerElement(Device elementASupprimer) {
	        int index = -1;
	        for (int i = 0; i < tableauDevices.length; i++) {
	            if (tableauDevices[i].equals(elementASupprimer)) {
	                index = i;
	                break;
	            }
	        }

	        if (index != -1) {
	            System.arraycopy(tableauDevices, index + 1, tableauDevices, index, tableauDevices.length - 1 - index);
	            tableauDevices = Arrays.copyOf(tableauDevices, tableauDevices.length - 1);
	        } else {
	            System.out.println("L'élément n'a pas été trouvé dans le tableau.");
	        }
	        
	 
	  public int compterElements() {
	        return tableauDevices.length;
	        }
	  
	  public void inverserOrdreTableau() {
	        int length = tableauDevices.length;
	        for (int i = 0; i < length / 2; i++) {
	            Device temp = tableauDevices[i];
	            tableauDevices[i] = tableauDevices[length - 1 - i];
	            tableauDevices[length - 1 - i] = temp;
	        }
	    }
	  

	    public void afficherElements() {
	        for (Device device : tableauDevices) {
	            System.out.println(device);
	        }
	    }

	    public Device trouverElementLePlusGrand() {
	        if (tableauDevices.length == 0) {
	            return null;
	        }
	        

	        Device maxElement = tableauDevices[0];
	        for (int i = 1; i < tableauDevices.length; i++) {
	            if (tableauDevices[i].compareTo(maxElement) > 0) {
	                maxElement = tableauDevices[i];
	            }
	        }
	        return maxElement;
	    }
	    

	    public boolean testerEgaliteTableaux(Device[] autreTableau) {
	        return Arrays.equals(tableauDevices, autreTableau);
	    }
	   

}
