package domaine;


public class StrategieTransportTrain implements IStrategieTransport {

    private String compagnie;

    private String categOuClasse;

    public StrategieTransportTrain(String compagnie, String categOuClasse) {
        this.compagnie = compagnie;
        this.categOuClasse = categOuClasse;
    }

    @Override
    public String toString() {
        return "Train (" + compagnie + ',' + categOuClasse + ')';
    }

    @Override
    public String getCompagnie() {
        return compagnie;
    }

    @Override
    public String getTypeDeTransport() {
        return "Train";
    }

    @Override
    public String getCategOuClasse() {
        return categOuClasse;
    }
}
