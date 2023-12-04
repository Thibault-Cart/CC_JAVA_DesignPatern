package domaine;

public class VoyageVolux extends Voyage {


    public VoyageVolux(String destination, IStrategieTransport strategieTransport, String nomDeLaNuitee, String nbEtoilesOuSituation, int nbJours) {
        super(destination, strategieTransport, nomDeLaNuitee, nbEtoilesOuSituation, nbJours);
    }

    @Override
    public String toString() {
        return "Voyage à " + super.getDestination() + " en " + super.getStrategieTransport().toString() + " : " + super.getNbJours() + " jours " + " à l'hotel " + super.getNomDeLaNuitee() + " (" + super.getNbEtoilesOuSituation() + ")";

    }
}
