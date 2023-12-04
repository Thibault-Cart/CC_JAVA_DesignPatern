package metier;

import dao.Bdd;
import domaine.Voyage;

import java.util.ArrayList;
import java.util.List;

/* ************************************************************************
   Indiquez clairement ici les Design Patterns que vous voulez utiliser :
         (par exemple: Singleton pour le point A pour la classe Voyage)

   - Design Pattern: Abstract Factory     pour le point C   pour la classe Voyage
   - Design Pattern: Observer             pour le point i     pour la classe ListeDesVoyages
   - Design Pattern: Strategy             pour le point G     pour la voyages
***************************************************************************/

public class ListeDesVoyages {
    public ListeDesVoyages() {
        // Récupération de la liste des voyages
        ArrayList<Voyage> lstVoyages = (ArrayList<Voyage>) Bdd.getListeDesVoyages();

        // Affichage de la liste des voyages
        System.out.println("Liste des voyages proposés :");
        //Pour chaque voyage dans la liste des voyages
        for (Voyage v : lstVoyages) {
            System.out.println(v);
        }


        System.out.println("\n############# MODIFIACTION DES VOYAGES #############");
        // Modification du transport du premier voyage a Sion pour montrer le fonctionnement du  design pattern Observer
        lstVoyages.get(2).setStrategieTransport(new domaine.StrategieTransportCar("TpgCart"));
        lstVoyages.get(2).setNomDeLaNuitee("Airbnb de Frederic");
        lstVoyages.get(0).setStrategieTransport(new domaine.StrategieTransportAvion("Lufthansa", "Business"));
        lstVoyages.get(3).setNomDeLaNuitee("Le palace du Pharaon");
        System.out.println("\n############# AFFICHAGE APRES LES  MODIFICATIONS #############");
        // affichage apres modification
        System.out.println("\nListe des voyages proposés après modification :");
        for (Voyage v : lstVoyages) {
            System.out.println(v);
        }
    }
}