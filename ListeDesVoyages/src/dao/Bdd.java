package dao;

import domaine.Voyage;
import domaine.VoyageFactory;
import domaine.VoyageFactoryVo;
import outils.InformerLesClients;
import outils.Parametres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bdd {
    /**
     * @return tout le fichier LstVoyages.csv dans une List<Voyage>
     */
    public static List<Voyage> getListeDesVoyages() {

        // Fabrique de Voyage
        VoyageFactory fabrique = Parametres.getInstance().getVoyageFactory();

        List<Voyage> data = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LstVoyages.csv"));
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] champs = ligne.split(";");
                // Création d'un voyage en utilisant la fabrique
                Voyage v = fabrique.getVoyage(champs);
                // Ajout d'un observateur
                v.addObserver(new InformerLesClients());
                // Ajout du voyage à la liste
                data.add(v);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}