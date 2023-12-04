package outils;

import domaine.IStrategieTransport;
import domaine.VoyageFactory;
import domaine.VoyageFactoryVo;

public class Parametres {

    private VoyageFactory voyageFactory;


    public VoyageFactory getVoyageFactory() {
        return voyageFactory;
    }

    private String password;

    private Parametres() {
    }

    public void setVoyageFactory(VoyageFactoryVo voyageFactoryVo) {
        this.voyageFactory = voyageFactoryVo;
    }

    private static class SingletonHolder {
        private final static Parametres uniqueInstance = new Parametres();
    }

    public static Parametres getInstance() {
        return Parametres.SingletonHolder.uniqueInstance;
    }
}
