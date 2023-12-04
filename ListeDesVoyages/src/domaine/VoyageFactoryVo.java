package domaine;

public class VoyageFactoryVo extends VoyageFactory {

    @Override
    public Voyage getVoyage(String champs[]) {

        String agence = champs[0];
        String destination = champs[1];
        String typeDeTransport = champs[2];
        String compagnie = champs[3];
        String categOuClasse = champs[4];
        String nomDeLaNuitee = champs[5];
        String nbEtoilesOuSituation = champs[6];
        int nbJours = Integer.parseInt(champs[7]);
        IStrategieTransport strategieTransport = null;
        if (agence.equals("VoCheap")) {


            switch (typeDeTransport) {

                case "TRAIN":
                    strategieTransport = new StrategieTransportTrain(compagnie, categOuClasse);
                    break;
                case "CAR":
                    strategieTransport = new StrategieTransportCar(compagnie);
                    break;
            }
            return new VoyageVoCheap(destination, strategieTransport, nomDeLaNuitee, nbEtoilesOuSituation, nbJours);
        } else if (agence.equals("VoLux")) {
            strategieTransport = new StrategieTransportAvion(compagnie, categOuClasse);
            return new VoyageVolux(destination, strategieTransport, nomDeLaNuitee, nbEtoilesOuSituation, nbJours);
        }
        return null;

    }
}
