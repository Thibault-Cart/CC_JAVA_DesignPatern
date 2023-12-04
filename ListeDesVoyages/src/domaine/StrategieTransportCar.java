package domaine;

public class StrategieTransportCar implements IStrategieTransport {
    private String compagnie;


    public StrategieTransportCar(String compagnie) {
        this.compagnie = compagnie;

    }

    @Override
    public String toString() {
        return "Car (" + compagnie + ')';
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
        return null;
    }
}
