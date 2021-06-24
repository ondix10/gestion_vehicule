public class Trajet {

    private Chauffeur idChauffeur;
    private String villeDepart;
    private String villeArrivee;
    private double kilometrageDepart;
    private double kilometrageArrivee;
    private Limousine immatriulation;

    public Trajet(Chauffeur idChauffeur, String villeDepart, String villeArrivee, double kilometrageDepart, double kilometrageArrivee, Limousine immatriulation) {
        this.idChauffeur = idChauffeur;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.kilometrageDepart = kilometrageDepart;
        this.kilometrageArrivee = kilometrageArrivee;
        this.immatriulation = immatriulation;
    }

    public Chauffeur getIdChauffeur() {
        return idChauffeur;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public double getKilometrageDepart() {
        return kilometrageDepart;
    }

    public double getKilometrageArrivee() {
        return kilometrageArrivee;
    }

    public Limousine getImmatriulation() {
        return immatriulation;
    }
}
