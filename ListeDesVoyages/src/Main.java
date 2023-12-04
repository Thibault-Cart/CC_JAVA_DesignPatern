import domaine.VoyageFactoryVo;
import outils.Parametres;

public class Main {
    public static void main(String[] args) {
        Parametres.getInstance().setVoyageFactory(new VoyageFactoryVo());
        new metier.ListeDesVoyages();
    }
}