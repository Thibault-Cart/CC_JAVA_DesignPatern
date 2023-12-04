package outils;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class InformerLesClients implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        evt.getSource().toString();
        //check if the event has been fired by the "ModificationTransport" property
        if (evt.getPropertyName().equals("ModificationTransport")) {
            System.out.println("Envoi d'un email au client pour indiquer ce changement : ");
            System.out.println("le voyage : (" + evt.getSource().toString() + " ) a changé le Transport : " + evt.getNewValue() + " AU LIEU DE " + evt.getOldValue());
        }
        //check if the event has been fired by the "ModificationNuite" property
        if (evt.getPropertyName().equals("ModificationNuite")) {
            System.out.println("Envoi d'un email au client pour indiquer ce changement : ");
            System.out.println("le voyage : ( " + evt.getSource().toString() + " ) a changé de Nuite : " + evt.getNewValue() + " AU LIEU DE " + evt.getOldValue());
        }
    }
}