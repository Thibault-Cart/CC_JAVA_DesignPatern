package domaine;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Voyage {
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    private String destination;          // Destination du voyage

    public void addObserver(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener("ModificationTransport", listener);
        pcs.addPropertyChangeListener("ModificationNuite", listener);
        pcs.addPropertyChangeListener("Modele", listener);
    }

    private IStrategieTransport strategieTransport;   // Stratégie de transport
    private String nomDeLaNuitee;        // Nom de l'hôtel / ou de l'hôte si airbnb
    private String nbEtoilesOuSituation; // nb d'étoiles si Hôtel / situation pour les airbnb

    private int nbJours;                 // nombre de jours du voyage

    public void setStrategieTransport(IStrategieTransport strategieTransport) {
        IStrategieTransport oldStrategieTransport = this.strategieTransport;

        this.strategieTransport = strategieTransport;
        pcs.firePropertyChange("ModificationTransport", oldStrategieTransport, this.strategieTransport);

    }

    public void setNomDeLaNuitee(String nomDeLaNuitee) {
        String oldNomDeLaNuitee = this.nomDeLaNuitee;

        this.nomDeLaNuitee = nomDeLaNuitee;
        pcs.firePropertyChange("ModificationNuite", oldNomDeLaNuitee, this.nomDeLaNuitee);

    }

    public Voyage(String destination, IStrategieTransport strategieTransport, String nomDeLaNuitee, String nbEtoilesOuSituation, int nbJours) {
        this.destination = destination;
        this.strategieTransport = strategieTransport;
        this.nomDeLaNuitee = nomDeLaNuitee;
        this.nbEtoilesOuSituation = nbEtoilesOuSituation;
        this.nbJours = nbJours;
    }

    @Override
    public String toString() {
        return null;
    }

    public String getDestination() {
        return destination;
    }

    public IStrategieTransport getStrategieTransport() {
        return strategieTransport;
    }

    public String getNomDeLaNuitee() {
        return nomDeLaNuitee;
    }

    public String getNbEtoilesOuSituation() {
        return nbEtoilesOuSituation;
    }

    public int getNbJours() {
        return nbJours;
    }
}