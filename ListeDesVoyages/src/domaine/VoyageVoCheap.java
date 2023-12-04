package domaine;

public class VoyageVoCheap extends Voyage {


    public VoyageVoCheap(String destination, IStrategieTransport strategieTransport, String nomDeLaNuitee, String nbEtoilesOuSituation, int nbJours) {
        super(destination, strategieTransport, nomDeLaNuitee, nbEtoilesOuSituation, nbJours);
    }

    @Override
    public String toString() {
        return "Voyage à " + super.getDestination() + " en " + super.getStrategieTransport().toString() + " : " + super.getNbJours() + " jours " + " chez " + super.getNomDeLaNuitee() + " (" + super.getNbEtoilesOuSituation() + ")";
    }
}
