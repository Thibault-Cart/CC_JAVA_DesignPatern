package domaine;

public class StrategieTransportAvion implements IStrategieTransport {
    private String compagnie;

    private String categOuClasse;

    public StrategieTransportAvion(String compagnie, String categOuClasse) {
        this.compagnie = compagnie;
        this.categOuClasse = categOuClasse;
    }

    @Override
    public String toString() {
        return "Avion (" +
                compagnie + ',' +
                categOuClasse +
                ')';
    }

    @Override
    public String getCompagnie() {
        return compagnie;
    }

    @Override
    public String getTypeDeTransport() {
        return "Avion";
    }

    @Override
    public String getCategOuClasse() {
        return categOuClasse;
    }
}
